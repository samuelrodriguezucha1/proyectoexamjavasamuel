package concesionario1;

public abstract class Vehiculo {

    protected String id;
    protected String marca;
    protected String modelo;
    protected int año;
    protected String color;
    protected float precio;
    protected TipoCombustion tipoCombustion;
    protected String matricula;

    public Vehiculo(String id, String marca, String modelo, int año, String color, TipoCombustion tipoCombustion) {
        this.id = id;
        this.año = año;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustion = tipoCombustion;
        precio = 0;
        matricula = null;

    }

    public Vehiculo(String id, String marca, String modelo, int año, String color, float precio, TipoCombustion tipoCombustion, String matricula) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
        this.precio = precio;
        this.tipoCombustion = tipoCombustion;
        this.matricula = matricula;
    }
    
    public String getId(){
        
       return id;
    }
    public void setId(String id){
        
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public TipoCombustion getTipoCombustion() {
        return tipoCombustion;
    }

    public void setTipoCombustion(TipoCombustion tipoCombustion) {
        this.tipoCombustion = tipoCombustion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", año=" + año + ", color=" + color + ", matricula=" + matricula;
    }
    
    
}
