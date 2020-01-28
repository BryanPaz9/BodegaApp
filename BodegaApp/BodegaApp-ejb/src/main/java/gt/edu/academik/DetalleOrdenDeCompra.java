/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.academik;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author diego
 */
@Entity
@Table (name = "Detalle_Orden_De_Compra")
public class DetalleOrdenDeCompra implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "Id_Detalle_Orden_De_Compra")
    private Integer idDetalleOrdenDeCompra;
    
    @Column (name = "Id_Producto")
    private Integer idProducto;
    
    @Column ( name ="cantidad")
    private Integer cantidad;

    public Integer getIdDetalleOrdenDeCompra() {
        return this.idDetalleOrdenDeCompra;
    }

    public void setIdDetalleOrdenDeCompra(Integer idDetalleOrdenDeCompra) {
        this.idDetalleOrdenDeCompra = idDetalleOrdenDeCompra;
    }

    public Integer getIdProducto() {
        return this.idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.idDetalleOrdenDeCompra);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DetalleOrdenDeCompra other = (DetalleOrdenDeCompra) obj;
        if (!Objects.equals(this.idDetalleOrdenDeCompra, other.idDetalleOrdenDeCompra)) {
            return false;
        }
        return true;
    }
    
    
}
