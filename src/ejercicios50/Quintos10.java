
package ejercicios50;

public class Quintos10 {
    // Clase base Empleado
    public static class Empleado {
        protected String nombre;
        protected double salarioBase;

        public Empleado(String nombre, double salarioBase) {
            this.nombre = nombre;
            this.salarioBase = salarioBase;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getSalarioBase() {
            return salarioBase;
        }

        public void setSalarioBase(double salarioBase) {
            this.salarioBase = salarioBase;
        }

        @Override
        public String toString() {
            return "Empleado: " + nombre + ", Salario base: " + salarioBase;
        }
    }

    // Subclase Gerente
    public static class Gerente extends Empleado {
        private double bonificacion;
        private double salarioTotal;

        public Gerente(String nombre, double salarioBase, double bonificacion) {
            super(nombre, salarioBase);
            this.bonificacion = bonificacion;
            this.salarioTotal = salarioBase + bonificacion;
        }

        public double getBonificacion() {
            return bonificacion;
        }

        public void setBonificacion(double bonificacion) {
            this.bonificacion = bonificacion;
        }

        public double getSalarioTotal() {
            return salarioTotal;
        }

        @Override
        public String toString() {
            return "Gerente: " + nombre + ", Salario base: " + salarioBase + ", Bonificación: " + bonificacion + ", Salario total: " + salarioTotal;
        }
    }

    // Clase base Producto
    public static class Producto {
        protected String codigoProducto;
        protected String nombreProducto;
        protected double precioPorUnidad;

        public Producto(String codigoProducto, String nombreProducto, double precioPorUnidad) {
            this.codigoProducto = codigoProducto;
            this.nombreProducto = nombreProducto;
            this.precioPorUnidad = precioPorUnidad;
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

        public double getPrecioPorUnidad() {
            return precioPorUnidad;
        }

        public void setPrecioPorUnidad(double precioPorUnidad) {
            this.precioPorUnidad = precioPorUnidad;
        }

        @Override
        public String toString() {
            return "Producto: " + nombreProducto + " (Código: " + codigoProducto + "), Precio por unidad: " + precioPorUnidad;
        }
    }

    // Subclase ProductoPerecedero
    public static class ProductoPerecedero extends Producto {
        private String fechaCaducidad;
        private double descuento;

        public ProductoPerecedero(String codigoProducto, String nombreProducto, double precioPorUnidad, String fechaCaducidad, double descuento) {
            super(codigoProducto, nombreProducto, precioPorUnidad);
            this.fechaCaducidad = fechaCaducidad;
            this.descuento = descuento;
        }

        public String getFechaCaducidad() {
            return fechaCaducidad;
        }

        public void setFechaCaducidad(String fechaCaducidad) {
            this.fechaCaducidad = fechaCaducidad;
        }

        public double getDescuento() {
            return descuento;
        }

        public void setDescuento(double descuento) {
            this.descuento = descuento;
        }

        @Override
        public String toString() {
            return super.toString() + ", Fecha de caducidad: " + fechaCaducidad + ", Descuento: " + descuento * 100 + "%";
        }
    }

    public static void main(String[] args) {
        // Ejemplo de instanciación de objetos
        Empleado empleado1 = new Empleado("Carlos", 3000);
        Gerente gerente1 = new Gerente("Ana", 5000, 2000);
        Producto producto1 = new Producto("P001", "Leche", 1.5);
        ProductoPerecedero perecedero1 = new ProductoPerecedero("P002", "Yogurt", 2.0, "2024-10-15", 0.2);

        // Mostrar información
        System.out.println(empleado1);
        System.out.println(gerente1);
        System.out.println(producto1);
        System.out.println(perecedero1);
    }

}
