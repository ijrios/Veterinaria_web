/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.dto;

import java.io.Serializable;
import java.util.Collection;
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
public class TiposId implements Serializable {

    private static final long serialVersionUID = 1L;
   
    private String tipoId;
   
    private String description;
    
    private Collection<Proveedores> proveedoresCollection;
   
    private Collection<Clientes> clientesCollection;

    public TiposId() {
    }

    public TiposId(String tipoId) {
        this.tipoId = tipoId;
    }

    public TiposId(String tipoId, String description) {
        this.tipoId = tipoId;
        this.description = description;
    }

    public String getTipoId() {
        return tipoId;
    }

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlTransient
    public Collection<Proveedores> getProveedoresCollection() {
        return proveedoresCollection;
    }

    public void setProveedoresCollection(Collection<Proveedores> proveedoresCollection) {
        this.proveedoresCollection = proveedoresCollection;
    }

    @XmlTransient
    public Collection<Clientes> getClientesCollection() {
        return clientesCollection;
    }

    public void setClientesCollection(Collection<Clientes> clientesCollection) {
        this.clientesCollection = clientesCollection;
    }

    
}
