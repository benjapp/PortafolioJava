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
@Table(name = "PROCESO_VENTA", catalog = "", schema = "ADMIN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProcesoVenta.findAll", query = "SELECT p FROM ProcesoVenta p")
    , @NamedQuery(name = "ProcesoVenta.findByIdProcesoVenta", query = "SELECT p FROM ProcesoVenta p WHERE p.idProcesoVenta = :idProcesoVenta")
    , @NamedQuery(name = "ProcesoVenta.findByFechaInicio", query = "SELECT p FROM ProcesoVenta p WHERE p.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "ProcesoVenta.findByFechaTermino", query = "SELECT p FROM ProcesoVenta p WHERE p.fechaTermino = :fechaTermino")
    , @NamedQuery(name = "ProcesoVenta.findByEstado", query = "SELECT p FROM ProcesoVenta p WHERE p.estado = :estado")
    , @NamedQuery(name = "ProcesoVenta.findByEliminado", query = "SELECT p FROM ProcesoVenta p WHERE p.eliminado = :eliminado")})
public class ProcesoVenta implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_PROCESO_VENTA", nullable = false, precision = 38, scale = 0)
    private BigDecimal idProcesoVenta;
    @Basic(optional = false)
    @Column(name = "FECHA_INICIO", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Column(name = "FECHA_TERMINO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaTermino;
    @Basic(optional = false)
    @Column(name = "ESTADO", nullable = false)
    private BigInteger estado;
    @Basic(optional = false)
    @Column(name = "ELIMINADO", nullable = false)
    private Character eliminado;
    @JoinColumn(name = "ID_CLIENTE", referencedColumnName = "ID_CLIENTE", nullable = false)
    @ManyToOne(optional = false)
    private Cliente idCliente;
    @JoinColumn(name = "ID_VENTA", referencedColumnName = "ID_VENTA")
    @ManyToOne
    private Venta idVenta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProcesoVenta")
    private Collection<DetalleProceso> detalleProcesoCollection;

    public ProcesoVenta() {
    }

    public ProcesoVenta(BigDecimal idProcesoVenta) {
        this.idProcesoVenta = idProcesoVenta;
    }

    public ProcesoVenta(BigDecimal idProcesoVenta, Date fechaInicio, BigInteger estado, Character eliminado) {
        this.idProcesoVenta = idProcesoVenta;
        this.fechaInicio = fechaInicio;
        this.estado = estado;
        this.eliminado = eliminado;
    }

    public BigDecimal getIdProcesoVenta() {
        return idProcesoVenta;
    }

    public void setIdProcesoVenta(BigDecimal idProcesoVenta) {
        this.idProcesoVenta = idProcesoVenta;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(Date fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    public BigInteger getEstado() {
        return estado;
    }

    public void setEstado(BigInteger estado) {
        this.estado = estado;
    }

    public Character getEliminado() {
        return eliminado;
    }

    public void setEliminado(Character eliminado) {
        this.eliminado = eliminado;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public Venta getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Venta idVenta) {
        this.idVenta = idVenta;
    }

    @XmlTransient
    public Collection<DetalleProceso> getDetalleProcesoCollection() {
        return detalleProcesoCollection;
    }

    public void setDetalleProcesoCollection(Collection<DetalleProceso> detalleProcesoCollection) {
        this.detalleProcesoCollection = detalleProcesoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProcesoVenta != null ? idProcesoVenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProcesoVenta)) {
            return false;
        }
        ProcesoVenta other = (ProcesoVenta) object;
        if ((this.idProcesoVenta == null && other.idProcesoVenta != null) || (this.idProcesoVenta != null && !this.idProcesoVenta.equals(other.idProcesoVenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.ProcesoVenta[ idProcesoVenta=" + idProcesoVenta + " ]";
    }
    
}
