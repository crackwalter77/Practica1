/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.ed.excepcion;

/**
 *
 * @author walter
 */
public class PosicionExcepcion extends Exception{

    public PosicionExcepcion() {
        super("Las posicion no existe");
    }

    public PosicionExcepcion(String msg) {
        super(msg);
    }
}