/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controlador.dao;

import controlador.ed.listas.pilas.Pilas;
import java.io.IOException;

/**
 *
 * @author walter
 */
public interface DaoInterfacePilas <T>{
    
    public void gurdar(T obj) throws IOException;
    
    public Pilas<T> listar() throws IOException;
    
}

