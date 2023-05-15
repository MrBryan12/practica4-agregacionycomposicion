package Practica4;

public class Provedor {

  // Atributos de la clase Provedor
  private String nombre_proveedor;

  // Constructor
  public Provedor(String nombre_proveedor) {
    this.nombre_proveedor = nombre_proveedor;
  }

  // Método getter para el atributo nombre_proveedor
  public String getNombre_proveedor() {
    return nombre_proveedor;
  }

  // Método para imprimir el nombre del proveedor
  public void devuelve_nombre_proveedor() {
    System.out.println(nombre_proveedor);
  }
}
