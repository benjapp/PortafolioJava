package Model;

import Model.Subasta;
import Model.Transportista;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-11-10T04:15:08")
@StaticMetamodel(Oferta.class)
public class Oferta_ { 

    public static volatile SingularAttribute<Oferta, BigInteger> tonelaje;
    public static volatile SingularAttribute<Oferta, Subasta> idSubasta;
    public static volatile SingularAttribute<Oferta, Character> refrigerado;
    public static volatile SingularAttribute<Oferta, Character> eliminado;
    public static volatile SingularAttribute<Oferta, BigInteger> tamanio;
    public static volatile SingularAttribute<Oferta, Transportista> idTransportista;
    public static volatile SingularAttribute<Oferta, BigDecimal> idOferta;
    public static volatile SingularAttribute<Oferta, BigInteger> valorKm;

}