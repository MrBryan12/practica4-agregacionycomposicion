public class Estacionamiento {
    private int numCarros;
    private double superficie;
    private int maxCarros;
    private double tarifa;
    private int numMotos;
    private boolean vigilanciaActiva;

    public Estacionamiento(int maxCarros, double superficie, double tarifa) {
        this.numCarros = 0;
        this.superficie = superficie;
        this.maxCarros = maxCarros;
        this.tarifa = tarifa;
        this.numMotos = 0;
        this.vigilanciaActiva = false;
    }
    
    public void ingresarCarro(int num) {
        if (numCarros < maxCarros) {
            numCarros += num;
            System.out.println(num + " carros ingresados al estacionamiento.");
        } else {
            System.out.println("No hay espacio suficiente para los carros.");
        }
    }
    
    public void ingresarMoto(int num) {
        numMotos += num;
        System.out.println(num + " motos ingresadas al estacionamiento.");
    }
    
    public double calcularTarifa(int horas) {
        return horas * tarifa;
    }
    
    public void activarVigilancia() {
        vigilanciaActiva = true;
        System.out.println("Vigilancia activada.");
    }
    
    public void desactivarVigilancia() {
        vigilanciaActiva = false;
        System.out.println("Vigilancia desactivada.");
    }
    
    public int getNumCarros() {
        return numCarros;
    }
    
    public double getSuperficie() {
        return superficie;
    }
    
    public int getMaxCarros() {
        return maxCarros;
    }
    
    public double getTarifa() {
        return tarifa;
    }
    
    public int getNumMotos() {
        return numMotos;
    }
    
    public boolean isVigilanciaActiva() {
        return vigilanciaActiva;
    }
}
