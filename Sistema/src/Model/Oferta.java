/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author STKINDUSTRIES
 */
@Entity
@Table(name = "OFERTA", catalog = "", schema = "ADMIN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Oferta.findAll", query = "SELECT o FROM Oferta o")
    , @NamedQuery(name = "Oferta.findByIdOferta", query = "SELECT o FROM Oferta o WHERE o.idOferta = :idOferta")
    , @NamedQuery(name = "Oferta.findByValorKm", query = "SELECT o FROM Oferta o WHERE o.valorKm = :valorKm")
    , @NamedQuery(name = "Oferta.findByRefrigerado", query = "SELECT o FROM Oferta o WHERE o.refrigerado = :refrigerado")
    , @NamedQuery(name = "Oferta.findByTonelaje", query = "SELECT o FROM Oferta o WHERE o.tonelaje = :tonelaje")
    , @NamedQuery(name = "Oferta.findByTamanio", query = "SELECT o FROM Oferta o WHERE o.tamanio = :tamanio")
    , @NamedQuery(name = "Oferta.findByEliminado", query = "SELECT o FROM Oferta o WHERE o.eliminado = :eliminado")})
public class Oferta implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_OFERTA", nullable = false, precision = 38, scale = 0)
    private BigDecimal idOferta;
    @Basic(optional = false)
    @Column(name = "VALOR_KM", nullable = false)
    private BigInteger valorKm;
    @Basic(optional = false)
    @Column(name = "REFRIGERADO", nullable = false)
    private Character refrigerado;
    @Basic(optional = false)
    @Column(name = "TONELAJE", nullable = false)
    private BigInteger tonelaje;
    @Basic(optional = false)
    @Column(name = "TAMANIO", nullable = false)
    private BigInteger tamanio;
    @Basic(optional = false)
    @Column(name = "ELIMINADO", nullable = false)
    private Character eliminado;
    @JoinColumn(name = "ID_SUBASTA", referencedColumnName = "ID_SUBASTA", nullable = false)
    @ManyToOne(optional = false)
    private Subasta idSubasta;
    @JoinColumn(name = "ID_TRANSPORTISTA", referencedColumnName = "ID_TRANSPORTISTA", nullable = false)
    @ManyToOne(optional = false)
    private Transportista idTransportista;

    public Oferta() {
    }

    public Oferta(BigDecimal idOferta) {
        this.idOferta = idOferta;
    }

    public Oferta(BigDecimal idOferta, BigInteger valorKm, Character refrigerado, BigInteger tonelaje, BigInteger tamanio, Character eliminado) {
        this.idOferta = idOferta;
        this.valorKm = valorKm;
        this.refrigerado = refrigerado;
        this.tonelaje = tonelaje;
        this.tamanio = tamanio;
        this.eliminado = eliminado;
    }

    public BigDecimal getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(BigDecimal idOferta) {
        this.idOferta = idOferta;
    }

    public BigInteger getValorKm() {
        return valorKm;
    }

    public void setValorKm(BigInteger valorKm) {
        this.valorKm = valorKm;
    }

    public Character getRefrigerado() {
        return refrigerado;
    }

    public void setRefrigerado(Character refrigerado) {
        this.refrigerado = refrigerado;
    }

    public BigInteger getTonelaje() {
        return tonelaje;
    }

    public void setTonelaje(BigInteger tonelaje) {
        this.tonelaje = tonelaje;
    }

    public BigInteger getTamanio() {
        return tamanio;
    }

    public void setTamanio(BigInteger tamanio) {
        this.tamanio = tamanio;
    }

    public Character getEliminado() {
        return eliminado;
    }

    public void setEliminado(Character eliminado) {
        this.eliminado = eliminado;
    }

    public Subasta getIdSubasta() {
        return idSubasta;
    }

    public void setIdSubasta(Subasta idSubasta) {
        this.idSubasta = idSubasta;
    }

    public Transportista getIdTransportista() {
        return idTransportista;
    }

    public void setIdTransportista(Transportista idTransportista) {
        this.idTransportista = idTransportista;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOferta != null ? idOferta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Oferta)) {
            return false;
        }
        Oferta other = (Oferta) object;
        if ((this.idOferta == null && other.idOferta != null) || (this.idOferta != null && !this.idOferta.equals(other.idOferta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Oferta[ idOferta=" + idOferta + " ]";
    }
    
}
