package udem.edu.co.controller;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import udem.edu.co.controller.Clientes;
import udem.edu.co.controller.Productos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-02-19T17:22:51")
@StaticMetamodel(Ventas.class)
public class Ventas_ { 

    public static volatile SingularAttribute<Ventas, Date> fecha;
    public static volatile SingularAttribute<Ventas, Clientes> idCliente;
    public static volatile SingularAttribute<Ventas, Integer> idPago;
    public static volatile SingularAttribute<Ventas, Integer> cantidad;
    public static volatile SingularAttribute<Ventas, Productos> idProducto;

}