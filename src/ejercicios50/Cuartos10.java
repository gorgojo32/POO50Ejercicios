 
package ejercicios50;
 
public class Cuartos10 {
        // Clase 31: Empleado
    class Empleado {
        private String nombre;
        private double salario;

        public Empleado(String nombre, double salario) {
            this.nombre = nombre;
            this.salario = salario;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }

        public double calcularSalarioAnual() {
            return salario * 12;
        }

        @Override
        public String toString() {
            return "Empleado [Nombre=" + nombre + ", Salario=" + salario + ", Salario anual=" + calcularSalarioAnual() + "]";
        }
    }

    // Clase 32: Producto
    class Producto {
        protected String codigo;
        protected String nombre;
        protected double precio;

        public Producto(String codigo, String nombre, double precio) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.precio = precio;
        }

        public String getCodigo() {
            return codigo;
        }

        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public void aplicarDescuento(double porcentaje) {
            this.precio -= this.precio * (porcentaje / 100);
        }

        @Override
        public String toString() {
            return "Producto [Código=" + codigo + ", Nombre=" + nombre + ", Precio=" + precio + "]";
        }
    }

    // Clase 33: Cliente
    class Cliente {
        String nombre;
        String direccion;
        String telefono;

        public Cliente(String nombre, String direccion, String telefono) {
            this.nombre = nombre;
            this.direccion = direccion;
            this.telefono = telefono;
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

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        @Override
        public String toString() {
            return "Cliente [Nombre=" + nombre + ", Dirección=" + direccion + ", Teléfono=" + telefono + "]";
        }
    }

    // Clase 34: Factura
    class Factura {
        public String numero;
        public String cliente;
        public double subtotal;

        public Factura(String numero, String cliente, double subtotal) {
            this.numero = numero;
            this.cliente = cliente;
            this.subtotal = subtotal;
        }

        private double calcularIVA() {
            return subtotal * 0.19;
        }

        private double calcularTotal() {
            return subtotal + calcularIVA();
        }

        public double obtenerTotal() {
            return calcularTotal();
        }

        @Override
        public String toString() {
            return "Factura [Número=" + numero + ", Cliente=" + cliente + ", Subtotal=" + subtotal + ", Total=" + obtenerTotal() + "]";
        }
    }

    // Clase 35: Pedido
    class Pedido {
        protected String numero;
        protected String cliente;
        protected int cantidad;
        protected double precioPorUnidad;

        public Pedido(String numero, String cliente, int cantidad, double precioPorUnidad) {
            this.numero = numero;
            this.cliente = cliente;
            this.cantidad = cantidad;
            this.precioPorUnidad = precioPorUnidad;
        }

        @Override
        public String toString() {
            return "Pedido [Número=" + numero + ", Cliente=" + cliente + ", Cantidad=" + cantidad + ", Precio por unidad=" + precioPorUnidad + "]";
        }
    }

    // Clase 36: Inventario
    class Inventario {
        public String codigoProducto;
        public int cantidad;
        public double precioPorUnidad;

        public Inventario(String codigoProducto, int cantidad, double precioPorUnidad) {
            this.codigoProducto = codigoProducto;
            this.cantidad = cantidad;
            this.precioPorUnidad = precioPorUnidad;
        }

        private double calcularValorTotal() {
            return cantidad * precioPorUnidad;
        }

        public double obtenerValorTotal() {
            return calcularValorTotal();
        }

        @Override
        public String toString() {
            return "Inventario [Código del producto=" + codigoProducto + ", Cantidad=" + cantidad + ", Precio por unidad=" + precioPorUnidad
                    + ", Valor total=" + obtenerValorTotal() + "]";
        }
    }

    // Clase 37: Proveedor
    class Proveedor {
        protected String nombre;
        protected String empresa;
        protected String telefono;

        public Proveedor(String nombre, String empresa, String telefono) {
            this.nombre = nombre;
            this.empresa = empresa;
            this.telefono = telefono;
        }

        protected String getNombre() {
            return nombre;
        }

        protected void setNombre(String nombre) {
            this.nombre = nombre;
        }

        protected String getEmpresa() {
            return empresa;
        }

        protected void setEmpresa(String empresa) {
            this.empresa = empresa;
        }

        protected String getTelefono() {
            return telefono;
        }

        protected void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public void mostrarInformacion() {
            System.out.println("Proveedor [Nombre=" + nombre + ", Empresa=" + empresa + ", Teléfono=" + telefono + "]");
        }
    }

    // Clase 38: Compra
    class Compra {
        private String numero;
        private String proveedor;
        private int cantidadProductos;
        private double precioPorProducto;

        public Compra(String numero, String proveedor, int cantidadProductos, double precioPorProducto) {
            this.numero = numero;
            this.proveedor = proveedor;
            this.cantidadProductos = cantidadProductos;
            this.precioPorProducto = precioPorProducto;
        }

        public String getNumero() {
            return numero;
        }

        public void setNumero(String numero) {
            this.numero = numero;
        }

        public String getProveedor() {
            return proveedor;
        }

        public void setProveedor(String proveedor) {
            this.proveedor = proveedor;
        }

        public int getCantidadProductos() {
            return cantidadProductos;
        }

        public void setCantidadProductos(int cantidadProductos) {
            this.cantidadProductos = cantidadProductos;
        }

        public double getPrecioPorProducto() {
            return precioPorProducto;
        }

        public void setPrecioPorProducto(double precioPorProducto) {
            this.precioPorProducto = precioPorProducto;
        }

        public double calcularCostoTotal() {
            return cantidadProductos * precioPorProducto;
        }

        @Override
        public String toString() {
            return "Compra [Número=" + numero + ", Proveedor=" + proveedor + ", Cantidad de productos=" + cantidadProductos
                    + ", Precio por producto=" + precioPorProducto + ", Costo total=" + calcularCostoTotal() + "]";
        }
    }

    // Clase 39: Venta
    class Venta {
        public String producto;
        public int cantidad;
        public double precioUnitario;

        public Venta(String producto, int cantidad, double precioUnitario) {
            this.producto = producto;
            this.cantidad = cantidad;
            this.precioUnitario = precioUnitario;
        }

        private double calcularTotal() {
            return cantidad * precioUnitario;
        }

        public double obtenerTotal() {
            return calcularTotal();
        }

        @Override
        public String toString() {
            return "Venta [Producto=" + producto + ", Cantidad=" + cantidad + ", Precio unitario=" + precioUnitario + ", Total=" + obtenerTotal() + "]";
        }
    }

    // Clase 40: Servicio
    class Servicio {
        public String codigo;
        public String descripcion;
        public double precioPorHora;
        public int horasTrabajadas;

        public Servicio(String codigo, String descripcion, double precioPorHora, int horasTrabajadas) {
            this.codigo = codigo;
            this.descripcion = descripcion;
            this.precioPorHora = precioPorHora;
            this.horasTrabajadas = horasTrabajadas;
        }

        protected double calcularCostoTotal() {
            return precioPorHora * horasTrabajadas;
        }

        public double obtenerCostoTotal() {
            return calcularCostoTotal();
        }

        @Override
        public String toString() {
            return "Servicio [Código=" + codigo + ", Descripción=" + descripcion + ", Precio por hora=" + precioPorHora
                    + ", Horas trabajadas=" + horasTrabajadas + ", Costo total=" + obtenerCostoTotal() + "]";
        }
    }

    public static void main(String[] args) {
        Cuartos10 cuartos10 = new Cuartos10();

        // Ejemplos de instancias
        Empleado empleado = cuartos10.new Empleado("Carlos", 1500);
        System.out.println(empleado.toString());

        Producto producto = cuartos10.new Producto("P001", "Laptop", 1200);
        producto.aplicarDescuento(10);
        System.out.println(producto.toString());

        Cliente cliente = cuartos10.new Cliente("Luis", "Av. Siempre Viva", "123456789");
        System.out.println(cliente.toString());

        Factura factura = cuartos10.new Factura("F001", "Luis", 1000);
        System.out.println(factura.toString());

        Pedido pedido = cuartos10.new Pedido("PED001", "Carlos", 10, 50);
        System.out.println(pedido.toString());

        Inventario inventario = cuartos10.new Inventario("INV001", 100, 15.5);
        System.out.println(inventario.toString());

        Proveedor proveedor = cuartos10.new Proveedor("Juan", "Suministros SA", "987654321");
        proveedor.mostrarInformacion();

        Compra compra = cuartos10.new Compra("C001", "Proveedor SA", 10, 100);
        System.out.println(compra.toString());

        Venta venta = cuartos10.new Venta("Laptop", 5, 1200);
        System.out.println(venta.toString());

        Servicio servicio = cuartos10.new Servicio("S001", "Desarrollo de software", 50, 100);
        System.out.println(servicio.toString());
    }
}
