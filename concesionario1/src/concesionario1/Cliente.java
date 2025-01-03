


package concesionario1;

import java.time.LocalDate;





public class Cliente extends Persona{
    
    private LocalDate fechaIn;
    private LocalDate fechaF;

    public Cliente(LocalDate fechaIn, LocalDate fechaF, String nombre, String apellido1, String apellido2, String dni, String email, String direccion, String telefono) {
        super(nombre, apellido1, apellido2, dni, email, direccion, telefono);
        this.fechaIn = fechaIn;
        this.fechaF = fechaF;
    }
    public Cliente( String nombre, String apellido1, String apellido2, String dni, String email, String direccion, String telefono) {
        super(nombre, apellido1, apellido2, dni, email, direccion, telefono);
        
    }

    public LocalDate getFechaIn() {
        return fechaIn;
    }

    public void setFechaIn(LocalDate fechaIn) {
        this.fechaIn = fechaIn;
    }

    public LocalDate getFechaF() {
        return fechaF;
    }

    public void setFechaF(LocalDate fechaF) {
        this.fechaF = fechaF;
    }
    
}
