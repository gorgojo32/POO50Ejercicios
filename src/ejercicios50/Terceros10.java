/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios50;

/**
 *
 * @author jpber
 */
public class Terceros10 {
    
    // Clase 21: Venta
    class Venta {
        private String producto;
        private int cantidad;
        private double precioUnitario;
        private double precioTotal;

        public Venta(String producto, int cantidad, double precioUnitario) {
            this.producto = producto;
            this.cantidad = cantidad;
            this.precioUnitario = precioUnitario;
            this.precioTotal = cantidad * precioUnitario;
        }

        public String getProducto() {
            return producto;
        }

        public void setProducto(String producto) {
            this.producto = producto;
        }

        public int getCantidad() {
            return cantidad;
        }

        public void setCantidad(int cantidad) {
            this.cantidad = cantidad;
            this.precioTotal = this.cantidad * this.precioUnitario;
        }

        public double getPrecioUnitario() {
            return precioUnitario;
        }

        public void setPrecioUnitario(double precioUnitario) {
            this.precioUnitario = precioUnitario;
            this.precioTotal = this.cantidad * this.precioUnitario;
        }

        public double getPrecioTotal() {
            return precioTotal;
        }

        @Override
        public String toString() {
            return "Venta [Producto=" + producto + ", Cantidad=" + cantidad + ", Precio unitario=" + precioUnitario
                    + ", Precio total=" + precioTotal + "]";
        }
    }

    // Clase 22: Empleado
    class Empleado {
        private String nombre;
        private int horasTrabajadas;
        private double pagoPorHora;
        private double salarioTotal;

        public Empleado(String nombre, int horasTrabajadas, double pagoPorHora) {
            this.nombre = nombre;
            this.horasTrabajadas = horasTrabajadas;
            this.pagoPorHora = pagoPorHora;
            this.salarioTotal = horasTrabajadas * pagoPorHora;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getHorasTrabajadas() {
            return horasTrabajadas;
        }

        public void setHorasTrabajadas(int horasTrabajadas) {
            this.horasTrabajadas = horasTrabajadas;
            this.salarioTotal = this.horasTrabajadas * this.pagoPorHora;
        }

        public double getPagoPorHora() {
            return pagoPorHora;
        }

        public void setPagoPorHora(double pagoPorHora) {
            this.pagoPorHora = pagoPorHora;
            this.salarioTotal = this.horasTrabajadas * this.pagoPorHora;
        }

        public double getSalarioTotal() {
            return salarioTotal;
        }

        @Override
        public String toString() {
            return "Empleado [Nombre=" + nombre + ", Horas trabajadas=" + horasTrabajadas + ", Pago por hora="
                    + pagoPorHora + ", Salario total=" + salarioTotal + "]";
        }
    }

    // Clase 23: ProductoInventario
    class ProductoInventario {
        private String codigoProducto;
        private String nombreProducto;
        private int cantidadStock;
        private double precioUnidad;
        private double valorTotalStock;

        public ProductoInventario(String codigoProducto, String nombreProducto, int cantidadStock, double precioUnidad) {
            this.codigoProducto = codigoProducto;
            this.nombreProducto = nombreProducto;
            this.cantidadStock = cantidadStock;
            this.precioUnidad = precioUnidad;
            this.valorTotalStock = cantidadStock * precioUnidad;
        }

        public String getCodigoProducto() {
            return codigoProducto;
        }

        public void setCodigoProducto(String codigoProducto) {
            this.codigoProducto = codigoProducto;
        }

        public String getNombreProducto() {
            return nombreProducto;
        }

        public void setNombreProducto(String nombreProducto) {
            this.nombreProducto = nombreProducto;
        }

        public int getCantidadStock() {
            return cantidadStock;
        }

        public void setCantidadStock(int cantidadStock) {
            this.cantidadStock = cantidadStock;
            this.valorTotalStock = this.cantidadStock * this.precioUnidad;
        }

        public double getPrecioUnidad() {
            return precioUnidad;
        }

        public void setPrecioUnidad(double precioUnidad) {
            this.precioUnidad = precioUnidad;
            this.valorTotalStock = this.cantidadStock * this.precioUnidad;
        }

        public double getValorTotalStock() {
            return valorTotalStock;
        }

        @Override
        public String toString() {
            return "ProductoInventario [Código=" + codigoProducto + ", Nombre=" + nombreProducto + ", Cantidad en stock="
                    + cantidadStock + ", Precio por unidad=" + precioUnidad + ", Valor total en stock=" + valorTotalStock + "]";
        }
    }

