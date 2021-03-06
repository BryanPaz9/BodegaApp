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
@Table (name = "Stock")
public class Stock implements Serializable{
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "Numero_Stock")
    private Integer numeroStock;
    
    @Column ( name =" Id_Bodega")
    private Integer idBodega;
    
    @Column (name= "Id_Codigo_Producto")
    private Integer idCodigoProducto;

    public Integer getNumeroStock() {
        return this.numeroStock;
    }

    public void setNumeroStock(Integer numeroStock) {
        this.numeroStock = numeroStock;
    }

    public Integer getIdBodega() {
        return this.idBodega;
    }

    public void setIdBodega(Integer idBodega) {
        this.idBodega = idBodega;
    }

    public Integer getIdCodigoProducto() {
        return this.idCodigoProducto;
    }

    public void setIdCodigoProducto(Integer idCodigoProducto) {
        this.idCodigoProducto = idCodigoProducto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.numeroStock);
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
        final Stock other = (Stock) obj;
        if (!Objects.equals(this.numeroStock, other.numeroStock)) {
            return false;
        }
        return true;
    }
    
    
    
}
