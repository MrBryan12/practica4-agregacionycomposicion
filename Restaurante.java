public class Restaurante {
    private String nombre;
    private String producto;
    private int numComensales;
    private int maxComensales;
    private double precioPromedio;
    private double ingresos;

    public Restaurante(String nombre, String producto, int maxComensales, double precioPromedio) {
        this.nombre = nombre;
        this.producto = producto;
        this.numComensales = 0;
        this.maxComensales = maxComensales;
        this.precioPromedio = precioPromedio;
        this.ingresos = 0;
    }

    public boolean agregarComensal() {
        if (numComensales < maxComensales) {
            numComensales++;
            System.out.println("Comensal agregado.");
            return true;
        } else {
            System.out.println("No hay mesas disponibles.");
            return false;
        }
    }

    public double calcularVentaPromedio(int numVentas) {
        return numVentas * precioPromedio;
    }

    public void registrarIngreso(double monto) {
        ingresos += monto;
    }

    public double obtenerIngresos() {
        return ingresos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getProducto() {
        return producto;
    }

    public int getNumComensales() {
        return numComensales;
    }

    public int getMaxComensales() {
        return maxComensales;
    }

    public double getPrecioPromedio() {
        return precioPromedio;
    }
}
