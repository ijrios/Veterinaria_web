package udem.edu.co.controller;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import udem.edu.co.controller.Clientes;
import udem.edu.co.controller.Proveedores;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-02-19T17:22:51")
@StaticMetamodel(TiposId.class)
public class TiposId_ { 

    public static volatile SingularAttribute<TiposId, String> tipoId;
    public static volatile CollectionAttribute<TiposId, Proveedores> proveedoresCollection;
    public static volatile SingularAttribute<TiposId, String> description;
    public static volatile CollectionAttribute<TiposId, Clientes> clientesCollection;

}