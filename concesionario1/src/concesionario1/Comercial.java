

package concesionario1;

import java.time.LocalDate;



public class Comercial extends Empleado {
    
    private float comision;

    public Comercial(float comision, LocalDate fechaContratacion, LocalDate fechaBaja, float salario, String departamento, String nombre, String apellido1, String apellido2, String dni, String email, String direccion, String telefono) {
        super(fechaContratacion, fechaBaja, salario, departamento, nombre, apellido1, apellido2, dni, email, direccion, telefono);
        this.comision = comision;
    }
    public Comercial(float comision, String nombre, String apellido1, String apellido2, String dni, String email, String direccion, String telefono) {
        super(nombre, apellido1, apellido2, dni, email, direccion, telefono);
        this.comision = comision;
    }

    public float getComision() {
        return comision;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }
    
}
