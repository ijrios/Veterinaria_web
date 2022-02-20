package udem.edu.co.controller;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import udem.edu.co.controller.ProductosProveedores;
import udem.edu.co.controller.TiposId;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-02-19T17:22:51")
@StaticMetamodel(Proveedores.class)
public class Proveedores_ { 

    public static volatile SingularAttribute<Proveedores, Date> fechaIngreso;
    public static volatile CollectionAttribute<Proveedores, ProductosProveedores> productosProveedoresCollection;
    public static volatile SingularAttribute<Proveedores, TiposId> tipoId;
    public static volatile SingularAttribute<Proveedores, String> direccion;
    public static volatile SingularAttribute<Proveedores, Integer> id;
    public static volatile SingularAttribute<Proveedores, String> telefono;
    public static volatile SingularAttribute<Proveedores, String> nombres;

}