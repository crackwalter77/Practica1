/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.ed.listas.colas;

/**
 *
 * @author walter
 */

import controlador.ed.excepcion.EmptyExcepcion;
import controlador.ed.excepcion.PosicionExcepcion;
import controlador.ed.excepcion.TopeExcepcion;
import controlador.ed.listas.enlazadas.ListaEnlazada;

public class Cola<E> extends ListaEnlazada<E>{

    private int tope;

    public Cola(int tope) {
        this.tope = tope;
    }

    public boolean isFull() {
        return (size() >= tope);
    }

    public void queue(E data) throws TopeExcepcion {
        if (isFull()) {
            throw new TopeExcepcion("La cola esta llena");
        }

        this.insertar(data);
    }

    public E dequeue() throws EmptyExcepcion, PosicionExcepcion {
        if (isEmpty()) {
            throw new EmptyExcepcion("La cola vacia");
        }

        return this.delete(0);
    }

    public int getTop() {
        return this.tope;
    }
}
