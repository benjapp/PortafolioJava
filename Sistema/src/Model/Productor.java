/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author STKINDUSTRIES
 */
@Entity
@Table(name = "PRODUCTOR", catalog = "", schema = "ADMIN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productor.findAll", query = "SELECT p FROM Productor p")
    , @NamedQuery(name = "Productor.findByIdProductor", query = "SELECT p FROM Productor p WHERE p.idProductor = :idProductor")
    , @NamedQuery(name = "Productor.findByPrimerNombre", query = "SELECT p FROM Productor p WHERE p.primerNombre = :primerNombre")
    , @NamedQuery(name = "Productor.findBySegundoNombre", query = "SELECT p FROM Productor p WHERE p.segundoNombre = :segundoNombre")
    , @NamedQuery(name = "Productor.findByApellidoPaterno", query = "SELECT p FROM Productor p WHERE p.apellidoPaterno = :apellidoPaterno")
    , @NamedQuery(name = "Productor.findByApellidoMaterno", query = "SELECT p FROM Productor p WHERE p.apellidoMaterno = :apellidoMaterno")
    , @NamedQuery(name = "Productor.findByRut", query = "SELECT p FROM Productor p WHERE p.rut = :rut")
    , @NamedQuery(name = "Productor.findByDireccion", query = "SELECT p FROM Productor p WHERE p.direccion = :direccion")
    , @NamedQuery(name = "Productor.findByCorreoElectronico", query = "SELECT p FROM Productor p WHERE p.correoElectronico = :correoElectronico")
    , @NamedQuery(name = "Productor.findByPassword", query = "SELECT p FROM Productor p WHERE p.password = :password")
    , @NamedQuery(name = "Productor.findByTelefono", query = "SELECT p FROM Productor p WHERE p.telefono = :telefono")
    , @NamedQuery(name = "Productor.findByEliminado", query = "SELECT p FROM Productor p WHERE p.eliminado = :eliminado")})
public class Productor implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_PRODUCTOR", nullable = false, precision = 38, scale = 0)
    private BigDecimal idProductor;
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
    @Column(name = "DIRECCION", nullable = false, length = 200)
    private String direccion;
    @Basic(optional = false)
    @Column(name = "CORREO_ELECTRONICO", nullable = false, length = 50)
    private String correoElectronico;
    @Basic(optional = false)
    @Column(name = "PASSWORD", nullable = false, length = 50)
    private String password;
    @Basic(optional = false)
    @Column(name = "TELEFONO", nullable = false)
    private BigInteger telefono;
    @Basic(optional = false)
    @Column(name = "ELIMINADO", nullable = false)
    private Character eliminado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProductor")
    private Collection<Contrato> contratoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProductor")
    private Collection<Producto> productoCollection;

    public Productor() {
    }

    public Productor(BigDecimal idProductor) {
        this.idProductor = idProductor;
    }

    public Productor(BigDecimal idProductor, String primerNombre, String segundoNombre, String apellidoPaterno, String apellidoMaterno, String rut, String direccion, String correoElectronico, String password, BigInteger telefono, Character eliminado) {
        this.idProductor = idProductor;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.rut = rut;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.password = password;
        this.telefono = telefono;
        this.eliminado = eliminado;
    }

    public BigDecimal getIdProductor() {
        return idProductor;
    }

    public void setIdProductor(BigDecimal idProductor) {
        this.idProductor = idProductor;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigInteger getTelefono() {
        return telefono;
    }

    public void setTelefono(BigInteger telefono) {
        this.telefono = telefono;
    }

    public Character getEliminado() {
        return eliminado;
    }

    public void setEliminado(Character eliminado) {
        this.eliminado = eliminado;
    }

    @XmlTransient
    public Collection<Contrato> getContratoCollection() {
        return contratoCollection;
    }

    public void setContratoCollection(Collection<Contrato> contratoCollection) {
        this.contratoCollection = contratoCollection;
    }

    @XmlTransient
    public Collection<Producto> getProductoCollection() {
        return productoCollection;
    }

    public void setProductoCollection(Collection<Producto> productoCollection) {
        this.productoCollection = productoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProductor != null ? idProductor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productor)) {
            return false;
        }
        Productor other = (Productor) object;
        if ((this.idProductor == null && other.idProductor != null) || (this.idProductor != null && !this.idProductor.equals(other.idProductor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Productor[ idProductor=" + idProductor + " ]";
    }
    
}
