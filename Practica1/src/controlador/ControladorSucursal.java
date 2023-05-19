/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import controlador.sd.list.exception.EmptyException;
import controlador.sd.list.exception.PositionException;
import controlador.sd.list.listasenlazadas.ListaEnlazada;
import modelo.EnumMes;
import modelo.Sucursal;
import modelo.Venta;

/**
 *
 * @author migue
 */
public class ControladorSucursal {
    private ListaEnlazada<Sucursal> sucursales;
    private Sucursal sucursal;
    private Venta venta;
    
    public ControladorSucursal () {
        this.sucursales = new ListaEnlazada<>();
    }

    public ListaEnlazada<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(ListaEnlazada<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }
    
    public void registrar() {
        sucursales.insertar(sucursal);
        ListaEnlazada<Venta> ventas = new ListaEnlazada<>();
        
        for (int i = 0; i < 12 ; i++) {
            ventas.insertar(new Venta(i, 0.0, EnumMes.values()[i]));
        }
        sucursal.setVentas(ventas);
        
        sucursales.insertar(sucursal);
        
    }
    
    public void guardarVenta(int pos, double valor) throws EmptyException, PositionException {
        if ( pos >= sucursal.getVentas().size()) {
            if(sucursal != null) {
                sucursal.getVentas().get(pos).setValor(valor);
            } else {
                throw new EmptyException("La sucursal esta vacia");
            }
        } else {
            throw new PositionException("La posicion no existe");
        }
    }
    
}
