package Model;

import Model.Productor;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-11-10T04:15:08")
@StaticMetamodel(Contrato.class)
public class Contrato_ { 

    public static volatile SingularAttribute<Contrato, String> descripcion;
    public static volatile SingularAttribute<Contrato, Character> cliente;
    public static volatile SingularAttribute<Contrato, Character> eliminado;
    public static volatile SingularAttribute<Contrato, Date> fechaVencimiento;
    public static volatile SingularAttribute<Contrato, Date> fechaCreacion;
    public static volatile SingularAttribute<Contrato, Productor> idProductor;
    public static volatile SingularAttribute<Contrato, BigDecimal> idContrato;

}