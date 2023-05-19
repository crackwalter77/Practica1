/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controlador.dao;

import controlador.sd.list.listasenlazadas.ListaEnlazada;
import java.io.IOException;

/**
 *
 * @author migue
 */
public interface InterfaceDao<T> {

    public void guardar(T obj) throws IOException;

    public void modificar(T obj, Integer pos);

    public ListaEnlazada<T> listar();

    public T get(Integer id);
}
