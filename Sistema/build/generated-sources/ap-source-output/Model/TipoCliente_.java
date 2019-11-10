package Model;

import Model.Cliente;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-11-10T04:15:08")
@StaticMetamodel(TipoCliente.class)
public class TipoCliente_ { 

    public static volatile SingularAttribute<TipoCliente, String> descripcion;
    public static volatile SingularAttribute<TipoCliente, BigDecimal> idTipo;
    public static volatile CollectionAttribute<TipoCliente, Cliente> clienteCollection;

}