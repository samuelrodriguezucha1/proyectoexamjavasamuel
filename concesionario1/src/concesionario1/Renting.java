

package concesionario1;

import java.time.LocalDate;




public class Renting extends Venta{
    
    private float cuota;
    private LocalDate fechaFin;
    private int numCuotas;

    public Renting(float cuota, LocalDate fechaFin, int numCuotas, String identificador, float importeTotal, LocalDate fechaInicio, Cliente cliente, Vehiculo vehiculo, Empleado vendedor) {
        super(identificador, importeTotal, fechaInicio, cliente, vehiculo, vendedor);
        this.cuota = cuota;
        this.fechaFin = fechaFin;
        this.numCuotas = numCuotas;
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
        return "Renting{" + super.toString() + "cuota=" + cuota + ", fechaFin=" + fechaFin + ", numCuotas=" + numCuotas + '}';
    }
    
    
    
}
