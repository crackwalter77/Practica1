/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.ed.listas.enlazadas;

/**
 *
 * @author walter
 */
public class NodoLista<E> {

    private E info;
    private NodoLista<E> sig;

    public NodoLista() {
    }

    public NodoLista(E info) {
        this.info = info;
        sig = null;
    }

    public E getInfo() {
        return info;
    }

    public void setInfo(E info) {
        this.info = info;
    }

    public NodoLista<E> getSig() {
        return sig;
    }

    public void setSig(NodoLista<E> sig) {
        this.sig = sig;
    }

}
