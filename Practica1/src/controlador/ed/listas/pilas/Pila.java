/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.ed.listas.pilas;

import controlador.ed.excepcion.EmptyExcepcion;
import controlador.ed.excepcion.PosicionExcepcion;
import controlador.ed.excepcion.TopeExcepcion;
import controlador.ed.listas.enlazadas.ListaEnlazada;

/**
 *
 * @author walter
 */
public class Pila<E> extends ListaEnlazada<E>{

    private int top;

    public Pila(int top) {
        this.top = top;
    }

    public boolean isFull() {
        return (size()>= top);
    }

    public void push(E info) throws TopeExcepcion {
        if (isFull()) {
            throw new TopeExcepcion();
        }
        insertarInicio(info);
    }

    public E pop() throws EmptyExcepcion, PosicionExcepcion {
        E data = null;
        if (isEmpty()) {
            throw new EmptyExcepcion();
        } else {
            return this.delete(0);
        }
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }
}

