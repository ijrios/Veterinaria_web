package udem.edu.co.controller;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import udem.edu.co.controller.TiposId;
import udem.edu.co.controller.Ventas;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-02-22T07:39:22")
@StaticMetamodel(Clientes.class)
public class Clientes_ { 

    public static volatile SingularAttribute<Clientes, String> apellidos;
    public static volatile SingularAttribute<Clientes, Date> fechaIngreso;
    public static volatile SingularAttribute<Clientes, TiposId> tipoId;
    public static volatile SingularAttribute<Clientes, String> direccion;
    public static volatile CollectionAttribute<Clientes, Ventas> ventasCollection;
    public static volatile SingularAttribute<Clientes, Integer> id;
    public static volatile SingularAttribute<Clientes, String> telefono;
    public static volatile SingularAttribute<Clientes, String> nombres;

}