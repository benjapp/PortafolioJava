package Model;

import Model.DetalleProceso;
import Model.DetalleVenta;
import Model.MasterProducto;
import Model.Productor;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-11-10T04:15:08")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, String> descripcion;
    public static volatile CollectionAttribute<Producto, DetalleProceso> detalleProcesoCollection;
    public static volatile SingularAttribute<Producto, BigInteger> precio;
    public static volatile SingularAttribute<Producto, Character> eliminado;
    public static volatile SingularAttribute<Producto, String> temporada;
    public static volatile SingularAttribute<Producto, MasterProducto> masterProductoIdProducto;
    public static volatile SingularAttribute<Producto, Productor> idProductor;
    public static volatile SingularAttribute<Producto, BigDecimal> idProducto;
    public static volatile SingularAttribute<Producto, BigInteger> stock;
    public static volatile SingularAttribute<Producto, BigInteger> calidad;
    public static volatile CollectionAttribute<Producto, DetalleVenta> detalleVentaCollection;

}