    // Clase 24: Factura
    class Factura {
        private String numeroFactura;
        private String fecha;
        private double subtotal;
        private double iva;
        private double total;

        public Factura(String numeroFactura, String fecha, double subtotal) {
            this.numeroFactura = numeroFactura;
            this.fecha = fecha;
            this.subtotal = subtotal;
            this.iva = subtotal * 0.19;
            this.total = subtotal + iva;
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

        public double getSubtotal() {
            return subtotal;
        }

        public void setSubtotal(double subtotal) {
            this.subtotal = subtotal;
            this.iva = this.subtotal * 0.19;
            this.total = this.subtotal + this.iva;
        }

        public double getIva() {
            return iva;
        }

        public double getTotal() {
            return total;
        }

        @Override
        public String toString() {
            return "Factura [Número=" + numeroFactura + ", Fecha=" + fecha + ", Subtotal=" + subtotal + ", IVA=" + iva
                    + ", Total=" + total + "]";
        }
    }

    // Clase 25: Pedido
    class Pedido {
        private String numeroPedido;
        private String cliente;
        private int cantidadArticulos;
        private double precioPorArticulo;
        private double precioTotal;

        public Pedido(String numeroPedido, String cliente, int cantidadArticulos, double precioPorArticulo) {
            this.numeroPedido = numeroPedido;
            this.cliente = cliente;
            this.cantidadArticulos = cantidadArticulos;
            this.precioPorArticulo = precioPorArticulo;
            this.precioTotal = cantidadArticulos * precioPorArticulo;
        }

        public String getNumeroPedido() {
            return numeroPedido;
        }

        public void setNumeroPedido(String numeroPedido) {
            this.numeroPedido = numeroPedido;
        }

        public String getCliente() {
            return cliente;
        }

        public void setCliente(String cliente) {
            this.cliente = cliente;
        }

        public int getCantidadArticulos() {
            return cantidadArticulos;
        }

        public void setCantidadArticulos(int cantidadArticulos) {
            this.cantidadArticulos = cantidadArticulos;
            this.precioTotal = this.cantidadArticulos * this.precioPorArticulo;
        }

        public double getPrecioPorArticulo() {
            return precioPorArticulo;
        }

        public void setPrecioPorArticulo(double precioPorArticulo) {
            this.precioPorArticulo = precioPorArticulo;
            this.precioTotal = this.cantidadArticulos * this.precioPorArticulo;
        }

        public double getPrecioTotal() {
            return precioTotal;
        }

        @Override
        public String toString() {
            return "Pedido [Número de pedido=" + numeroPedido + ", Cliente=" + cliente + ", Cantidad de artículos="
                    + cantidadArticulos + ", Precio por artículo=" + precioPorArticulo + ", Precio total=" + precioTotal + "]";
        }
    }

    // Clase 26: Inversión
    class Inversion {
        private String codigoInversion;
        private String inversor;
        private double montoInicial;
        private double tasaInteresAnual;
        private double interesGenerado;

        public Inversion(String codigoInversion, String inversor, double montoInicial, double tasaInteresAnual) {
            this.codigoInversion = codigoInversion;
            this.inversor = inversor;
            this.montoInicial = montoInicial;
            this.tasaInteresAnual = tasaInteresAnual;
            this.interesGenerado = montoInicial * tasaInteresAnual / 100;
        }

        public String getCodigoInversion() {
            return codigoInversion;
        }

        public void setCodigoInversion(String codigoInversion) {
            this.codigoInversion = codigoInversion;
        }

        public String getInversor() {
            return inversor;
        }

        public void setInversor(String inversor) {
            this.inversor = inversor;
        }

        public double getMontoInicial() {
            return montoInicial;
        }

        public void setMontoInicial(double montoInicial) {
            this.montoInicial = montoInicial;
            this.interesGenerado = this.montoInicial * this.tasaInteresAnual / 100;
        }

        public double getTasaInteresAnual() {
            return tasaInteresAnual;
        }

        public void setTasaInteresAnual(double tasaInteresAnual) {
            this.tasaInteresAnual = tasaInteresAnual;
            this.interesGenerado = this.montoInicial * this.tasaInteresAnual / 100;
        }

        public double getInteresGenerado() {
            return interesGenerado;
        }

