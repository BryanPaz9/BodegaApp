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
@Table (name = "Empleado_Cliente")
public class EmpleadoCliente implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name ="Numero")
    private Integer numero;
    
    @Column (name = "Empleado")
    private String empleado;

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getEmpleado() {
        return this.empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }
    
    
}
