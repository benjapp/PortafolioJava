package Model;

import Model.MasterProducto;
import Model.ProcesoVenta;
import Model.Producto;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-11-10T04:15:08")
@StaticMetamodel(DetalleProceso.class)
public class DetalleProceso_ { 

    public static volatile SingularAttribute<DetalleProceso, MasterProducto> idMasterProducto;
    public static volatile SingularAttribute<DetalleProceso, Character> eliminado;
    public static volatile SingularAttribute<DetalleProceso, BigInteger> cantidadRequerida;
    public static volatile SingularAttribute<DetalleProceso, ProcesoVenta> idProcesoVenta;
    public static volatile SingularAttribute<DetalleProceso, BigInteger> calidadIdeal;
    public static volatile SingularAttribute<DetalleProceso, Producto> idProducto;
    public static volatile SingularAttribute<DetalleProceso, BigDecimal> idDetalleProceso;
    public static volatile SingularAttribute<DetalleProceso, BigInteger> precioIdeal;

}