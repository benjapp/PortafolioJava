package Model;

import Model.Oferta;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-11-10T04:15:08")
@StaticMetamodel(Transportista.class)
public class Transportista_ { 

    public static volatile SingularAttribute<Transportista, String> rut;
    public static volatile SingularAttribute<Transportista, String> apellidoPaterno;
    public static volatile SingularAttribute<Transportista, String> segundoNombre;
    public static volatile SingularAttribute<Transportista, String> password;
    public static volatile SingularAttribute<Transportista, String> primerNombre;
    public static volatile SingularAttribute<Transportista, Character> eliminado;
    public static volatile SingularAttribute<Transportista, BigDecimal> idTransportista;
    public static volatile SingularAttribute<Transportista, BigInteger> telefono;
    public static volatile CollectionAttribute<Transportista, Oferta> ofertaCollection;
    public static volatile SingularAttribute<Transportista, String> email;
    public static volatile SingularAttribute<Transportista, String> apellidoMaterno;

}