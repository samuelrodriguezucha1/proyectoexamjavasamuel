/*
VENDER VEHICULO
RENTING VEHICULO
LEASING VEHICULO
REGUSTRAR VEHICULO NUEVO
REGISTRAR CLIENTE NUEVO
REGISTRAR EMPLEADOS
CONSULTAS DE VEHICULOS POR MARCA
CONSULTA DE REGISTROS DE VENTA
CONSULTA CLIENTES DE CADA PRODUCTO
 */
package concesionario1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static Concesionario concesionario = new Concesionario("VentAuto");

    public static void main(String[] args) {

        int opcion = 0;

        do {
            opcion = mostrarMenu();
            switch (opcion) {

                case 0:
                    System.out.println("HASTA LUEGO");
                    break;

                case 1:
                    venderVehiculo();
                    break;

                case 2:
                    rentingVehiculo();
                    break;

                case 3:
                    leasingVehiculo();
                    break;

                case 4:
                    registrarVehiculo();
                    break;

                case 5:
                    registrarCliente();
                    break;

                case 6:
                    registrarEmpleado();
                    break;

                case 7:
                    consultarMarcaVehicuolo();
                    break;

                case 8:
                    consultarRegistroVenta();
                    break;

                case 9:
                    consultarClienteProductop();
                    break;

            }

        } while (opcion != 0);
    }

    private static int mostrarMenu() {

        int opcion = 0;

        do {
            System.out.println("BIENVENIDO");
            System.out.println("1. VENDER VEHICULO");
            System.out.println("2. RENTING VEHICULO");
            System.out.println("3. LEASING VEHICULO");
            System.out.println("4. REGISTRAR VEHICULO NUEVO");
            System.out.println("5. REGISTRAR UN CLIENTE NUEVO");
            System.out.println("6. REGISTRAR A UN EMPLEADO");
            System.out.println("7. CONSULTAR LOS VEHICULOS POR MARCA");
            System.out.println("8. CONSULTAR REGISTROS DE VENTA");
            System.out.println("9. CONSULTAR CLIENTES DE CADA PRODUCTO");
            System.out.println("0. SALIR");

            System.out.println("SELECIONE LA OPCION QUE QUIERA");

            opcion = scanner.nextInt();
            if (opcion < 0 || opcion > 9) {
                System.out.println("OPCION INVALIDA");

            }

        } while (opcion < 0 || opcion > 9);

        return opcion;
    }

    private static void venderVehiculo() {
        registrarOperacion('V');
    }

    private static void rentingVehiculo() {
        registrarOperacion('R');
    }

    private static void leasingVehiculo() {
        registrarOperacion('L');
    }

    private static void registrarVehiculo() {
        String id;
        String marca;
        String modelo;
        int año;
        String color;
        float precio;
        TipoCombustion tipoCombustion;
        String matricula;

        System.out.println("Introduce el id");
        id = scanner.nextLine();
        System.out.println("Introduce la marca ");
        marca = scanner.nextLine();
        System.out.println("Introduce el modelo ");
        modelo = scanner.nextLine();
        System.out.println("Introduce el año ");
        año = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduce el color");
        color = scanner.nextLine();
        System.out.println("Introduce el precio");
        precio = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Indique si es 1- ELECTRICO, "
                + "   2- GASOLINA, "
                + "   3- DIESEL, "
                + "    4- HIBRIDO");
        int tipoC = scanner.nextInt();
        tipoCombustion = TipoCombustion.values()[tipoC];
        scanner.nextLine();
        System.out.println("Introduce la matricula");
        matricula = scanner.nextLine();
        System.out.println("Indique el tipo de vehiculo: 1- furgoneta, 2- suv, 3- turismo");
        int tipoV = scanner.nextInt();
        Vehiculo vehiculo;

        switch (tipoV) {
            case 1:
                System.out.println("introduce la capacidad");
                float peso = scanner.nextFloat();
                vehiculo = new Furgoneta(peso, id, marca, modelo, año, color, precio, tipoCombustion, matricula);
                break;
            case 2:
                vehiculo = new Suv(id, marca, modelo, año, color, precio, tipoCombustion, matricula);
                break;
            case 3:
                vehiculo = new Turismo(id, marca, modelo, año, color, precio, tipoCombustion, matricula);
                break;
            default:
                vehiculo = null;

        }
        concesionario.insertarVehiculo(vehiculo);
        System.out.println("El vehiculo se registro con exito");

    }

    private static void registrarCliente() {
        System.out.println("Introduce el dni");
        String dni = scanner.nextLine();

        if (solicitarDatosPersona('C', dni)) {
            System.out.println("Introduce la fecha de registro del cliente ( DD-MM-YYYY");
            String fecha = scanner.nextLine();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate fechaRegistro = LocalDate.parse(fecha, dtf);
            int indice = concesionario.comprobarCliente(dni);
            concesionario.getClientes().get(indice).setFechaIn(fechaRegistro);
            concesionario.getClientes().get(indice).setFechaF(null);
            System.out.println("Cliente registrado con exito");
        }

    }

    private static void registrarEmpleado() {

        System.out.println("Introduce el dni");
        String dni = scanner.nextLine();

        if (solicitarDatosPersona('E', dni)) {
            LocalDate fechaContratacion;
            LocalDate fechaBaja = null;
            float salario;
            String departamento;

            System.out.println("A que departamento pertenece");
            departamento = scanner.nextLine();
            System.out.println("Indique la fecha de contratacion dd-MM-yyyy");
            String fecha = scanner.nextLine();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            fechaContratacion = LocalDate.parse(fecha, dtf);
            System.out.println("Indique el salario");
            salario = scanner.nextFloat();
            int indice = concesionario.comprobarEmpleado(dni);
            concesionario.getEmpleados().get(indice).setDepartamento(departamento);
            concesionario.getEmpleados().get(indice).setFechaContratacion(fechaContratacion);
            concesionario.getEmpleados().get(indice).setFechaBaja(fechaBaja);
            concesionario.getEmpleados().get(indice).setSalario(salario);
            System.out.println("Empleado registrado con exito");

        }
    }

    private static boolean solicitarDatosPersona(char tipoPersona, String dni) {

        if (tipoPersona == 'C') {
            if (concesionario.comprobarCliente(dni) != -1) {
                System.out.println("Ya existe un cliente registrado con ese dni");

                return false;
            }
        } else {
            if (concesionario.comprobarEmpleado(dni) != -1) {
                System.out.println("Ya existe un empleado registrado con ese dni");

                return false;
            }

        }

        System.out.println("Introduce el nombre");
        String nombre = scanner.nextLine();
        System.out.println("Introduce el primer apellido");
        String primerApellido = scanner.nextLine();
        System.out.println("Introduce el segundo apellido");
        String segundoApellido = scanner.nextLine();
        System.out.println("Introduce la direccion");
        String direccion = scanner.nextLine();
        System.out.println("Introduce el mail");
        String mail = scanner.nextLine();
        System.out.println("Introduce el telefono");
        String telefono = scanner.nextLine();

        if (tipoPersona == 'C') {
            Cliente cliente = new Cliente(nombre, primerApellido, segundoApellido, dni, mail, direccion, telefono);
            concesionario.insertarCliente(cliente);

        } else {
            System.out.println("Indique si es un Administrativo (A) o un comercial (C)");
            String tipoEmpleado = scanner.nextLine();

            if (tipoEmpleado.equalsIgnoreCase("A")) {
                Empleado empleado = new Administrativo(nombre, primerApellido, segundoApellido, dni, mail, direccion, telefono);
                concesionario.insertarEmpleado(empleado);
            } else {
                System.out.println("Introduzca la comision");
                float comision = scanner.nextFloat();

                Empleado empleado = new Comercial(comision, nombre, primerApellido, segundoApellido, dni, mail, direccion, telefono);
                concesionario.insertarEmpleado(empleado);
            }

        }

        return true;
    }

    private static void consultarMarcaVehicuolo() {
        System.out.println("Introduce la marqca que quieres consultar");
        String marca = scanner.nextLine();
        for (Vehiculo v : concesionario.getVehiculos()) {
            if (v.getMarca().equalsIgnoreCase(marca)) {
                System.out.println("id: " + v.getId() + " modelo: " + v.getModelo() + " año: " + v.getAño() + " matricula " + v.getMatricula());
            }
        }

    }

    private static void consultarRegistroVenta() {

        System.out.println("indique el mes y el año que desea consultar (MM/YYYY)");
        String fecha = scanner.nextLine();
        String[] partes = fecha.split("/");

        if (partes.length != 2) {
            System.out.println("formato de fecha incorrecto");

        } else {

            for (Venta ventas : concesionario.getProductos()) {
                if (ventas.getFechaInicio().getMonthValue() == Integer.parseInt(partes[0])) {
                    System.out.println(ventas.toString());
                }
            }

        }

    }

    private static void consultarClienteProductop() {
        System.out.println("indique si quiere consultar: ventas(V), leasing(L) o renting(R)");
        String venta = scanner.nextLine();
        if (!(venta.equalsIgnoreCase("V") || venta.equalsIgnoreCase("R") || venta.equalsIgnoreCase("L"))) {
            System.out.println("opcion incorrecta");

        } else {

            for (Venta ventas : concesionario.getProductos()) {
                if (venta.equalsIgnoreCase("R") && ventas instanceof Renting) {
                    System.out.println(ventas.toString());
                } else if (venta.equalsIgnoreCase("L") && ventas instanceof Leasing) {
                    System.out.println(ventas.toString());
                } else {
                    System.out.println(ventas.toString());
                }
            }

        }
    }

    private static Cliente solicitarCliente() {

        System.out.println("Introduzca el dni del cliente");
        String dniCliente = scanner.nextLine();
        int existeC = concesionario.comprobarCliente(dniCliente);

        if (existeC == -1) {
            System.out.println("El cliente no esta registrado, registrelo ");
            return null;
        }
        return concesionario.obtenerCliente(existeC);

    }

    private static void registrarOperacion(char tipoOperacion) {
        Cliente cliente = solicitarCliente();

        if (cliente != null) {

            System.out.println("Introduce el id del vehiculo");
            String idVehiculo = scanner.nextLine();

            int existeV = concesionario.comprobarVehiculo(idVehiculo);
            if (existeV == -1) {
                System.out.println("El vehiculo no esta registrado, registrelo");

            } else {

                Vehiculo vehiculo = concesionario.obtenerVehiculo(existeV);
                System.out.println("Introduce el dni del empleado");
                String dniEmpleado = scanner.nextLine();

                int existeE = concesionario.comprobarEmpleado(dniEmpleado);
                if (existeE == -1) {
                    System.out.println("El empleado no esta registrado, registrelo");
                } else {
                    Empleado empleado = concesionario.obtenerEmpleado(existeE);
                    System.out.println("Indique la fecha de la venta");
                    LocalDate fechaVenta = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                    System.out.println("Introduce el importe de la venta");
                    float importeVenta = scanner.nextFloat();

                    switch (tipoOperacion) {
                        case 'V':

                            Venta venta = new Venta("V", importeVenta, fechaVenta, cliente, vehiculo, empleado);
                            concesionario.insertarProducto(venta);
                            System.out.println("Venta realizado con exito");

                            break;

                        case 'R':
                        case 'L':
                            System.out.println("Introduce el importe de la la cuota");
                            float importeCuota = scanner.nextFloat();
                            System.out.println("Introduce el numero de cuotas");
                            int numCuota = scanner.nextInt();
                            System.out.println("Indique la fecha de la venta");
                            LocalDate fechaFin = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));

                            if (tipoOperacion == 'R') {
                                Renting renting = new Renting(importeCuota, fechaFin, numCuota, "R", importeVenta, fechaVenta, cliente, vehiculo, empleado);
                                concesionario.insertarProducto(renting);
                                System.out.println("Renting realizado con exito");
                            } else {
                                System.out.println("Quieres ejecutar la opcion de compra (SI-NO");
                                String respuesta = scanner.nextLine();
                                boolean opcionCompra = respuesta.equalsIgnoreCase("SI");
                                Leasing leasing = new Leasing("L", importeVenta, fechaVenta, cliente, vehiculo, empleado, importeCuota, opcionCompra, fechaFin, numCuota);
                                concesionario.insertarProducto(leasing);
                                System.out.println("Leasing realizado coln exito");
                            }

                            break;
                        default:
                            break;
                    }

                }
            }
        }
    }

}
