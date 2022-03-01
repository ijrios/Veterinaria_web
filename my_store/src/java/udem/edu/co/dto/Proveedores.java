/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.dto;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jario
 * @since 27/02/2022
 * @version 4
 * 
 * Esta es una copia de la clase entidad, sin la conexión a la base de datos
 *  
 */
public class Proveedores implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id;
    
    private String nombres;
    
    private String apellidos;
   
    private Date fechaIngreso;
   
    private String direccion;
    
    private String telefono;
    
    private Collection<Productos> productosCollection;
    
    private TiposId tipoId;

    public Proveedores() {
    }

    public Proveedores(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @XmlTransient
    public Collection<Productos> getProductosCollection() {
        return productosCollection;
    }

    public void setProductosCollection(Collection<Productos> productosCollection) {
        this.productosCollection = productosCollection;
    }

    public TiposId getTipoId() {
        return tipoId;
    }

    public void setTipoId(TiposId tipoId) {
        this.tipoId = tipoId;
    }
    
}
