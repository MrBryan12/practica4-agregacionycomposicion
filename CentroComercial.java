/*
 * Clase CentroComercial
 * 
 * Autores: Cazares Leyva Bryan Jhoan, Gachuz Davila Ulises y Morales Martínez Arturo
 * Descripcion: Clase CentroComercial que se relaciona con la clase Estacionamiento, Restaurante y TiendaDepartamental
 * Fecha: 17/05/2023
 * Version: 1.0
 */

public class CentroComercial {
    // Atributos
    String domicilio;
    double superficie; 
    String nombre; 
    
    int numPisos;
    int numElevadores;
    int numEntradas;
    int numSanitarios;

    // Metodos
    CentroComercial(){

    }

    public String getDomicilio(){
        return domicilio;
    }

    public double getSuperficie(){
        return superficie;
    }

    public String getNombre(){
        return nombre;
    }

    public int getNumSanitarios(){
        return numSanitarios;
    }

    public void setDomicilio(String dom){
        domicilio = dom;
    }

    public void setSuperficie(double metros2){
        superficie = metros2;
    }

    public void setNombre(String nom){
        nombre = nom;
    }

    public void setNumSanitarios(int num){
        numSanitarios = num;
    }
}
