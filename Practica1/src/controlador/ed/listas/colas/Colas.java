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

public class Colas<E> {

    private Cola<E> cola;

    public Colas(int top) {
        cola = new Cola(top);
    }

    public void queue(E obj) throws TopeExcepcion {
        cola.queue(obj);
    }

    public E dequeue() throws EmptyExcepcion, PosicionExcepcion {
        return cola.dequeue();
    }

    public int getTop() {
        return cola.getTop();
    }

    public E get(int index) throws EmptyExcepcion, PosicionExcepcion {
        return cola.get(index);
    }
    
    public int size() {
        return cola.size();
    }
}
