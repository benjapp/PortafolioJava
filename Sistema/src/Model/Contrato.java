/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author STKINDUSTRIES
 */
@Entity
@Table(name = "CONTRATO", catalog = "", schema = "ADMIN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contrato.findAll", query = "SELECT c FROM Contrato c")
    , @NamedQuery(name = "Contrato.findByIdContrato", query = "SELECT c FROM Contrato c WHERE c.idContrato = :idContrato")
    , @NamedQuery(name = "Contrato.findByDescripcion", query = "SELECT c FROM Contrato c WHERE c.descripcion = :descripcion")
    , @NamedQuery(name = "Contrato.findByFechaCreacion", query = "SELECT c FROM Contrato c WHERE c.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "Contrato.findByFechaVencimiento", query = "SELECT c FROM Contrato c WHERE c.fechaVencimiento = :fechaVencimiento")
    , @NamedQuery(name = "Contrato.findByCliente", query = "SELECT c FROM Contrato c WHERE c.cliente = :cliente")
    , @NamedQuery(name = "Contrato.findByEliminado", query = "SELECT c FROM Contrato c WHERE c.eliminado = :eliminado")})
public class Contrato implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_CONTRATO", nullable = false, precision = 38, scale = 0)
    private BigDecimal idContrato;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION", nullable = false, length = 500)
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "FECHA_CREACION", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Basic(optional = false)
    @Column(name = "FECHA_VENCIMIENTO", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVencimiento;
    @Basic(optional = false)
    @Column(name = "CLIENTE", nullable = false)
    private Character cliente;
    @Basic(optional = false)
    @Column(name = "ELIMINADO", nullable = false)
    private Character eliminado;
    @JoinColumn(name = "ID_PRODUCTOR", referencedColumnName = "ID_PRODUCTOR", nullable = false)
    @ManyToOne(optional = false)
    private Productor idProductor;

    public Contrato() {
    }

    public Contrato(BigDecimal idContrato) {
        this.idContrato = idContrato;
    }

    public Contrato(BigDecimal idContrato, String descripcion, Date fechaCreacion, Date fechaVencimiento, Character cliente, Character eliminado) {
        this.idContrato = idContrato;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.fechaVencimiento = fechaVencimiento;
        this.cliente = cliente;
        this.eliminado = eliminado;
    }

    public BigDecimal getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(BigDecimal idContrato) {
        this.idContrato = idContrato;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Character getCliente() {
        return cliente;
    }

    public void setCliente(Character cliente) {
        this.cliente = cliente;
    }

    public Character getEliminado() {
        return eliminado;
    }

    public void setEliminado(Character eliminado) {
        this.eliminado = eliminado;
    }

    public Productor getIdProductor() {
        return idProductor;
    }

    public void setIdProductor(Productor idProductor) {
        this.idProductor = idProductor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idContrato != null ? idContrato.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contrato)) {
            return false;
        }
        Contrato other = (Contrato) object;
        if ((this.idContrato == null && other.idContrato != null) || (this.idContrato != null && !this.idContrato.equals(other.idContrato))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Contrato[ idContrato=" + idContrato + " ]";
    }
    
}
