/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jario
 */
@Entity
@Table(name = "CONTACTENOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contactenos.findAll", query = "SELECT c FROM Contactenos c")
    , @NamedQuery(name = "Contactenos.findByNombres", query = "SELECT c FROM Contactenos c WHERE c.nombres = :nombres")
    , @NamedQuery(name = "Contactenos.findByCorreo", query = "SELECT c FROM Contactenos c WHERE c.correo = :correo")
    , @NamedQuery(name = "Contactenos.findByTelefono", query = "SELECT c FROM Contactenos c WHERE c.telefono = :telefono")})
public class Contactenos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NOMBRES")
    private String nombres;
    @Size(max = 100)
    @Column(name = "CORREO")
    private String correo;
    @Column(name = "TELEFONO")
    private Integer telefono;

    public Contactenos() {
    }

    public Contactenos(String nombres) {
        this.nombres = nombres;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nombres != null ? nombres.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contactenos)) {
            return false;
        }
        Contactenos other = (Contactenos) object;
        if ((this.nombres == null && other.nombres != null) || (this.nombres != null && !this.nombres.equals(other.nombres))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "controller.Contactenos[ nombres=" + nombres + " ]";
    }
    
}
