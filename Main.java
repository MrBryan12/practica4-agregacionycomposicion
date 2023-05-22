/*
 * Clase Main
 * 
 * Autores: Cazares Leyva Bryan Jhoan, Gachuz Davila Ulises y Morales Martínez Arturo
 * Descripcion: Clase Main donde se lleva a cabo la instancia de todas las clases
 * Fecha: 17/05/2023
 * Version: 1.0
 */

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Provedor> proveedores = new ArrayList<>();
        Provedor proveedor1 = new Provedor("Microsoft");
        Provedor proveedor2 = new Provedor("Nintendo");
        proveedores.add(proveedor1);
        proveedores.add(proveedor2);

        // Se crean antes los restaurantes porque son agregacion
        Restaurante starbuks = new Restaurante("Starbuks", "Cafe", 60, 80);
        //Restaurante burgerKing = new Restaurante("Burger King", "Hamburguesas", 50, 60);

        System.out.println("\t\tPractica 4 - Agregacion y Composicion");

        CentroComercial cc = new CentroComercial(
                "Av Patriotismo",
                680,
                "Alboa Patriotismo",
                3,
                4,
                6,
                8,
                300,
                180,
                12,
                "Game Planet",
                "Videojuegos",
                "FIFA",
                60000,
                4,
                "55-55-55-55",
                proveedores,
                starbuks,
                null);

        System.out.println(cc);
        // cc.getRestaurantes()[0].calcularVentaPromedio(200);
        System.out.println("El dinero promedio de " +cc.getTiendaDepartamental().getNomtienda() + " es " + cc.getTiendaDepartamental().dinero_promedio());
        System.out.println("Sus proveedores son: " );
        cc.getTiendaDepartamental().imprime_provedores();
    }
}