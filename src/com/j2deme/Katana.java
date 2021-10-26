package com.j2deme;

public class Katana {
  private int durabilidad;
  private String color;
  private int ataque;

  public Katana() {
    this.durabilidad = 100;
    this.color = "Plata";
    this.ataque = 50;
  }

  public int getDurabilidad() {
    return durabilidad;
  }

  public void setDurabilidad(int durabilidad) {
    this.durabilidad = durabilidad;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getAtaque() {
    return ataque;
  }

  public void setAtaque(int ataque) {
    this.ataque = ataque;
  }
}
