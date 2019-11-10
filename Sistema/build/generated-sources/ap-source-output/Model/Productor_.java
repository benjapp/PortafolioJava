package Model;

import Model.Contrato;
import Model.Producto;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-11-10T04:15:08")
@StaticMetamodel(Productor.class)
public class Productor_ { 

    public static volatile SingularAttribute<Productor, String> apellidoPaterno;
    public static volatile SingularAttribute<Productor, String> segundoNombre;
    public static volatile SingularAttribute<Productor, String> primerNombre;
    public static volatile SingularAttribute<Productor, String> direccion;
    public static volatile SingularAttribute<Productor, BigDecimal> idProductor;
    public static volatile SingularAttribute<Productor, String> apellidoMaterno;
    public static volatile SingularAttribute<Productor, String> rut;
    public static volatile SingularAttribute<Productor, String> password;
    public static volatile SingularAttribute<Productor, Character> eliminado;
    public static volatile CollectionAttribute<Productor, Producto> productoCollection;
    public static volatile SingularAttribute<Productor, BigInteger> telefono;
    public static volatile SingularAttribute<Productor, String> correoElectronico;
    public static volatile CollectionAttribute<Productor, Contrato> contratoCollection;

}