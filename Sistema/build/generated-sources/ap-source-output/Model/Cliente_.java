package Model;

import Model.ProcesoVenta;
import Model.Venta;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-11-10T04:15:08")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> apellidoPaterno;
    public static volatile SingularAttribute<Cliente, String> segundoNombre;
    public static volatile CollectionAttribute<Cliente, ProcesoVenta> procesoVentaCollection;
    public static volatile SingularAttribute<Cliente, String> primerNombre;
    public static volatile SingularAttribute<Cliente, String> apellidoMaterno;
    public static volatile SingularAttribute<Cliente, String> rut;
    public static volatile SingularAttribute<Cliente, String> password;
    public static volatile SingularAttribute<Cliente, Integer> idCliente;
    public static volatile SingularAttribute<Cliente, Boolean> eliminado;
    public static volatile CollectionAttribute<Cliente, Venta> ventaCollection;
    public static volatile SingularAttribute<Cliente, int> idTipo;
    public static volatile SingularAttribute<Cliente, Integer> telefono;
    public static volatile SingularAttribute<Cliente, String> email;

}