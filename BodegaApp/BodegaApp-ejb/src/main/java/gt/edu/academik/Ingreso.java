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
@Table (name= "Ingreso")
public class Ingreso implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column ( name = "Id_Ingreso")
    private Integer idIngreso;
    
    @Column (name = "fecha_de_ingreso")
    private LocalDateTime fechaDeIngreso;
    
    @Column ( name = "Id_Empleado")
    private Integer idEmpleado;
    
    @Column (name = "Id_Orden_de_Compra")
    private Integer idOrdenDeCompra;
    
    @Column (name ="Id_Bodega")
    private Integer idBodega;

    public Integer getIdIngreso() {
        return this.idIngreso;
    }

    public void setIdIngreso(Integer idIngreso) {
        this.idIngreso = idIngreso;
    }

    public LocalDateTime getFechaDeIngreso() {
        return this.fechaDeIngreso;
    }

    public void setFechaDeIngreso(LocalDateTime fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public Integer getIdEmpleado() {
        return this.idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Integer getIdOrdenDeCompra() {
        return this.idOrdenDeCompra;
    }

    public void setIdOrdenDeCompra(Integer idOrdenDeCompra) {
        this.idOrdenDeCompra = idOrdenDeCompra;
    }

    public Integer getIdBodega() {
        return this.idBodega;
    }

    public void setIdBodega(Integer idBodega) {
        this.idBodega = idBodega;
    }
    
    
}
