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
        // System.out.println("Prueba clase CentroComercial");
        // CentroComercial obj = new CentroComercial();
        // obj.setDomicilio("Avenida");
        // System.out.println("Domicilio: " + obj.getDomicilio());
        System.out.println("\t\tPractica 4 - Agregacion y Composicion");
        CentroComercial cc = new CentroComercial(
            "Tecamac", 320, 
            "PowerCenter", 
            0, 
            0, 
            4, 
            4, 
            250, 
            120, 
            10, 
            "Game Planet", 
            "Videojuegos", 
            "Halo", 
            10000, 
            3, 
            "55-55-55-55",
            null);

            Restaurante starbuks = new Restaurante("Starbuks", "Cafe", 60, 80);
            Restaurante mcdonals = new Restaurante("McDonals", "Hamburguesas", 80, 45);

            cc.setRestaurante(starbuks);
            cc.setRestaurante(mcdonals);

            System.out.println(cc);
    }
}