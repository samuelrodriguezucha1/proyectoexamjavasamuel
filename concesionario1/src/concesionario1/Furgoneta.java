

package concesionario1;



public class Furgoneta extends Vehiculo{
    
    private float peso;
    
    public Furgoneta (String id, String marca, String modelo, int año, String color, TipoCombustion tipoCombustion, float peso){
        super (id, marca, modelo, año, color, tipoCombustion);
        this.peso = peso;
        
    }

    public Furgoneta(float peso, String id, String marca, String modelo, int año, String color, float precio, TipoCombustion tipoCombustion, String matricula) {
        super(id, marca, modelo, año, color, precio, tipoCombustion, matricula);
        this.peso = peso;
    }
    

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
}
