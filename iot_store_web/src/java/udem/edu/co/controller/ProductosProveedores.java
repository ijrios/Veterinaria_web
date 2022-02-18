/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.controller;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jario
 */
@Entity
@Table(name = "PRODUCTOS_PROVEEDORES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductosProveedores.findAll", query = "SELECT p FROM ProductosProveedores p")
    , @NamedQuery(name = "ProductosProveedores.findByIdProducto", query = "SELECT p FROM ProductosProveedores p WHERE p.idProducto = :idProducto")})
public class ProductosProveedores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ID_PRODUCTO")
    private String idProducto;
    @JoinColumn(name = "ID_PRODUCTO", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Productos productos;
    @JoinColumn(name = "ID_PROVEEDOR", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Proveedores idProveedor;

    public ProductosProveedores() {
    }

    public ProductosProveedores(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }

    public Proveedores getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Proveedores idProveedor) {
        this.idProveedor = idProveedor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProducto != null ? idProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductosProveedores)) {
            return false;
        }
        ProductosProveedores other = (ProductosProveedores) object;
        if ((this.idProducto == null && other.idProducto != null) || (this.idProducto != null && !this.idProducto.equals(other.idProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "udem.edu.co.controller.ProductosProveedores[ idProducto=" + idProducto + " ]";
    }
    
}
