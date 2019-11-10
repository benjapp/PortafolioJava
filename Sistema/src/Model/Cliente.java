/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import com.sun.istack.internal.NotNull;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import static org.eclipse.persistence.expressions.ExpressionOperator.NotNull;

/**
 *
 * @author STKINDUSTRIES
 */
@Entity
@Table(name = "CLIENTE", catalog = "", schema = "ADMIN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c")
    , @NamedQuery(name = "Cliente.findByIdCliente", query = "SELECT c FROM Cliente c WHERE c.idCliente = :idCliente")
    , @NamedQuery(name = "Cliente.findByPrimerNombre", query = "SELECT c FROM Cliente c WHERE c.primerNombre = :primerNombre")
    , @NamedQuery(name = "Cliente.findBySegundoNombre", query = "SELECT c FROM Cliente c WHERE c.segundoNombre = :segundoNombre")
    , @NamedQuery(name = "Cliente.findByApellidoPaterno", query = "SELECT c FROM Cliente c WHERE c.apellidoPaterno = :apellidoPaterno")
    , @NamedQuery(name = "Cliente.findByApellidoMaterno", query = "SELECT c FROM Cliente c WHERE c.apellidoMaterno = :apellidoMaterno")
    , @NamedQuery(name = "Cliente.findByRut", query = "SELECT c FROM Cliente c WHERE c.rut = :rut")
    , @NamedQuery(name = "Cliente.findByEmail", query = "SELECT c FROM Cliente c WHERE c.email = :email")
    , @NamedQuery(name = "Cliente.findByPassword", query = "SELECT c FROM Cliente c WHERE c.password = :password")
    , @NamedQuery(name = "Cliente.findByTelefono", query = "SELECT c FROM Cliente c WHERE c.telefono = :telefono")
    , @NamedQuery(name = "Cliente.findByEliminado", query = "SELECT c FROM Cliente c WHERE c.eliminado = :eliminado")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_generator")
    @SequenceGenerator(name="cliente_generator", sequenceName = "SEQ_CLIENTE", allocationSize=1)
    @Column(name = "ID_CLIENTE", nullable = false, precision = 38, scale = 0)
    private int idCliente;
    @Basic(optional = false)
    @Column(name = "PRIMER_NOMBRE", nullable = false, length = 50)
    private String primerNombre;
    @Basic(optional = false)
    @Column(name = "SEGUNDO_NOMBRE", nullable = false, length = 50)
    private String segundoNombre;
    @Basic(optional = false)
    @Column(name = "APELLIDO_PATERNO", nullable = false, length = 50)
    private String apellidoPaterno;
    @Basic(optional = false)
    @Column(name = "APELLIDO_MATERNO", nullable = false, length = 50)
    private String apellidoMaterno;
    @Basic(optional = false)
    @Column(name = "RUT", nullable = false, length = 10)
    private String rut;
    @Basic(optional = false)
    @Column(name = "EMAIL", nullable = false, length = 50)
    private String email;
    @Basic(optional = false)
    @Column(name = "PASSWORD", nullable = false, length = 50)
    private String password;
    @Basic(optional = false)
    @Column(name = "TELEFONO", nullable = false)
    private int telefono;
    @Basic(optional = false)
    @Column(name = "ELIMINADO", nullable = false)
    private boolean eliminado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCliente")
    private Collection<ProcesoVenta> procesoVentaCollection;
    @JoinColumn(name = "ID_TIPO", referencedColumnName = "ID_TIPO", nullable = false)
    @ManyToOne(optional = false)
    private int idTipo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCliente")
    private Collection<Venta> ventaCollection;

    public Cliente() {
    }

    public Cliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente(int idCliente, String primerNombre, String segundoNombre, String apellidoPaterno, String apellidoMaterno, String rut, String email, String password, int telefono, int tipo, boolean eliminado) {
        this.idCliente = idCliente;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.rut = rut;
        this.email = email;
        this.password = password;
        this.telefono = telefono;
        this.idTipo = tipo;
        this.eliminado = eliminado;
    }
    public Cliente(String primerNombre, String segundoNombre, String apellidoPaterno, String apellidoMaterno, String rut, String email, String password, int telefono, int tipo, boolean eliminado) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.rut = rut;
        this.email = email;
        this.password = password;
        this.telefono = telefono;
        this.idTipo = tipo;
        this.eliminado = eliminado;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Boolean getEliminado() {
        return eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }

    @XmlTransient
    public Collection<ProcesoVenta> getProcesoVentaCollection() {
        return procesoVentaCollection;
    }

    public void setProcesoVentaCollection(Collection<ProcesoVenta> procesoVentaCollection) {
        this.procesoVentaCollection = procesoVentaCollection;
    }

    public Integer getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }

    @XmlTransient
    public Collection<Venta> getVentaCollection() {
        return ventaCollection;
    }

    public void setVentaCollection(Collection<Venta> ventaCollection) {
        this.ventaCollection = ventaCollection;
    }

    @Override
    public String toString() {
        return "Model.Cliente[ idCliente=" + idCliente + " ]";
    }
    
}
