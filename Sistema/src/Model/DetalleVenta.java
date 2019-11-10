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
@Table(name = "DETALLE_VENTA", catalog = "", schema = "ADMIN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleVenta.findAll", query = "SELECT d FROM DetalleVenta d")
    , @NamedQuery(name = "DetalleVenta.findByIdDetalleVenta", query = "SELECT d FROM DetalleVenta d WHERE d.idDetalleVenta = :idDetalleVenta")
    , @NamedQuery(name = "DetalleVenta.findByPrecio", query = "SELECT d FROM DetalleVenta d WHERE d.precio = :precio")
    , @NamedQuery(name = "DetalleVenta.findByCantidad", query = "SELECT d FROM DetalleVenta d WHERE d.cantidad = :cantidad")
    , @NamedQuery(name = "DetalleVenta.findByEliminado", query = "SELECT d FROM DetalleVenta d WHERE d.eliminado = :eliminado")})
public class DetalleVenta implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_DETALLE_VENTA", nullable = false, precision = 38, scale = 0)
    private BigDecimal idDetalleVenta;
    @Basic(optional = false)
    @Column(name = "PRECIO", nullable = false)
    private BigInteger precio;
    @Basic(optional = false)
    @Column(name = "CANTIDAD", nullable = false)
    private BigInteger cantidad;
    @Basic(optional = false)
    @Column(name = "ELIMINADO", nullable = false)
    private Character eliminado;
    @JoinColumn(name = "ID_PRODUCTO", referencedColumnName = "ID_PRODUCTO", nullable = false)
    @ManyToOne(optional = false)
    private Producto idProducto;
    @JoinColumn(name = "ID_VENTA", referencedColumnName = "ID_VENTA", nullable = false)
    @ManyToOne(optional = false)
    private Venta idVenta;

    public DetalleVenta() {
    }

    public DetalleVenta(BigDecimal idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public DetalleVenta(BigDecimal idDetalleVenta, BigInteger precio, BigInteger cantidad, Character eliminado) {
        this.idDetalleVenta = idDetalleVenta;
        this.precio = precio;
        this.cantidad = cantidad;
        this.eliminado = eliminado;
    }

    public BigDecimal getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(BigDecimal idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public BigInteger getPrecio() {
        return precio;
    }

    public void setPrecio(BigInteger precio) {
        this.precio = precio;
    }

    public BigInteger getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigInteger cantidad) {
        this.cantidad = cantidad;
    }

    public Character getEliminado() {
        return eliminado;
    }

    public void setEliminado(Character eliminado) {
        this.eliminado = eliminado;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    public Venta getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Venta idVenta) {
        this.idVenta = idVenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalleVenta != null ? idDetalleVenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleVenta)) {
            return false;
        }
        DetalleVenta other = (DetalleVenta) object;
        if ((this.idDetalleVenta == null && other.idDetalleVenta != null) || (this.idDetalleVenta != null && !this.idDetalleVenta.equals(other.idDetalleVenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.DetalleVenta[ idDetalleVenta=" + idDetalleVenta + " ]";
    }
    
}
