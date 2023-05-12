/*
 * Clase Main
 * 
 * Autores: Cazares Leyva Bryan Jhoan, Gachuz Davila Ulises y Morales Martínez Arturo
 * Descripcion: Clase Main donde se lleva a cabo la instancia de todas las clases
 * Fecha: 17/05/2023
 * Version: 1.0
 */

public class Main{
    public static void main(String[] args) {
        System.out.println("Prueba clase CentroComercial");
        CentroComercial obj = new CentroComercial();
        obj.setDomicilio("Avenida");
        System.out.println("Domicilio: " + obj.getDomicilio());
    }
}