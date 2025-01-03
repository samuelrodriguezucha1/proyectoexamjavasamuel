
package concesionario1;

import java.time.LocalDate;




public class Administrativo extends Empleado{
    
    public Administrativo(LocalDate fechaContratacion, LocalDate fechaBaja, float salario, String departamento, String nombre, String apellido1, String apellido2, String dni, String email, String direccion, String telefono) {
        super(fechaContratacion, fechaBaja, salario, departamento, nombre, apellido1, apellido2, dni, email, direccion, telefono);
    }
    
     public Administrativo(String nombre, String apellido1, String apellido2, String dni, String email, String direccion, String telefono) {
        super(nombre, apellido1, apellido2, dni, email, direccion, telefono);
    }
}