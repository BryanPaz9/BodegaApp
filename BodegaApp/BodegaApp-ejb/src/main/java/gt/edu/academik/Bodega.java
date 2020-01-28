/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.academik;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author diego
 */
@Entity
@Table (name = "Bodega") 
public class Bodega implements Serializable {
    @Id
    @Column (name = "Id_Bodega")
    private Integer idBodega;
    
    @Id
    @Column (name = "Nombre")
    private String nombre;
    
    @Column (name = "Id_Empleado")
    private Integer idEmpleado;

    public Integer getIdBodega() {
        return this.idBodega;
    }

    public void setIdBodega(Integer idBodega) {
        this.idBodega = idBodega;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdEmpleado() {
        return this.idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    
    
}
