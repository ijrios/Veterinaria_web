package udem.edu.co.controller;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import udem.edu.co.controller.ProductosProveedores;
import udem.edu.co.controller.Ventas;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-02-22T07:39:22")
@StaticMetamodel(Productos.class)
public class Productos_ { 

    public static volatile SingularAttribute<Productos, String> descripcion;
    public static volatile SingularAttribute<Productos, Integer> precio;
    public static volatile SingularAttribute<Productos, Integer> costo;
    public static volatile SingularAttribute<Productos, ProductosProveedores> productosProveedores;
    public static volatile CollectionAttribute<Productos, Ventas> ventasCollection;
    public static volatile SingularAttribute<Productos, String> id;

}