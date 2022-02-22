/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.dto;

import udem.edu.co.entitys.*;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jario
 */
// facilita la dependencia entre las capas
public class Productos implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String id;
    
    private String descripcion;
    
    private int costo;
    
    private int precio;
    
    private ProductosProveedores productosProveedores;
   
    private Collection<Ventas> ventasCollection;

    public Productos() {
    }

    public Productos(String id) {
        this.id = id;
    }

    public Productos(String id, String descripcion, int costo, int precio) {
        this.id = id;
        this.descripcion = descripcion;
        this.costo = costo;
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public ProductosProveedores getProductosProveedores() {
        return productosProveedores;
    }

    public void setProductosProveedores(ProductosProveedores productosProveedores) {
        this.productosProveedores = productosProveedores;
    }

   
}
