/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.dto;


import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author jario
 * @since 27/02/2022
 * @version 4
 * 
 * Esta es una copia de la clase entidad, sin la conexión a la base de datos
 *  
 */
public class Ventas implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer idPago;
    
    private Date fecha;
    
    private int cantidad;
   
    private Clientes idCliente;
    
    private Productos idProducto;

    public Ventas() {
    }

    public Ventas(Integer idPago) {
        this.idPago = idPago;
    }

    public Ventas(Integer idPago, Date fecha, int cantidad) {
        this.idPago = idPago;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }

    public Integer getIdPago() {
        return idPago;
    }

    public void setIdPago(Integer idPago) {
        this.idPago = idPago;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Clientes getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Clientes idCliente) {
        this.idCliente = idCliente;
    }

    public Productos getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Productos idProducto) {
        this.idProducto = idProducto;
    }

}
