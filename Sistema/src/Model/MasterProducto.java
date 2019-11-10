/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "MASTER_PRODUCTO", catalog = "", schema = "ADMIN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MasterProducto.findAll", query = "SELECT m FROM MasterProducto m")
    , @NamedQuery(name = "MasterProducto.findByIdMasterProducto", query = "SELECT m FROM MasterProducto m WHERE m.idMasterProducto = :idMasterProducto")
    , @NamedQuery(name = "MasterProducto.findByNombreProducto", query = "SELECT m FROM MasterProducto m WHERE m.nombreProducto = :nombreProducto")
    , @NamedQuery(name = "MasterProducto.findByDescripcion", query = "SELECT m FROM MasterProducto m WHERE m.descripcion = :descripcion")
    , @NamedQuery(name = "MasterProducto.findByEliminado", query = "SELECT m FROM MasterProducto m WHERE m.eliminado = :eliminado")})
public class MasterProducto implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_MASTER_PRODUCTO", nullable = false, precision = 38, scale = 0)
    private BigDecimal idMasterProducto;
    @Basic(optional = false)
    @Column(name = "NOMBRE_PRODUCTO", nullable = false, length = 50)
    private String nombreProducto;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION", nullable = false, length = 50)
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "ELIMINADO", nullable = false)
    private Character eliminado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "masterProductoIdProducto")
    private Collection<Producto> productoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMasterProducto")
    private Collection<DetalleProceso> detalleProcesoCollection;

    public MasterProducto() {
    }

    public MasterProducto(BigDecimal idMasterProducto) {
        this.idMasterProducto = idMasterProducto;
    }

    public MasterProducto(BigDecimal idMasterProducto, String nombreProducto, String descripcion, Character eliminado) {
        this.idMasterProducto = idMasterProducto;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.eliminado = eliminado;
    }

    public BigDecimal getIdMasterProducto() {
        return idMasterProducto;
    }

    public void setIdMasterProducto(BigDecimal idMasterProducto) {
        this.idMasterProducto = idMasterProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Character getEliminado() {
        return eliminado;
    }

    public void setEliminado(Character eliminado) {
        this.eliminado = eliminado;
    }

    @XmlTransient
    public Collection<Producto> getProductoCollection() {
        return productoCollection;
    }

    public void setProductoCollection(Collection<Producto> productoCollection) {
        this.productoCollection = productoCollection;
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
        hash += (idMasterProducto != null ? idMasterProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MasterProducto)) {
            return false;
        }
        MasterProducto other = (MasterProducto) object;
        if ((this.idMasterProducto == null && other.idMasterProducto != null) || (this.idMasterProducto != null && !this.idMasterProducto.equals(other.idMasterProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.MasterProducto[ idMasterProducto=" + idMasterProducto + " ]";
    }
    
}
