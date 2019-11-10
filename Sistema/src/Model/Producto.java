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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "PRODUCTO", catalog = "", schema = "ADMIN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p")
    , @NamedQuery(name = "Producto.findByIdProducto", query = "SELECT p FROM Producto p WHERE p.idProducto = :idProducto")
    , @NamedQuery(name = "Producto.findByDescripcion", query = "SELECT p FROM Producto p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "Producto.findByTemporada", query = "SELECT p FROM Producto p WHERE p.temporada = :temporada")
    , @NamedQuery(name = "Producto.findByStock", query = "SELECT p FROM Producto p WHERE p.stock = :stock")
    , @NamedQuery(name = "Producto.findByCalidad", query = "SELECT p FROM Producto p WHERE p.calidad = :calidad")
    , @NamedQuery(name = "Producto.findByEliminado", query = "SELECT p FROM Producto p WHERE p.eliminado = :eliminado")
    , @NamedQuery(name = "Producto.findByPrecio", query = "SELECT p FROM Producto p WHERE p.precio = :precio")})
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_PRODUCTO", nullable = false, precision = 38, scale = 0)
    private BigDecimal idProducto;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION", nullable = false, length = 250)
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "TEMPORADA", nullable = false, length = 50)
    private String temporada;
    @Basic(optional = false)
    @Column(name = "STOCK", nullable = false)
    private BigInteger stock;
    @Column(name = "CALIDAD")
    private BigInteger calidad;
    @Basic(optional = false)
    @Column(name = "ELIMINADO", nullable = false)
    private Character eliminado;
    @Basic(optional = false)
    @Column(name = "PRECIO", nullable = false)
    private BigInteger precio;
    @JoinColumn(name = "MASTER_PRODUCTO_ID_PRODUCTO", referencedColumnName = "ID_MASTER_PRODUCTO", nullable = false)
    @ManyToOne(optional = false)
    private MasterProducto masterProductoIdProducto;
    @JoinColumn(name = "ID_PRODUCTOR", referencedColumnName = "ID_PRODUCTOR", nullable = false)
    @ManyToOne(optional = false)
    private Productor idProductor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProducto")
    private Collection<DetalleVenta> detalleVentaCollection;
    @OneToMany(mappedBy = "idProducto")
    private Collection<DetalleProceso> detalleProcesoCollection;

    public Producto() {
    }

    public Producto(BigDecimal idProducto) {
        this.idProducto = idProducto;
    }

    public Producto(BigDecimal idProducto, String descripcion, String temporada, BigInteger stock, Character eliminado, BigInteger precio) {
        this.idProducto = idProducto;
        this.descripcion = descripcion;
        this.temporada = temporada;
        this.stock = stock;
        this.eliminado = eliminado;
        this.precio = precio;
    }

    public BigDecimal getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(BigDecimal idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public BigInteger getStock() {
        return stock;
    }

    public void setStock(BigInteger stock) {
        this.stock = stock;
    }

    public BigInteger getCalidad() {
        return calidad;
    }

    public void setCalidad(BigInteger calidad) {
        this.calidad = calidad;
    }

    public Character getEliminado() {
        return eliminado;
    }

    public void setEliminado(Character eliminado) {
        this.eliminado = eliminado;
    }

    public BigInteger getPrecio() {
        return precio;
    }

    public void setPrecio(BigInteger precio) {
        this.precio = precio;
    }

    public MasterProducto getMasterProductoIdProducto() {
        return masterProductoIdProducto;
    }

    public void setMasterProductoIdProducto(MasterProducto masterProductoIdProducto) {
        this.masterProductoIdProducto = masterProductoIdProducto;
    }

    public Productor getIdProductor() {
        return idProductor;
    }

    public void setIdProductor(Productor idProductor) {
        this.idProductor = idProductor;
    }

    @XmlTransient
    public Collection<DetalleVenta> getDetalleVentaCollection() {
        return detalleVentaCollection;
    }

    public void setDetalleVentaCollection(Collection<DetalleVenta> detalleVentaCollection) {
        this.detalleVentaCollection = detalleVentaCollection;
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
        hash += (idProducto != null ? idProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.idProducto == null && other.idProducto != null) || (this.idProducto != null && !this.idProducto.equals(other.idProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Producto[ idProducto=" + idProducto + " ]";
    }
    
}
