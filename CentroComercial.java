/*
 * Clase CentroComercial
 * 
 * Autores: Cazares Leyva Bryan Jhoan, Gachuz Davila Ulises y Morales Martínez Arturo
 * Descripcion: Clase CentroComercial que se relaciona con la clase Estacionamiento, Restaurante y TiendaDepartamental
 * Fecha: 17/05/2023
 * Version: 1.0
 */

 import java.util.List;

public class CentroComercial {
    // Atributos
    private String domicilio;
    private double superficie;
    private String nombre;
    private int numPisos;
    private int numElevadores;
    private int numEntradas;
    private int numSanitarios;
    private Estacionamiento estacionamiento;
    private TiendaDepartamental tiendaDepartamental;
    private int numRestaurantes;
    private Restaurante[] restaurantes;

    // Constructores
    CentroComercial() {

    }

    CentroComercial(
        String domicilio, 
        double superficie, 
        String nombre, 
        int numPisos, 
        int numElevadores, 
        int numEntradas, 
        int numSanitarios, 
        int maxCarro, 
        double superficieEstacionamiento, 
        double tarifa,
        String nomtienda,
        String producto,
        String nombre_franquicia,
        int dinero_caja,
        int num_cajasregistradoras,
        String telefono,
        List<Provedor> provedores,
        Restaurante restaurante1,   
        Restaurante restaurante2
        ){  //Recibimos los dos restaurantes como argumentos por ser agregacion
            this.domicilio = domicilio;
            this.superficie = superficie;
            this.nombre = nombre;
            this.numPisos = numPisos;
            this.numElevadores = numElevadores;
            this.numEntradas = numEntradas;
            this.numSanitarios = numSanitarios;
            this.estacionamiento = new Estacionamiento( maxCarro, superficieEstacionamiento, tarifa);
            this.tiendaDepartamental = new TiendaDepartamental(
                nomtienda,
                producto,
                nombre_franquicia,
                dinero_caja,
                num_cajasregistradoras,
                telefono,
                provedores
            );
            this.restaurantes = new Restaurante[2];
            restaurantes[0] = restaurante1;
            restaurantes[1] = restaurante2;
            this.numRestaurantes = restaurantes.length;
        }

    // Getters 
    public String getDomicilio() {
        return domicilio;
    }

    public double getSuperficie() {
        return superficie;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumSanitarios() {
        return numSanitarios;
    }

    public int getNumRestaurantes(){
        return numRestaurantes;
    }

    public Estacionamiento getEstacionamiento(){
        return estacionamiento;
    }

    public TiendaDepartamental getTiendaDepartamental(){
        return tiendaDepartamental;
    }

    public Restaurante[] getRestaurantes(){
        return restaurantes;
    }

    // Setters
    public void setDomicilio(String dom) {
        domicilio = dom;
    }

    public void setSuperficie(double metros2) {
        superficie = metros2;
    }

    public void setNombre(String nom) {
        nombre = nom;
    }

    public void setNumSanitarios(int num) {
        numSanitarios = num;
    }

    public void setEstacionamiento(Estacionamiento est){
        estacionamiento = est;
    }

    public void setTiendaDepartamental(TiendaDepartamental tienda){
        tiendaDepartamental = tienda;
    }


    public String toString(){
        return "Nombre del centro comercial: " + nombre + "\n" +
        "Domicilio: " + domicilio + "\n" +
        "Superficie: " + superficie + " m^2\n" +
        "Numero de pisos: " + numPisos + " pisos\n" +
        "Numero de elevadores: " + numElevadores + " elevadores\n" +
        "Numero de entradas: " + numEntradas + " entradas\n" +
        "Numero de sanitarios: " + numSanitarios + " sanitarios\n" +
        "Numero de restaurantes: " + numRestaurantes + " restaurantes\n\n" +
        "Restaurante 1. " + restaurantes[0] + "\n" +
        "Restaurante 2. " + restaurantes[1] + "\n" +
        "" + estacionamiento + "\n" +
        "" + tiendaDepartamental + "";
    }
}
