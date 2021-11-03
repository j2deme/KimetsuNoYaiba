package com.j2deme;

public class Celda {
  private Humano entidad;
  private boolean visitado;

  public Celda(){
    Suerte trebol = new Suerte();
    this.visitado = false;
    this.entidad = new Humano("Humano", trebol.lanzarDadoAbstracto(15, 50));
  }

  public Humano getEntidad() {
    return entidad;
  }

  public void setEntidad(Humano entidad) {
    this.entidad = entidad;
  }

  public boolean isVisitado() {
    return visitado;
  }

  public void setVisitado(boolean visitado) {
    this.visitado = visitado;
  }

  @Override
  public String toString() {
    if(this.visitado){
      return this.getEntidad().toString();
    }
    return "[*]";
  }
}
