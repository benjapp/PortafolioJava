package Model;

import Model.Producto;
import Model.Venta;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-11-10T04:15:08")
@StaticMetamodel(DetalleVenta.class)
public class DetalleVenta_ { 

    public static volatile SingularAttribute<DetalleVenta, BigInteger> precio;
    public static volatile SingularAttribute<DetalleVenta, Character> eliminado;
    public static volatile SingularAttribute<DetalleVenta, BigDecimal> idDetalleVenta;
    public static volatile SingularAttribute<DetalleVenta, BigInteger> cantidad;
    public static volatile SingularAttribute<DetalleVenta, Producto> idProducto;
    public static volatile SingularAttribute<DetalleVenta, Venta> idVenta;

}