/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.ed.listas.enlazadas;

import controlador.ed.excepcion.EmptyExcepcion;
import controlador.ed.excepcion.PosicionExcepcion;
/**
 *
 * @author walter
 */
public class ListaEnlazada<E> {

    private NodoLista<E> cabecera;
    private Integer size = 0;

    public NodoLista<E> getCabecera() {
        return cabecera;
    }

    public void setCabecera(NodoLista<E> cabecera) {
        this.cabecera = cabecera;
    }

    public boolean isEmpty() {
        return cabecera == null;
    }

    public void insertar(E info) {
        NodoLista<E> nuevo = new NodoLista<>(info);
        if (isEmpty()) {
            this.cabecera = nuevo;
            this.size++;
        } else {
            NodoLista<E> aux = cabecera;
            while (aux.getSig() != null) {
                aux = aux.getSig();
            }
            aux.setSig(nuevo);
            this.size++;
        }
    }

    public void insertarInicio(E info) {
        if (isEmpty()) {
            insertar(info);
        } else {
            NodoLista<E> nuevo = new NodoLista<>(info);
            nuevo.setSig(cabecera);
            cabecera = nuevo;
            size++;
        }
    }

    public void insertarPosicion(E info, Integer pos) throws PosicionExcepcion {
        if (isEmpty()) {
            insertar(info);
        } else if (pos >= 0 && pos < size() && pos == 0) {
            insertarInicio(info);
        } else if (pos >= 0 && pos < size()) {
            NodoLista<E> aux = cabecera;
            NodoLista<E> nuevo = new NodoLista<>(info);
            for (int i = 0; i < (pos - 1); i++) {
                aux = aux.getSig();
            }
            NodoLista<E> sig = aux.getSig();
            aux.setSig(nuevo);
            nuevo.setSig(sig);
            size++;
        } else {
            throw new PosicionExcepcion();
        }

    }

    public E get(Integer pos) throws EmptyExcepcion, PosicionExcepcion {
        if (isEmpty()) {
            throw new EmptyExcepcion();
        } else {
            E dato = null;
            if (pos >= 0 && pos < size()) {
                if (pos == 0) {
                    dato = cabecera.getInfo();
                } else {
                    NodoLista<E> aux = cabecera;
                    for (int i = 0; i < pos; i++) {
                        aux = aux.getSig();
                    }
                    dato = aux.getInfo();
                }
            } else {
                throw new PosicionExcepcion();
            }
            return dato;
        }
    }

    public void modificar(Integer pos, E info) throws EmptyExcepcion, PosicionExcepcion {

        if (isEmpty()) {
            throw new EmptyExcepcion();
        } else {
            if (pos >= 0 && pos < size()) {
                System.out.println("Entre aca");
                if (pos == 0) {
                    this.cabecera.setInfo(info);
                } else {
                    NodoLista<E> aux = cabecera;
                    for (int i = 0; i < pos; i++) {
                        aux = aux.getSig();
                    }
                    aux.setInfo(info);
                }
            } else {
                System.out.println("No entre ;>");
                throw new PosicionExcepcion();
            }
        }
    }

    public E delete(Integer pos) throws EmptyExcepcion, PosicionExcepcion {
        if (isEmpty()) {
            throw new EmptyExcepcion();
        } else {
            E dato = null;
            if (pos >= 0 && pos < size()) {
                if (pos == 0) {
                    dato = cabecera.getInfo();
                    cabecera = cabecera.getSig();
                    size--;
                } else {
                    NodoLista<E> aux = cabecera;
                    for (int i = 0; i < (pos - 1); i++) {
                        aux = aux.getSig();
                    }
                    NodoLista<E> aux1 = aux.getSig();
                    dato = aux1.getInfo();
                    NodoLista<E> proximo = aux.getSig();
                    aux.setSig(proximo.getSig());
                    size--;
                }
            } else {
                throw new PosicionExcepcion();
            }
            return dato;
        }
    }

    public void deleteAll() {
        this.cabecera = null;
    }

    public Integer size() {
        return size;
    }

    public void imprimir() throws EmptyExcepcion {
        if (isEmpty()) {
            throw new EmptyExcepcion();
        } else {
            NodoLista<E> aux = cabecera;
            System.out.println("-------Lista-------");
            for (int i = 0; i < size(); i++) {
                System.out.println(aux.getInfo());
                aux = aux.getSig();
            }
            System.out.println("-------Lista Fin-------");
        }

    }
}

