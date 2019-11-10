package Model;

import Model.Cliente;
import Model.DetalleVenta;
import Model.ProcesoVenta;
import Model.Subasta;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-11-10T04:15:08")
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, Date> fecha;
    public static volatile CollectionAttribute<Venta, ProcesoVenta> procesoVentaCollection;
    public static volatile SingularAttribute<Venta, Character> eliminado;
    public static volatile SingularAttribute<Venta, Cliente> idCliente;
    public static volatile SingularAttribute<Venta, BigInteger> idProcesoVenta;
    public static volatile CollectionAttribute<Venta, Subasta> subastaCollection;
    public static volatile SingularAttribute<Venta, BigDecimal> idVenta;
    public static volatile CollectionAttribute<Venta, DetalleVenta> detalleVentaCollection;

}