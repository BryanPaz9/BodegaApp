/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.academik;

import java.io.Serializable;
import java.time.LocalDateTime;
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
@Table ( name = "Orden_de_Comppra")
public class OrdenDeCompra implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "Id_Orden_de_Compra")
    private Integer idOrdenDeCompra;
    
    @Column (name = "Id_Proveedor")
    private Integer idProveedor;
    
    @Column (name ="Id_Detalle_Orden_de_Compra")
    private Integer idDetalleOrdenDeCompra;
    
    @Column (name ="Fecha_de_compra")
    private LocalDateTime fechaDeCompra;

    public Integer getIdOrdenDeCompra() {
        return this.idOrdenDeCompra;
    }

    public void setIdOrdenDeCompra(Integer idOrdenDeCompra) {
        this.idOrdenDeCompra = idOrdenDeCompra;
    }

    public Integer getIdProveedor() {
        return this.idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Integer getIdDetalleOrdenDeCompra() {
        return this.idDetalleOrdenDeCompra;
    }

    public void setIdDetalleOrdenDeCompra(Integer idDetalleOrdenDeCompra) {
        this.idDetalleOrdenDeCompra = idDetalleOrdenDeCompra;
    }

    public LocalDateTime getFechaDeCompra() {
        return this.fechaDeCompra;
    }

    public void setFechaDeCompra(LocalDateTime fechaDeCompra) {
        this.fechaDeCompra = fechaDeCompra;
    }
}
