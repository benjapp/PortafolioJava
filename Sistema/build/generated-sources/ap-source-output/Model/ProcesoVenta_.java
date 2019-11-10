package Model;

import Model.Cliente;
import Model.DetalleProceso;
import Model.Venta;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-11-10T04:15:08")
@StaticMetamodel(ProcesoVenta.class)
public class ProcesoVenta_ { 

    public static volatile CollectionAttribute<ProcesoVenta, DetalleProceso> detalleProcesoCollection;
    public static volatile SingularAttribute<ProcesoVenta, BigInteger> estado;
    public static volatile SingularAttribute<ProcesoVenta, Character> eliminado;
    public static volatile SingularAttribute<ProcesoVenta, Cliente> idCliente;
    public static volatile SingularAttribute<ProcesoVenta, BigDecimal> idProcesoVenta;
    public static volatile SingularAttribute<ProcesoVenta, Date> fechaInicio;
    public static volatile SingularAttribute<ProcesoVenta, Date> fechaTermino;
    public static volatile SingularAttribute<ProcesoVenta, Venta> idVenta;

}