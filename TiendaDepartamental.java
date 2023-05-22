/*
 * Clase TiendaDepartamental
 * 
 * Autores: Cazares Leyva Bryan Jhoan, Gachuz Davila Ulises y Morales Martínez Arturo
 * Descripcion: Clase TiendaDepartamental que se relaciona con la clase Provedor
 * Fecha: 17/05/2023
 * Version: 1.0
 */

import java.util.List;

public class TiendaDepartamental {

  // Atributos
  private String nomtienda;
  private String producto;
  // 4 atributos propuestos
  private String nombre_franquicia;
  private int dinero_caja;
  private int num_cajasregistradoras;
  private String telefono;
  private List<Provedor> provedores;

  // Constructores
  TiendaDepartamental(String nom, String producto) {
    nomtienda = nom;
    this.producto = producto;
  }

  public TiendaDepartamental(
    String nomtienda,
    String producto,
    String nombre_franquicia,
    int dinero_caja,
    int num_cajasregistradoras,
    String telefono,
    List<Provedor> provedores
  ) {
    this.nomtienda = nomtienda;
    this.producto = producto;
    this.nombre_franquicia = nombre_franquicia;
    this.dinero_caja = dinero_caja;
    this.num_cajasregistradoras = num_cajasregistradoras;
    this.telefono = telefono;
    this.provedores = provedores;
  }

  // Métodos getter y setter para los atributos

  public String getNomtienda() {
    return nomtienda;
  }

  public String getProducto() {
    return producto;
  }

  public String getNombre_franquicia() {
    return nombre_franquicia;
  }

  public int getDinero_caja() {
    return dinero_caja;
  }

  public int getNum_cajasregistradoras() {
    return num_cajasregistradoras;
  }

  public String getTelefono() {
    return telefono;
  }

  public List<Provedor> getProvedores() {
    return provedores;
  }

  // Métodos adicionales

  public int dinero_promedio() {
    // Método que retorna el promedio de dinero por cada caja registradora
    return dinero_caja / num_cajasregistradoras;
  }

  public void imprime_provedores() {
    // Método para imprimir la lista de provedores
    for (Provedor provedor : provedores) {
      provedor.devuelve_nombre_proveedor();
    }
  }

  public String toString(){
    return "Nombre de la tienda: " + nomtienda + "\n" +
    "Producto: " + producto + "\n" +
    "Nombre de la franquicia: " + nombre_franquicia + "\n" +
    "Dinero en caja: " + dinero_caja + "\n" +
    "Número de cajas registradoras: " + num_cajasregistradoras + "\n" +
    "Teléfono: " + telefono + "\n" +
    "Provedores: " + provedores + "\n"
    ;
  }

}
