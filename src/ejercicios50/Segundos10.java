
package ejercicios50;

public class Segundos10 {
        // Clase 11: Película
    class Pelicula {
        private String titulo;
        private String director;
        private int año;
        private String genero;

        public Pelicula(String titulo, String director, int año, String genero) {
            this.titulo = titulo;
            this.director = director;
            this.año = año;
            this.genero = genero;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getDirector() {
            return director;
        }

        public void setDirector(String director) {
            this.director = director;
        }

        public int getAño() {
            return año;
        }

        public void setAño(int año) {
            this.año = año;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        @Override
        public String toString() {
            return "Película: " + titulo + ", Director: " + director + ", Año: " + año + ", Género: " + genero;
        }
    }

    // Clase 12: Restaurante
    class Restaurante {
        private String nombre;
        private String direccion;
        private String tipoCocina;
        private double calificacion;

        public Restaurante(String nombre, String direccion, String tipoCocina, double calificacion) {
            this.nombre = nombre;
            this.direccion = direccion;
            this.tipoCocina = tipoCocina;
            this.calificacion = calificacion;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public String getTipoCocina() {
            return tipoCocina;
        }

        public void setTipoCocina(String tipoCocina) {
            this.tipoCocina = tipoCocina;
        }

        public double getCalificacion() {
            return calificacion;
        }

        public void setCalificacion(double calificacion) {
            this.calificacion = calificacion;
        }

        @Override
        public String toString() {
            return "Restaurante: " + nombre + ", Dirección: " + direccion + ", Tipo de Cocina: " + tipoCocina + ", Calificación: " + calificacion;
        }
    }

    // Clase 13: Persona
    class Persona {
        private String nombre;
        private String apellido;
        private int edad;
        private String direccion;

        public Persona(String nombre, String apellido, int edad, String direccion) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
            this.direccion = direccion;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        @Override
        public String toString() {
            return "Persona: " + nombre + " " + apellido + ", Edad: " + edad + ", Dirección: " + direccion;
        }
    }

    // Clase 14: Orden
    class Orden {
        private String numeroOrden;
        private String fecha;
        private String cliente;
        private double montoTotal;

        public Orden(String numeroOrden, String fecha, String cliente, double montoTotal) {
            this.numeroOrden = numeroOrden;
            this.fecha = fecha;
            this.cliente = cliente;
            this.montoTotal = montoTotal;
        }

        public String getNumeroOrden() {
            return numeroOrden;
        }

        public void setNumeroOrden(String numeroOrden) {
            this.numeroOrden = numeroOrden;
        }

        public String getFecha() {
            return fecha;
        }

        public void setFecha(String fecha) {
            this.fecha = fecha;
        }

        public String getCliente() {
            return cliente;
        }

        public void setCliente(String cliente) {
            this.cliente = cliente;
        }

        public double getMontoTotal() {
            return montoTotal;
        }

        public void setMontoTotal(double montoTotal) {
            this.montoTotal = montoTotal;
        }

        @Override
        public String toString() {
            return "Orden: " + numeroOrden + ", Fecha: " + fecha + ", Cliente: " + cliente + ", Monto Total: $" + montoTotal;
        }
    }

    // Clase 15: Mascota
    class Mascota {
        private String nombre;
        private String tipo;
        private int edad;
        private String dueño;

        public Mascota(String nombre, String tipo, int edad, String dueño) {
            this.nombre = nombre;
            this.tipo = tipo;
            this.edad = edad;
            this.dueño = dueño;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getDueño() {
            return dueño;
        }

        public void setDueño(String dueño) {
            this.dueño = dueño;
        }

        @Override
        public String toString() {
            return "Mascota: " + nombre + ", Tipo: " + tipo + ", Edad: " + edad + " años, Dueño: " + dueño;
        }
    }

    // Clase 16: Proveedor
    class Proveedor {
        private String nombre;
        private String empresa;
        private String telefono;
        private String email;

        public Proveedor(String nombre, String empresa, String telefono, String email) {
            this.nombre = nombre;
            this.empresa = empresa;
            this.telefono = telefono;
            this.email = email;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getEmpresa() {
            return empresa;
        }

        public void setEmpresa(String empresa) {
            this.empresa = empresa;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return "Proveedor: " + nombre + ", Empresa: " + empresa + ", Teléfono: " + telefono + ", Email: " + email;
        }
    }

    // Clase 17: Factura
    class Factura {
        private String numeroFactura;
        private String fecha;
        private String cliente;
        private double importeTotal;

        public Factura(String numeroFactura, String fecha, String cliente, double importeTotal) {
            this.numeroFactura = numeroFactura;
            this.fecha = fecha;
            this.cliente = cliente;
            this.importeTotal = importeTotal;
        }

        public String getNumeroFactura() {
            return numeroFactura;
        }

        public void setNumeroFactura(String numeroFactura) {
            this.numeroFactura = numeroFactura;
        }

        public String getFecha() {
            return fecha;
        }

        public void setFecha(String fecha) {
            this.fecha = fecha;
        }

        public String getCliente() {
            return cliente;
        }

        public void setCliente(String cliente) {
            this.cliente = cliente;
        }

        public double getImporteTotal() {
            return importeTotal;
        }

        public void setImporteTotal(double importeTotal) {
            this.importeTotal = importeTotal;
        }

        @Override
        public String toString() {
            return "Factura: " + numeroFactura + ", Fecha: " + fecha + ", Cliente: " + cliente + ", Importe Total: $" + importeTotal;
        }
    }

    // Clase 18: Universidad
    class Universidad {
        private String nombre;
        private String direccion;
        private int numeroEstudiantes;
        private int ranking;

        public Universidad(String nombre, String direccion, int numeroEstudiantes, int ranking) {
            this.nombre = nombre;
            this.direccion = direccion;
            this.numeroEstudiantes = numeroEstudiantes;
            this.ranking = ranking;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public int getNumeroEstudiantes() {
            return numeroEstudiantes;
        }

        public void setNumeroEstudiantes(int numeroEstudiantes) {
            this.numeroEstudiantes = numeroEstudiantes;
        }

        public int getRanking() {
            return ranking;
        }

        public void setRanking(int ranking) {
            this.ranking = ranking;
        }

        @Override
        public String toString() {
            return "Universidad: " + nombre + ", Dirección: " + direccion + ", Estudiantes: " + numeroEstudiantes + ", Ranking: " + ranking;
        }
    }

    // Clase 19: Juego
    class Juego {
        private String titulo;
        private String plataforma;
        private int añoLanzamiento;
        private String genero;

        public Juego(String titulo, String plataforma, int añoLanzamiento, String genero) {
            this.titulo = titulo;
            this.plataforma = plataforma;
            this.añoLanzamiento = añoLanzamiento;
            this.genero = genero;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getPlataforma() {
            return plataforma;
        }

        public void setPlataforma(String plataforma) {
            this.plataforma = plataforma;
        }

        public int getAñoLanzamiento() {
            return añoLanzamiento;
        }

        public void setAñoLanzamiento(int añoLanzamiento) {
            this.añoLanzamiento = añoLanzamiento;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        @Override
        public String toString() {
            return "Juego: " + titulo + ", Plataforma: " + plataforma + ", Año de Lanzamiento: " + añoLanzamiento + ", Género: " + genero;
        }
    }

    // Clase 20: Hotel
    class Hotel {
        private String nombre;
        private String direccion;
        private int numeroHabitaciones;
        private int estrellas;

        public Hotel(String nombre, String direccion, int numeroHabitaciones, int estrellas) {
            this.nombre = nombre;
            this.direccion = direccion;
            this.numeroHabitaciones = numeroHabitaciones;
            this.estrellas = estrellas;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public int getNumeroHabitaciones() {
            return numeroHabitaciones;
        }

        public void setNumeroHabitaciones(int numeroHabitaciones) {
            this.numeroHabitaciones = numeroHabitaciones;
        }

        public int getEstrellas() {
            return estrellas;
        }

        public void setEstrellas(int estrellas) {
            this.estrellas = estrellas;
        }

        @Override
        public String toString() {
            return "Hotel: " + nombre + ", Dirección: " + direccion + ", Habitaciones: " + numeroHabitaciones + ", Estrellas: " + estrellas;
        }
    }

    public static void main(String[] args) {
        Segundos10 segundos10 = new Segundos10();

        // Instanciar y mostrar objetos de cada clase
        Pelicula pelicula = segundos10.new Pelicula("Inception", "Christopher Nolan", 2010, "Ciencia ficción");
        System.out.println(pelicula.toString());

        Restaurante restaurante = segundos10.new Restaurante("La Pampa", "Av. Libertad 123", "Argentina", 4.5);
        System.out.println(restaurante.toString());

        Persona persona = segundos10.new Persona("Carlos", "Gómez", 35, "Calle Falsa 123");
        System.out.println(persona.toString());

        Orden orden = segundos10.new Orden("12345", "01/09/2024", "Ana Pérez", 250.50);
        System.out.println(orden.toString());

        Mascota mascota = segundos10.new Mascota("Max", "Perro", 3, "Luis García");
        System.out.println(mascota.toString());

        Proveedor proveedor = segundos10.new Proveedor("Juan", "ABC S.A.", "555-5555", "juan@abc.com");
        System.out.println(proveedor.toString());

        Factura factura = segundos10.new Factura("F0001", "02/09/2024", "Carla López", 300.75);
        System.out.println(factura.toString());

        Universidad universidad = segundos10.new Universidad("Universidad Nacional", "Av. Universidad 456", 15000, 5);
        System.out.println(universidad.toString());

        Juego juego = segundos10.new Juego("The Witcher 3", "PC", 2015, "RPG");
        System.out.println(juego.toString());

        Hotel hotel = segundos10.new Hotel("Hotel Plaza", "Calle Central 456", 200, 5);
        System.out.println(hotel.toString());
    }
}
