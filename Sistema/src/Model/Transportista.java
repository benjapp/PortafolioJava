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
@Table(name = "TRANSPORTISTA", catalog = "", schema = "ADMIN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transportista.findAll", query = "SELECT t FROM Transportista t")
    , @NamedQuery(name = "Transportista.findByIdTransportista", query = "SELECT t FROM Transportista t WHERE t.idTransportista = :idTransportista")
    , @NamedQuery(name = "Transportista.findByPrimerNombre", query = "SELECT t FROM Transportista t WHERE t.primerNombre = :primerNombre")
    , @NamedQuery(name = "Transportista.findBySegundoNombre", query = "SELECT t FROM Transportista t WHERE t.segundoNombre = :segundoNombre")
    , @NamedQuery(name = "Transportista.findByApellidoPaterno", query = "SELECT t FROM Transportista t WHERE t.apellidoPaterno = :apellidoPaterno")
    , @NamedQuery(name = "Transportista.findByApellidoMaterno", query = "SELECT t FROM Transportista t WHERE t.apellidoMaterno = :apellidoMaterno")
    , @NamedQuery(name = "Transportista.findByRut", query = "SELECT t FROM Transportista t WHERE t.rut = :rut")
    , @NamedQuery(name = "Transportista.findByEmail", query = "SELECT t FROM Transportista t WHERE t.email = :email")
    , @NamedQuery(name = "Transportista.findByPassword", query = "SELECT t FROM Transportista t WHERE t.password = :password")
    , @NamedQuery(name = "Transportista.findByTelefono", query = "SELECT t FROM Transportista t WHERE t.telefono = :telefono")
    , @NamedQuery(name = "Transportista.findByEliminado", query = "SELECT t FROM Transportista t WHERE t.eliminado = :eliminado")})
public class Transportista implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_TRANSPORTISTA", nullable = false, precision = 38, scale = 0)
    private BigDecimal idTransportista;
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
    @Column(name = "EMAIL", nullable = false, length = 80)
    private String email;
    @Basic(optional = false)
    @Column(name = "PASSWORD", nullable = false, length = 50)
    private String password;
    @Basic(optional = false)
    @Column(name = "TELEFONO", nullable = false)
    private BigInteger telefono;
    @Basic(optional = false)
    @Column(name = "ELIMINADO", nullable = false)
    private Character eliminado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTransportista")
    private Collection<Oferta> ofertaCollection;

    public Transportista() {
    }

    public Transportista(BigDecimal idTransportista) {
        this.idTransportista = idTransportista;
    }

    public Transportista(BigDecimal idTransportista, String primerNombre, String segundoNombre, String apellidoPaterno, String apellidoMaterno, String rut, String email, String password, BigInteger telefono, Character eliminado) {
        this.idTransportista = idTransportista;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.rut = rut;
        this.email = email;
        this.password = password;
        this.telefono = telefono;
        this.eliminado = eliminado;
    }

    public BigDecimal getIdTransportista() {
        return idTransportista;
    }

    public void setIdTransportista(BigDecimal idTransportista) {
        this.idTransportista = idTransportista;
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
    public Collection<Oferta> getOfertaCollection() {
        return ofertaCollection;
    }

    public void setOfertaCollection(Collection<Oferta> ofertaCollection) {
        this.ofertaCollection = ofertaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTransportista != null ? idTransportista.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transportista)) {
            return false;
        }
        Transportista other = (Transportista) object;
        if ((this.idTransportista == null && other.idTransportista != null) || (this.idTransportista != null && !this.idTransportista.equals(other.idTransportista))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Transportista[ idTransportista=" + idTransportista + " ]";
    }
    
}
