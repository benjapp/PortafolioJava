package Model;

import Model.DetalleProceso;
import Model.Producto;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-11-10T04:15:08")
@StaticMetamodel(MasterProducto.class)
public class MasterProducto_ { 

    public static volatile SingularAttribute<MasterProducto, String> descripcion;
    public static volatile CollectionAttribute<MasterProducto, DetalleProceso> detalleProcesoCollection;
    public static volatile SingularAttribute<MasterProducto, BigDecimal> idMasterProducto;
    public static volatile SingularAttribute<MasterProducto, Character> eliminado;
    public static volatile CollectionAttribute<MasterProducto, Producto> productoCollection;
    public static volatile SingularAttribute<MasterProducto, String> nombreProducto;

}