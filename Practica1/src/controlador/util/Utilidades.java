/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.util;

import controlador.sd.list.listasenlazadas.NodoLista;
import modelo.Sucursal;
import modelo.Venta;

/**
 *
 * @author walter
 */
public class Utilidades {

    public static Double totalVentas(Sucursal s) {
        if (s.getVentas() == null) {
            return 0.0;
        }

        Double total = 0.0;
        NodoLista<Venta> aux = s.getVentas().getCabecera();

        while (aux != null) {
            total += aux.getInfo().getValor();
            aux = aux.getSig();
        }
        return total;
    }

    public static Double promedio(Sucursal s) {
        Double suma = totalVentas(s);

        if (suma == 0) {
            return suma;
        }

        return suma / (s.getVentas().size());

    }
}