        @Override
        public String toString() {
            return "Inversión [Código=" + codigoInversion + ", Inversor=" + inversor + ", Monto inicial=" + montoInicial
                    + ", Tasa de interés anual=" + tasaInteresAnual + ", Interés generado=" + interesGenerado + "]";
        }
    }

    // Clase 27: ProductoAlmacen
    class ProductoAlmacen {
        private String codigoProducto;
        private String nombreProducto;
        private int cantidadAlmacen;
        private double precioPorUnidad;
        private double valorTotalAlmacen;

        public ProductoAlmacen(String codigoProducto, String nombreProducto, int cantidadAlmacen, double precioPorUnidad) {
            this.codigoProducto = codigoProducto;
            this.nombreProducto = nombreProducto;
            this.cantidadAlmacen = cantidadAlmacen;
            this.precioPorUnidad = precioPorUnidad;
            this.valorTotalAlmacen = cantidadAlmacen * precioPorUnidad;
        }

        public String getCodigoProducto() {
            return codigoProducto;
        }

        public void setCodigoProducto(String codigoProducto) {
            this.codigoProducto = codigoProducto;
        }

        public String getNombreProducto() {
            return nombreProducto;
        }

        public void setNombreProducto(String nombreProducto) {
            this.nombreProducto = nombreProducto;
        }

        public int getCantidadAlmacen() {
            return cantidadAlmacen;
        }

        public void setCantidadAlmacen(int cantidadAlmacen) {
            this.cantidadAlmacen = cantidadAlmacen;
            this.valorTotalAlmacen = this.cantidadAlmacen * this.precioPorUnidad;
        }

        public double getPrecioPorUnidad() {
            return precioPorUnidad;
        }

        public void setPrecioPorUnidad(double precioPorUnidad) {
            this.precioPorUnidad = precioPorUnidad;
            this.valorTotalAlmacen = this.cantidadAlmacen * this.precioPorUnidad;
        }

        public double getValorTotalAlmacen() {
            return valorTotalAlmacen;
        }

        @Override
        public String toString() {
            return "ProductoAlmacen [Código del producto=" + codigoProducto + ", Nombre del producto=" + nombreProducto
                    + ", Cantidad en almacén=" + cantidadAlmacen + ", Precio por unidad=" + precioPorUnidad
                    + ", Valor total en almacén=" + valorTotalAlmacen + "]";
        }
    }

    // Clase 28: Pago
    class Pago {
        private String numeroPago;
        private String empleado;
        private double salarioBase;
        private double bonificacion;
        private double deduccion;
        private double salarioNeto;

        public Pago(String numeroPago, String empleado, double salarioBase, double bonificacion, double deduccion) {
            this.numeroPago = numeroPago;
            this.empleado = empleado;
            this.salarioBase = salarioBase;
            this.bonificacion = bonificacion;
            this.deduccion = deduccion;
            this.salarioNeto = salarioBase + bonificacion - deduccion;
        }

        public String getNumeroPago() {
            return numeroPago;
        }

        public void setNumeroPago(String numeroPago) {
            this.numeroPago = numeroPago;
        }

        public String getEmpleado() {
            return empleado;
        }

        public void setEmpleado(String empleado) {
            this.empleado = empleado;
        }

        public double getSalarioBase() {
            return salarioBase;
        }

        public void setSalarioBase(double salarioBase) {
            this.salarioBase = salarioBase;
            this.salarioNeto = this.salarioBase + this.bonificacion - this.deduccion;
        }

        public double getBonificacion() {
            return bonificacion;
        }

        public void setBonificacion(double bonificacion) {
            this.bonificacion = bonificacion;
            this.salarioNeto = this.salarioBase + this.bonificacion - this.deduccion;
        }

        public double getDeduccion() {
            return deduccion;
        }

        public void setDeduccion(double deduccion) {
            this.deduccion = deduccion;
            this.salarioNeto = this.salarioBase + this.bonificacion - this.deduccion;
        }

        public double getSalarioNeto() {
            return salarioNeto;
        }

        @Override
        public String toString() {
            return "Pago [Número de pago=" + numeroPago + ", Empleado=" + empleado + ", Salario base=" + salarioBase
                    + ", Bonificación=" + bonificacion + ", Deducción=" + deduccion + ", Salario neto=" + salarioNeto + "]";
        }
    }

    // Clase 29: Servicio
    class Servicio {
        private String codigoServicio;
        private String descripcion;
        private double precioPorHora;
        private int horasTrabajadas;
        private double precioTotal;

