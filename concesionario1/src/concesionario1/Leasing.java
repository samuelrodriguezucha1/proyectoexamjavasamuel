


package concesionario1;

import java.time.LocalDate;




public class Leasing extends Venta{
    
    private float cuota;
    private LocalDate fechaFin;
    private int numCuotas;
    private boolean opcionCompra;

    public Leasing(String identificador, float importeTotal, LocalDate fechaInicio, Cliente cliente, Vehiculo vehiculo, Empleado vendedor,float cuota,boolean opcionCompra, LocalDate fechaFin, int numCuotas) {
        super(identificador, importeTotal, fechaInicio, cliente, vehiculo, vendedor);
        this.cuota = cuota;
        this.fechaFin = fechaFin;
        this.numCuotas = numCuotas;
        this.opcionCompra = opcionCompra;
    }

    public boolean isOpcionCompra() {
        return opcionCompra;
    }

    public void setOpcionCompra(boolean opcionCompra) {
        this.opcionCompra = opcionCompra;
    }

    public float getCuota() {
        return cuota;
    }

    public void setCuota(float cuota) {
        this.cuota = cuota;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getNumCuotas() {
        return numCuotas;
    }

    public void setNumCuotas(int numCuotas) {
        this.numCuotas = numCuotas;
    }

    @Override
    public String toString() {
        return "Leasing{" + super.datosBase() + ", cuota=" + cuota + ", fechaFin=" + fechaFin + ", numCuotas=" + numCuotas + ", opcionCompra=" + opcionCompra + '}';
    }
    
    
}