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
@Table(name = "DETALLE_PROCESO", catalog = "", schema = "ADMIN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleProceso.findAll", query = "SELECT d FROM DetalleProceso d")
    , @NamedQuery(name = "DetalleProceso.findByIdDetalleProceso", query = "SELECT d FROM DetalleProceso d WHERE d.idDetalleProceso = :idDetalleProceso")
    , @NamedQuery(name = "DetalleProceso.findByCalidadIdeal", query = "SELECT d FROM DetalleProceso d WHERE d.calidadIdeal = :calidadIdeal")
    , @NamedQuery(name = "DetalleProceso.findByPrecioIdeal", query = "SELECT d FROM DetalleProceso d WHERE d.precioIdeal = :precioIdeal")
    , @NamedQuery(name = "DetalleProceso.findByEliminado", query = "SELECT d FROM DetalleProceso d WHERE d.eliminado = :eliminado")
    , @NamedQuery(name = "DetalleProceso.findByCantidadRequerida", query = "SELECT d FROM DetalleProceso d WHERE d.cantidadRequerida = :cantidadRequerida")})
public class DetalleProceso implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_DETALLE_PROCESO", nullable = false, precision = 38, scale = 0)
    private BigDecimal idDetalleProceso;
    @Basic(optional = false)
    @Column(name = "CALIDAD_IDEAL", nullable = false)
    private BigInteger calidadIdeal;
    @Basic(optional = false)
    @Column(name = "PRECIO_IDEAL", nullable = false)
    private BigInteger precioIdeal;
    @Basic(optional = false)
    @Column(name = "ELIMINADO", nullable = false)
    private Character eliminado;
    @Basic(optional = false)
    @Column(name = "CANTIDAD_REQUERIDA", nullable = false)
    private BigInteger cantidadRequerida;
    @JoinColumn(name = "ID_MASTER_PRODUCTO", referencedColumnName = "ID_MASTER_PRODUCTO", nullable = false)
    @ManyToOne(optional = false)
    private MasterProducto idMasterProducto;
    @JoinColumn(name = "ID_PROCESO_VENTA", referencedColumnName = "ID_PROCESO_VENTA", nullable = false)
    @ManyToOne(optional = false)
    private ProcesoVenta idProcesoVenta;
    @JoinColumn(name = "ID_PRODUCTO", referencedColumnName = "ID_PRODUCTO")
    @ManyToOne
    private Producto idProducto;

    public DetalleProceso() {
    }

    public DetalleProceso(BigDecimal idDetalleProceso) {
        this.idDetalleProceso = idDetalleProceso;
    }

    public DetalleProceso(BigDecimal idDetalleProceso, BigInteger calidadIdeal, BigInteger precioIdeal, Character eliminado, BigInteger cantidadRequerida) {
        this.idDetalleProceso = idDetalleProceso;
        this.calidadIdeal = calidadIdeal;
        this.precioIdeal = precioIdeal;
        this.eliminado = eliminado;
        this.cantidadRequerida = cantidadRequerida;
    }

    public BigDecimal getIdDetalleProceso() {
        return idDetalleProceso;
    }

    public void setIdDetalleProceso(BigDecimal idDetalleProceso) {
        this.idDetalleProceso = idDetalleProceso;
    }

    public BigInteger getCalidadIdeal() {
        return calidadIdeal;
    }

    public void setCalidadIdeal(BigInteger calidadIdeal) {
        this.calidadIdeal = calidadIdeal;
    }

    public BigInteger getPrecioIdeal() {
        return precioIdeal;
    }

    public void setPrecioIdeal(BigInteger precioIdeal) {
        this.precioIdeal = precioIdeal;
    }

    public Character getEliminado() {
        return eliminado;
    }

    public void setEliminado(Character eliminado) {
        this.eliminado = eliminado;
    }

    public BigInteger getCantidadRequerida() {
        return cantidadRequerida;
    }

    public void setCantidadRequerida(BigInteger cantidadRequerida) {
        this.cantidadRequerida = cantidadRequerida;
    }

    public MasterProducto getIdMasterProducto() {
        return idMasterProducto;
    }

    public void setIdMasterProducto(MasterProducto idMasterProducto) {
        this.idMasterProducto = idMasterProducto;
    }

    public ProcesoVenta getIdProcesoVenta() {
        return idProcesoVenta;
    }

    public void setIdProcesoVenta(ProcesoVenta idProcesoVenta) {
        this.idProcesoVenta = idProcesoVenta;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalleProceso != null ? idDetalleProceso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleProceso)) {
            return false;
        }
        DetalleProceso other = (DetalleProceso) object;
        if ((this.idDetalleProceso == null && other.idDetalleProceso != null) || (this.idDetalleProceso != null && !this.idDetalleProceso.equals(other.idDetalleProceso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.DetalleProceso[ idDetalleProceso=" + idDetalleProceso + " ]";
    }
    
}
