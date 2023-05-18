/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

import Controlador.ed.listas.exception.EmptyException;
import Controlador.ed.listas.listasenlazadas.ListaEnlazada;

/**
 *
 * @author walter
 */
public class Main {
    public static void main(String[] args) throws EmptyException {
        ListaEnlazada<Integer> lista = new ListaEnlazada<>();
        
        lista.insertar(90);
        lista.insertar(23);
        lista.insertar(34);
        lista.insertar(76);
        lista.insertar(21);
        lista.insertar(56);
        
        lista.imprimir();
    }
}
