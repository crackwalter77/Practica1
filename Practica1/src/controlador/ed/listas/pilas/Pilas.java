/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.ed.listas.pilas;

import controlador.ed.excepcion.EmptyExcepcion;
import controlador.ed.excepcion.PosicionExcepcion;
import controlador.ed.excepcion.TopeExcepcion;

/**
 *
 * @author walter
 */
public class Pilas<E> {

    private Pila<E> pila;

    public Pilas(int top) {
        pila = new Pila<>(top);
    }

    public void push(E obj) throws TopeExcepcion {
        pila.push(obj);
    }

    public E pop() throws EmptyExcepcion, PosicionExcepcion {
        return pila.pop();
    }

    public int getTop() {
        return pila.getTop();
    }
    
    public int size() {
        return pila.size();
    }
    
    public E get(int pos) throws EmptyExcepcion, PosicionExcepcion {
        return pila.get(pos);
    }
}
