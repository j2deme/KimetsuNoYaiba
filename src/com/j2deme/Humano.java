package com.j2deme;

public class Humano {
  private String nombre;
  private int edad;
  private int vida;

  public Humano(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
    this.vida = 100;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public int getVida() {
    return vida;
  }

  public void setVida(int vida) {
    this.vida = vida;
  }

  @Override
  protected void finalize() throws Throwable {
    super.finalize();
    System.out.printf("%s murio!", this.nombre);
  }
}
