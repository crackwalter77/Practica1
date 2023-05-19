/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.dao;

import controlador.sd.list.exception.EmptyException;
import controlador.sd.list.listasenlazadas.ListaEnlazada;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author migue
 */
public class AdaptadorDao<T> implements InterfaceDao{
    private Conexion conex;
    private Class clas;
    private String url;
    
    public AdaptadorDao (Class clas) {
        this.conex = new Conexion();
        this.clas = clas;
        this.url = conex.URL+clas.getSimpleName().toLowerCase()+".json";
    }
    @Override
    public void guardar(Object obj) throws IOException {
        conex.getXstream().alias(clas.getSimpleName().toLowerCase(), clas);
        
        conex.getXstream().toXML(obj, new FileWriter(url));
        System.out.println("Json\n"+ conex.getXstream().toXML(obj));
    }

    @Override
    public void modificar(Object obj, Integer pos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ListaEnlazada listar() {
        ListaEnlazada<T> list = null;
        try {
            list =  (ListaEnlazada<T>) this.conex.getXstream().fromXML(new FileReader(url));
            
            list.imprimir();
        } catch (FileNotFoundException ex) {
        } catch (EmptyException ex) {
        }
        
        return list;
    }

    @Override
    public Object get(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
