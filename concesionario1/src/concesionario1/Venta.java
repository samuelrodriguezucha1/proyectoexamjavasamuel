


package concesionario1;

import java.time.LocalDate;




public class Venta {
    
   protected String identificador;
   protected float importeTotal;
   protected LocalDate fechaInicio;
   protected Cliente cliente;
   protected Vehiculo vehiculo;
   protected Empleado vendedor;
   private static int ultId = 0;

    public Venta(String identificador, float importeTotal, LocalDate fechaInicio, Cliente cliente, Vehiculo vehiculo, Empleado vendedor) {
        
        this.identificador = identificador + "-" + String.valueOf(obtenerId());
        this.importeTotal = importeTotal;
        this.fechaInicio = fechaInicio;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.vendedor = vendedor;
    }
    private int obtenerId(){
        ultId ++;
        return ultId;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public float getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(float importeTotal) {
        this.importeTotal = importeTotal;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Empleado getVendedor() {
        return vendedor;
    }

    public void setVendedor(Empleado vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public String toString() {
        return "Venta{" + "identificador=" + identificador + ", importeTotal=" + importeTotal + ", fechaInicio=" + fechaInicio + ", cliente=" + cliente + ", vehiculo=" + vehiculo + ", vendedor=" + vendedor + '}';
    }
      
    
}
