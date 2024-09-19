/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios50;


public class Primeros10 {
    
 
    // Clase 1: Libro
    class Libro {
        String ISBN;
        String titulo;
        String autor;
        boolean disponible;

        public Libro(String ISBN, String titulo, String autor, boolean disponible) {
            this.ISBN = ISBN;
            this.titulo = titulo;
            this.autor = autor;
            this.disponible = disponible;
        }

        public void imprimir() {
            System.out.println("ISBN: " + ISBN);
            System.out.println("Título: " + titulo);
            System.out.println("Autor: " + autor);
            System.out.println("Disponible: " + disponible);
        }
    }

    // Clase 2: Estudiante
    class Estudiante {
        String nombre;
        int edad;
        String carrera;
        double promedio;

        public Estudiante(String nombre, int edad, String carrera, double promedio) {
            this.nombre = nombre;
            this.edad = edad;
            this.carrera = carrera;
            this.promedio = promedio;
        }

        public void imprimir() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Carrera: " + carrera);
            System.out.println("Promedio: " + promedio);
        }
    }

    // Clase 3: Empleado
    class Empleado {
        String nombre;
        String puesto;
        double salario;
        int antiguedad;

        public Empleado(String nombre, String puesto, double salario, int antiguedad) {
            this.nombre = nombre;
            this.puesto = puesto;
            this.salario = salario;
            this.antiguedad = antiguedad;
        }

        public void imprimir() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Puesto: " + puesto);
            System.out.println("Salario: " + salario);
            System.out.println("Antigüedad: " + antiguedad + " años");
        }
    }

    // Clase 4: Producto
    class Producto {
        String codigo;
        String nombre;
        double precio;
        int stock;

        public Producto(String codigo, String nombre, double precio, int stock) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.precio = precio;
            this.stock = stock;
        }

        public void imprimir() {
            System.out.println("Código: " + codigo);
            System.out.println("Nombre: " + nombre);
            System.out.println("Precio: $" + precio);
            System.out.println("Stock: " + stock + " unidades");
        }
    }

    // Clase 5: Coche
    class Coche {
        String marca;
        String modelo;
        int año;
        double precio;

        public Coche(String marca, String modelo, int año, double precio) {
            this.marca = marca;
            this.modelo = modelo;
            this.año = año;
            this.precio = precio;
        }

        public void imprimir() {
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Año: " + año);
            System.out.println("Precio: $" + precio);
        }
    }

    // Clase 6: Cliente
    class Cliente {
        String nombre;
        String direccion;
        String telefono;
        String email;

        public Cliente(String nombre, String direccion, String telefono, String email) {
            this.nombre = nombre;
            this.direccion = direccion;
            this.telefono = telefono;
            this.email = email;
        }

        public void imprimir() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Dirección: " + direccion);
            System.out.println("Teléfono: " + telefono);
            System.out.println("Email: " + email);
        }
    }

    // Clase 7: Paciente
    class Paciente {
        String nombre;
        int edad;
        String enfermedad;
        String doctor;

        public Paciente(String nombre, int edad, String enfermedad, String doctor) {
            this.nombre = nombre;
            this.edad = edad;
            this.enfermedad = enfermedad;
            this.doctor = doctor;
        }

        public void imprimir() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Enfermedad: " + enfermedad);
            System.out.println("Doctor: " + doctor);
        }
    }

    // Clase 8: Curso
    class Curso {
        String nombre;
        String codigo;
        int creditos;
        String profesor;

        public Curso(String nombre, String codigo, int creditos, String profesor) {
            this.nombre = nombre;
            this.codigo = codigo;
            this.creditos = creditos;
            this.profesor = profesor;
        }

        public void imprimir() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Código: " + codigo);
            System.out.println("Créditos: " + creditos);
            System.out.println("Profesor: " + profesor);
        }
    }

    // Clase 9: Pedido
    class Pedido {
        String codigoPedido;
        String producto;
        int cantidad;
        double precioTotal;

        public Pedido(String codigoPedido, String producto, int cantidad, double precioTotal) {
            this.codigoPedido = codigoPedido;
            this.producto = producto;
            this.cantidad = cantidad;
            this.precioTotal = precioTotal;
        }

        public void imprimir() {
            System.out.println("Código del Pedido: " + codigoPedido);
            System.out.println("Producto: " + producto);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Precio Total: $" + precioTotal);
        }
    }

    // Clase 10: Evento
    class Evento {
        String nombre;
        String fecha;
        String lugar;
        int asistentes;

        public Evento(String nombre, String fecha, String lugar, int asistentes) {
            this.nombre = nombre;
            this.fecha = fecha;
            this.lugar = lugar;
            this.asistentes = asistentes;
        }

        public void imprimir() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Fecha: " + fecha);
            System.out.println("Lugar: " + lugar);
            System.out.println("Asistentes: " + asistentes);
        }
    }

    public static void main(String[] args) {
        Primeros10 primeros10 = new Primeros10();

        // Crear e imprimir instancias de cada clase
        Libro libro = primeros10.new Libro("123-456-789", "Cien años de soledad", "Gabriel García Márquez", true);
        libro.imprimir();

        Estudiante estudiante = primeros10.new Estudiante("Juan", 20, "Ingeniería", 8.5);
        estudiante.imprimir();

        Empleado empleado = primeros10.new Empleado("María", "Gerente", 50000, 5);
        empleado.imprimir();

        Producto producto = primeros10.new Producto("P001", "Laptop", 1500, 10);
        producto.imprimir();

        Coche coche = primeros10.new Coche("Toyota", "Corolla", 2020, 25000);
        coche.imprimir();

        Cliente cliente = primeros10.new Cliente("Pedro", "Av. Siempre Viva 123", "555-1234", "pedro@gmail.com");
        cliente.imprimir();

        Paciente paciente = primeros10.new Paciente("Ana", 30, "Gripe", "Dr. López");
        paciente.imprimir();

        Curso curso = primeros10.new Curso("Matemáticas", "MAT101", 5, "Dr. Pérez");
        curso.imprimir();

        Pedido pedido = primeros10.new Pedido("P0001", "Televisor", 2, 1200);
        pedido.imprimir();

        Evento evento = primeros10.new Evento("Concierto", "12/09/2024", "Auditorio Nacional", 5000);
        evento.imprimir();
    }
}
