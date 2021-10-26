package com.j2deme;

public class Cazador extends Humano {
  private String clan;
  private int resistencia;
  private Katana arma;

  public Cazador(String nombre, int edad) {
    super(nombre, edad);
    this.setVida(200);
    this.resistencia = 100;
    this.arma = new Katana();
    this.clan = "Ninguno";
  }

  public String getClan() {
    return clan;
  }

  public void setClan(String clan) {
    this.clan = clan;
  }

  public int getResistencia() {
    return resistencia;
  }

  public void setResistencia(int resistencia) {
    this.resistencia = resistencia;
  }

  public Katana getArma() {
    return arma;
  }

  public void setArma(Katana arma) {
    this.arma = arma;
  }

  public int atacar(){
    return 1;
  }
}
