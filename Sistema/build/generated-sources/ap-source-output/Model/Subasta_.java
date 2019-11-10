package Model;

import Model.Oferta;
import Model.Venta;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-11-10T04:15:08")
@StaticMetamodel(Subasta.class)
public class Subasta_ { 

    public static volatile SingularAttribute<Subasta, Date> fecha;
    public static volatile SingularAttribute<Subasta, BigDecimal> idSubasta;
    public static volatile SingularAttribute<Subasta, Character> eliminado;
    public static volatile SingularAttribute<Subasta, String> tiempo;
    public static volatile SingularAttribute<Subasta, BigInteger> precioFinal;
    public static volatile CollectionAttribute<Subasta, Oferta> ofertaCollection;
    public static volatile SingularAttribute<Subasta, Venta> idVenta;

}