



package concesionario1;

import java.util.ArrayList;




public class Concesionario {
    private ArrayList<Cliente> clientes;
    private ArrayList<Empleado> empleados;
    private ArrayList<Venta> productos;
    private ArrayList<Vehiculo> vehiculos;
    private String nombre;

    public Concesionario(String nombre) {
        this.nombre = nombre;
        clientes = new ArrayList<>();
        empleados = new ArrayList<>();
        productos = new ArrayList <>();
        vehiculos = new ArrayList<>();
        
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Venta> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Venta> productos) {
        this.productos = productos;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /*METODOS PARA TRABAJAR CON EL ARRAYLIST DE CLIENTES*/
    
    
    public boolean insertarCliente(Cliente cliente){
        if(comprobarCliente(cliente.getDni()) < 0){
            
            clientes.add(cliente);
        
        return true;
        }
        
    return false;   
    }
    
    
    public int comprobarCliente(String dni){
        for(int i = 0; i < clientes.size(); i++){
            
            if(clientes.get(i).getDni().equalsIgnoreCase(dni)){
                
                return i;
            }
        }
        return -1;
    }
    
    public Cliente obtenerCliente(int posicion){
        
        return clientes.get(posicion);
    }
    
    public boolean eliminarCliente(String dni){
        
        int posicionCliente = comprobarCliente(dni);
        if(posicionCliente < 0){
            
            return false;
        }
        clientes.remove(posicionCliente);
        
        return true;
        
    }
    /*METODOS PARA TRABAJAR CON EL ARRAYLIST DE EMPLEADOS*/
    
    public boolean insertarEmpleado(Empleado empleado){
        if(comprobarEmpleado(empleado.getDni()) < 0){
            
            empleados.add(empleado);
        
        return true;
        }
        
    return false;   
    }
    
    public int comprobarEmpleado(String dni){
        for(int i = 0; i < empleados.size(); i++){
            
            if(empleados.get(i).getDni().equalsIgnoreCase(dni)){
                
                return i;
            }
        }
        return -1;
    }
    
    public Empleado obtenerEmpleado(int posicion){
        return empleados.get(posicion);
    }
    
   public boolean eliminarEmpleado(String dni){
        
        int posicionEmpleado = comprobarEmpleado(dni);
        if(posicionEmpleado < 0){
            
            return false;
        }
        empleados.remove(posicionEmpleado);
        
        return true;
        
    }
   
   /*METODOS PARA TRABAJAR CON EL ARRAYLIST DE PRODUCTOS*/
   
   
   public boolean insertarProducto(Venta producto){
        if(comprobarProducto(producto.getIdentificador()) < 0){
            
            productos.add(producto);
        
        return true;
        }
        
    return false;   
    }
    
    public int comprobarProducto(String identificador){
        for(int i = 0; i < productos.size(); i++){
            
            if(productos.get(i).getIdentificador().equalsIgnoreCase(identificador)){
                
                return i;
            }
        }
        return -1;
    }
    
    
   public boolean eliminarProducto(String identificador){
        
        int posicionProducto = comprobarProducto(identificador);
        if(posicionProducto < 0){
            
            return false;
        }
        productos.remove(posicionProducto);
        
        return true;
        
    }
   
   /*METODOS PARA TRABAJAR CON EL ARRAYLIST DE VEHICULOS*/
   
   public boolean insertarVehiculo(Vehiculo vehiculo){
        if(comprobarProducto(vehiculo.getId()) < 0){
            
            vehiculos.add(vehiculo);
        
        return true;
        }
        
    return false;   
    }
    
    public int comprobarVehiculo(String id){
        for(int i = 0; i < vehiculos.size(); i++){
            
            if(vehiculos.get(i).getId().equalsIgnoreCase(id)){
                
                return i;
            }
        }
        return -1;
    }
    
    public Vehiculo obtenerVehiculo(int posicion){
        return vehiculos.get(posicion);
    }
    
   public boolean eliminarVehiculo(String id){
        
        int posicionVehiculo = comprobarVehiculo(id);
        if(posicionVehiculo < 0){
            
            return false;
        }
        vehiculos.remove(posicionVehiculo);
        
        return true;
        
    }
}
