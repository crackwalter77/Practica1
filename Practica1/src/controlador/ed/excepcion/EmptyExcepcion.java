/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package controlador.ed.excepcion;

/**
 *
 * @author walter
 */
public class EmptyExcepcion extends Exception{

    public EmptyExcepcion() {
        super("La posicion no existe");
    }

    public EmptyExcepcion(String msg) {
        super(msg);
    }
}