        public Servicio(String codigoServicio, String descripcion, double precioPorHora, int horasTrabajadas) {
            this.codigoServicio = codigoServicio;
            this.descripcion = descripcion;
            this.precioPorHora = precioPorHora;
            this.horasTrabajadas = horasTrabajadas;
            this.precioTotal = precioPorHora * horasTrabajadas;
        }

        public String getCodigoServicio() {
            return codigoServicio;
        }

        public void setCodigoServicio(String codigoServicio) {
            this.codigoServicio = codigoServicio;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public double getPrecioPorHora() {
            return precioPorHora;
        }

        public void setPrecioPorHora(double precioPorHora) {
            this.precioPorHora = precioPorHora;
            this.precioTotal = this.precioPorHora * this.horasTrabajadas;
        }

        public int getHorasTrabajadas() {
            return horasTrabajadas;
        }

        public void setHorasTrabajadas(int horasTrabajadas) {
            this.horasTrabajadas = horasTrabajadas;
            this.precioTotal = this.precioPorHora * this.horasTrabajadas;
        }

        public double getPrecioTotal() {
            return precioTotal;
        }

        @Override
        public String toString() {
            return "Servicio [Código del servicio=" + codigoServicio + ", Descripción=" + descripcion
                    + ", Precio por hora=" + precioPorHora + ", Horas trabajadas=" + horasTrabajadas + ", Precio total="
                    + precioTotal + "]";
        }
    }

    // Clase 30: Compra
    class Compra {
        private String numeroCompra;
        private String proveedor;
        private int cantidadProductos;
        private double precioPorProducto;
        private double precioTotal;

        public Compra(String numeroCompra, String proveedor, int cantidadProductos, double precioPorProducto) {
            this.numeroCompra = numeroCompra;
            this.proveedor = proveedor;
            this.cantidadProductos = cantidadProductos;
            this.precioPorProducto = precioPorProducto;
            this.precioTotal = cantidadProductos * precioPorProducto;
        }

        public String getNumeroCompra() {
            return numeroCompra;
        }

        public void setNumeroCompra(String numeroCompra) {
            this.numeroCompra = numeroCompra;
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
            this.precioTotal = this.cantidadProductos * this.precioPorProducto;
        }

        public double getPrecioPorProducto() {
            return precioPorProducto;
        }

        public void setPrecioPorProducto(double precioPorProducto) {
            this.precioPorProducto = precioPorProducto;
            this.precioTotal = this.cantidadProductos * this.precioPorProducto;
        }

        public double getPrecioTotal() {
            return precioTotal;
        }

        @Override
        public String toString() {
            return "Compra [Número de compra=" + numeroCompra + ", Proveedor=" + proveedor + ", Cantidad de productos="
                    + cantidadProductos + ", Precio por producto=" + precioPorProducto + ", Precio total=" + precioTotal + "]";
        }
    }

    public static void main(String[] args) {
        Terceros10 terceros10 = new Terceros10();

        // Ejemplos de instancias de cada clase
        Venta venta = terceros10.new Venta("Laptop", 2, 1200.50);
        System.out.println(venta.toString());

        Empleado empleado = terceros10.new Empleado("Laura", 40, 15.5);
        System.out.println(empleado.toString());

        ProductoInventario productoInventario = terceros10.new ProductoInventario("P001", "Cámara", 10, 299.99);
        System.out.println(productoInventario.toString());

        Factura factura = terceros10.new Factura("F123", "18/09/2024", 1500);
        System.out.println(factura.toString());

        Pedido pedido = terceros10.new Pedido("P123", "Carlos", 5, 100.99);
        System.out.println(pedido.toString());

        Inversion inversion = terceros10.new Inversion("INV001", "Luis", 10000, 5.0);
        System.out.println(inversion.toString());

        ProductoAlmacen productoAlmacen = terceros10.new ProductoAlmacen("A123", "Teclado", 50, 25.99);
        System.out.println(productoAlmacen.toString());

        Pago pago = terceros10.new Pago("PA123", "Juan", 1500, 200, 100);
        System.out.println(pago.toString());

        Servicio servicio = terceros10.new Servicio("S001", "Consultoría", 50, 8);
        System.out.println(servicio.toString());

        Compra compra = terceros10.new Compra("C123", "Proveedores SA", 20, 199.99);
        System.out.println(compra.toString());
    }
}
