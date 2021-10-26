package com.j2deme;

public class Demonio extends Humano {
  private String habilidad;

  public Demonio(String nombre, int edad){
    super(nombre, edad);
    this.setVida(edad * 10);
  }

  public void regenerar(){
    this.setVida(this.getVida() + 1);
  }

  public int atacar(){
    return 1;
  }
}
