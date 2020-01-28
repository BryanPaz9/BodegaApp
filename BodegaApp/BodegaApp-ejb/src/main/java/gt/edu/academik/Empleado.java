/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.academik;

import java.io.Serializable;
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
@Table (name= "Empleado")
public class Empleado implements Serializable {
    
    @Id
    @Column (name = "Id_Empleado")
    private Integer idEmpleado;
    
    @Column (name = "Nombre")
    private String nombre;
    
    @Column (name = "Apellido")
    private String apellido;
    
    @Id
    @Column (name = "Area_de_trabajo")
    private String areaDeTrabajo;

    public Integer getIdEmpleado() {
        return this.idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getAreaDeTrabajo() {
        return this.areaDeTrabajo;
    }

    public void setAreaDeTrabajo(String areaDeTrabajo) {
        this.areaDeTrabajo = areaDeTrabajo;
    }

    
}
