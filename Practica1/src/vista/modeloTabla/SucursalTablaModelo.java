/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.modeloTabla;

import controlador.ed.excepcion.EmptyExcepcion;
import controlador.ed.excepcion.PosicionExcepcion;
import controlador.ed.listas.enlazadas.ListaEnlazada;
import controlador.util.Utilidades;
import javax.swing.table.AbstractTableModel;
import modelo.Sucursal;

/**
 *
 * @author walter
 */
public class SucursalTablaModelo extends AbstractTableModel {

    ListaEnlazada<Sucursal> dato;

    @Override
    public int getRowCount() {
        return dato.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        try {
            Sucursal s = dato.get(fila);

            switch (columna) {
                case 0:
                    return s == null ? "Indefinido" : s.getNombre();
                case 1:
                    return s == null ? "0.0" : Utilidades.promedio(s);
                case 2:
                    return s == null ? "0.0" : Utilidades.totalVentas(s);
            }
        } catch (EmptyExcepcion ex) {
        } catch (PosicionExcepcion ex) {
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nombre";
            case 1:
                return "Promedio";
            case 2:
                return "Total";
        }

        return null;
    }

    public ListaEnlazada<Sucursal> getDato() {
        return dato;
    }

    public void setDato(ListaEnlazada<Sucursal> dato) {
        this.dato = dato;
    }

}

