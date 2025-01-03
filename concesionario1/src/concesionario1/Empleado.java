


package concesionario1;

import java.time.LocalDate;




public abstract class Empleado extends Persona {
    
    protected LocalDate fechaContratacion;
    protected LocalDate fechaBaja;
    protected float salario;
    protected String departamento;

    public Empleado(LocalDate fechaContratacion, LocalDate fechaBaja, float salario, String departamento, String nombre, String apellido1, String apellido2, String dni, String email, String direccion, String telefono) {
        super(nombre, apellido1, apellido2, dni, email, direccion, telefono);
        this.fechaContratacion = fechaContratacion;
        this.fechaBaja = fechaBaja;
        this.salario = salario;
        this.departamento = departamento;
    }
    public Empleado( String nombre, String apellido1, String apellido2, String dni, String email, String direccion, String telefono) {
        super(nombre, apellido1, apellido2, dni, email, direccion, telefono);
        
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public LocalDate getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}
