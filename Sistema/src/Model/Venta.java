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
@Table(name = "VENTA", catalog = "", schema = "ADMIN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Venta.findAll", query = "SELECT v FROM Venta v")
    , @NamedQuery(name = "Venta.findByIdVenta", query = "SELECT v FROM Venta v WHERE v.idVenta = :idVenta")
    , @NamedQuery(name = "Venta.findByIdProcesoVenta", query = "SELECT v FROM Venta v WHERE v.idProcesoVenta = :idProcesoVenta")
    , @NamedQuery(name = "Venta.findByFecha", query = "SELECT v FROM Venta v WHERE v.fecha = :fecha")
    , @NamedQuery(name = "Venta.findByEliminado", query = "SELECT v FROM Venta v WHERE v.eliminado = :eliminado")})
public class Venta implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_VENTA", nullable = false, precision = 38, scale = 0)
    private BigDecimal idVenta;
    @Basic(optional = false)
    @Column(name = "ID_PROCESO_VENTA", nullable = false)
    private BigInteger idProcesoVenta;
    @Basic(optional = false)
    @Column(name = "FECHA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "ELIMINADO", nullable = false)
    private Character eliminado;
    @OneToMany(mappedBy = "idVenta")
    private Collection<ProcesoVenta> procesoVentaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idVenta")
    private Collection<Subasta> subastaCollection;
    @JoinColumn(name = "ID_CLIENTE", referencedColumnName = "ID_CLIENTE", nullable = false)
    @ManyToOne(optional = false)
    private Cliente idCliente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idVenta")
    private Collection<DetalleVenta> detalleVentaCollection;

    public Venta() {
    }

    public Venta(BigDecimal idVenta) {
        this.idVenta = idVenta;
    }

    public Venta(BigDecimal idVenta, BigInteger idProcesoVenta, Date fecha, Character eliminado) {
        this.idVenta = idVenta;
        this.idProcesoVenta = idProcesoVenta;
        this.fecha = fecha;
        this.eliminado = eliminado;
    }

    public BigDecimal getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(BigDecimal idVenta) {
        this.idVenta = idVenta;
    }

    public BigInteger getIdProcesoVenta() {
        return idProcesoVenta;
    }

    public void setIdProcesoVenta(BigInteger idProcesoVenta) {
        this.idProcesoVenta = idProcesoVenta;
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

    @XmlTransient
    public Collection<ProcesoVenta> getProcesoVentaCollection() {
        return procesoVentaCollection;
    }

    public void setProcesoVentaCollection(Collection<ProcesoVenta> procesoVentaCollection) {
        this.procesoVentaCollection = procesoVentaCollection;
    }

    @XmlTransient
    public Collection<Subasta> getSubastaCollection() {
        return subastaCollection;
    }

    public void setSubastaCollection(Collection<Subasta> subastaCollection) {
        this.subastaCollection = subastaCollection;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    @XmlTransient
    public Collection<DetalleVenta> getDetalleVentaCollection() {
        return detalleVentaCollection;
    }

    public void setDetalleVentaCollection(Collection<DetalleVenta> detalleVentaCollection) {
        this.detalleVentaCollection = detalleVentaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVenta != null ? idVenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Venta)) {
            return false;
        }
        Venta other = (Venta) object;
        if ((this.idVenta == null && other.idVenta != null) || (this.idVenta != null && !this.idVenta.equals(other.idVenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Venta[ idVenta=" + idVenta + " ]";
    }
    
}
