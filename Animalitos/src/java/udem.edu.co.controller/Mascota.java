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
@Table(name = "MASCOTA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mascota.findAll", query = "SELECT m FROM Mascota m")
    , @NamedQuery(name = "Mascota.findByIdpet", query = "SELECT m FROM Mascota m WHERE m.idpet = :idpet")
    , @NamedQuery(name = "Mascota.findByUsers", query = "SELECT m FROM Mascota m WHERE m.users = :users")
    , @NamedQuery(name = "Mascota.findByNombre", query = "SELECT m FROM Mascota m WHERE m.nombre = :nombre")
    , @NamedQuery(name = "Mascota.findByContrase\u00f1a", query = "SELECT m FROM Mascota m WHERE m.contrase\u00f1a = :contrase\u00f1a")
    , @NamedQuery(name = "Mascota.findByDue\u00f1o", query = "SELECT m FROM Mascota m WHERE m.due\u00f1o = :due\u00f1o")})
public class Mascota implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPET")
    private Integer idpet;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "USERS")
    private String users;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "CONTRASE\u00d1A")
    private String contraseña;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "DUE\u00d1O")
    private String dueño;

    public Mascota() {
    }

    public Mascota(Integer idpet) {
        this.idpet = idpet;
    }

    public Mascota(Integer idpet, String users, String nombre, String contraseña, String dueño) {
        this.idpet = idpet;
        this.users = users;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.dueño = dueño;
    }

    public Integer getIdpet() {
        return idpet;
    }

    public void setIdpet(Integer idpet) {
        this.idpet = idpet;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpet != null ? idpet.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mascota)) {
            return false;
        }
        Mascota other = (Mascota) object;
        if ((this.idpet == null && other.idpet != null) || (this.idpet != null && !this.idpet.equals(other.idpet))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "controller.Mascota[ idpet=" + idpet + " ]";
    }
    
}
