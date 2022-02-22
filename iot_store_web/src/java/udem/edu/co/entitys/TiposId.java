/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.controller;

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
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jario
 */
@Entity
@Table(name = "TIPOS_ID")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TiposId.findAll", query = "SELECT t FROM TiposId t")
    , @NamedQuery(name = "TiposId.findByTipoId", query = "SELECT t FROM TiposId t WHERE t.tipoId = :tipoId")
    , @NamedQuery(name = "TiposId.findByDescription", query = "SELECT t FROM TiposId t WHERE t.description = :description")})
public class TiposId implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "TIPO_ID")
    private String tipoId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "DESCRIPTION")
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoId")
    private Collection<Clientes> clientesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoId")
    private Collection<Proveedores> proveedoresCollection;

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
    public Collection<Clientes> getClientesCollection() {
        return clientesCollection;
    }

    public void setClientesCollection(Collection<Clientes> clientesCollection) {
        this.clientesCollection = clientesCollection;
    }

    @XmlTransient
    public Collection<Proveedores> getProveedoresCollection() {
        return proveedoresCollection;
    }

    public void setProveedoresCollection(Collection<Proveedores> proveedoresCollection) {
        this.proveedoresCollection = proveedoresCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipoId != null ? tipoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposId)) {
            return false;
        }
        TiposId other = (TiposId) object;
        if ((this.tipoId == null && other.tipoId != null) || (this.tipoId != null && !this.tipoId.equals(other.tipoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "udem.edu.co.controller.TiposId[ tipoId=" + tipoId + " ]";
    }
    
}
