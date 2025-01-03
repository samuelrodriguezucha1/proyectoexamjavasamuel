


package concesionario1;



public class Turismo extends Vehiculo {
    public Turismo (String id, String marca, String modelo, int año, String color, TipoCombustion tipoCombustion){
        super (id, marca, modelo, año, color, tipoCombustion);
        
    }

    public Turismo(String id, String marca, String modelo, int año, String color, float precio, TipoCombustion tipoCombustion, String matricula) {
        super(id, marca, modelo, año, color, precio, tipoCombustion, matricula);
    }
    
    
}
