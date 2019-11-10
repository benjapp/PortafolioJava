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
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author STKINDUSTRIES
 */
@Entity
@Table(name = "SUBASTA", catalog = "", schema = "ADMIN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Subasta.findAll", query = "SELECT s FROM Subasta s")
    , @NamedQuery(name = "Subasta.findByIdSubasta", query = "SELECT s FROM Subasta s WHERE s.idSubasta = :idSubasta")
    , @NamedQuery(name = "Subasta.findByTiempo", query = "SELECT s FROM Subasta s WHERE s.tiempo = :tiempo")
    , @NamedQuery(name = "Subasta.findByPrecioFinal", query = "SELECT s FROM Subasta s WHERE s.precioFinal = :precioFinal")
    , @NamedQuery(name = "Subasta.findByFecha", query = "SELECT s FROM Subasta s WHERE s.fecha = :fecha")
    , @NamedQuery(name = "Subasta.findByEliminado", query = "SELECT s FROM Subasta s WHERE s.eliminado = :eliminado")})
public class Subasta implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_SUBASTA", nullable = false, precision = 38, scale = 0)
    private BigDecimal idSubasta;
    @Basic(optional = false)
    @Column(name = "TIEMPO", nullable = false, length = 20)
    private String tiempo;
    @Basic(optional = false)
    @Column(name = "PRECIO_FINAL", nullable = false)
    private BigInteger precioFinal;
    @Basic(optional = false)
    @Column(name = "FECHA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "ELIMINADO", nullable = false)
    private Character eliminado;
    @JoinColumn(name = "ID_VENTA", referencedColumnName = "ID_VENTA", nullable = false)
    @ManyToOne(optional = false)
    private Venta idVenta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSubasta")
    private Collection<Oferta> ofertaCollection;

    public Subasta() {
    }

    public Subasta(BigDecimal idSubasta) {
        this.idSubasta = idSubasta;
    }

    public Subasta(BigDecimal idSubasta, String tiempo, BigInteger precioFinal, Date fecha, Character eliminado) {
        this.idSubasta = idSubasta;
        this.tiempo = tiempo;
        this.precioFinal = precioFinal;
        this.fecha = fecha;
        this.eliminado = eliminado;
    }

    public BigDecimal getIdSubasta() {
        return idSubasta;
    }

    public void setIdSubasta(BigDecimal idSubasta) {
        this.idSubasta = idSubasta;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public BigInteger getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(BigInteger precioFinal) {
        this.precioFinal = precioFinal;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Character getEliminado() {
        return eliminado;
    }

    public void setEliminado(Character eliminado) {
        this.eliminado = eliminado;
    }

    public Venta getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Venta idVenta) {
        this.idVenta = idVenta;
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
        hash += (idSubasta != null ? idSubasta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subasta)) {
            return false;
        }
        Subasta other = (Subasta) object;
        if ((this.idSubasta == null && other.idSubasta != null) || (this.idSubasta != null && !this.idSubasta.equals(other.idSubasta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Subasta[ idSubasta=" + idSubasta + " ]";
    }
    
}
