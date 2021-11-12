package com.j2deme;

import java.util.Vector;

public class Camino {
  private Vector<Celda> camino;
  private Suerte trebol;
  private int posicionJugador;

  public Camino(int cantidadCeldas){
    this.camino = new Vector<>();
    this.trebol = new Suerte();
    this.posicionJugador = -1;
    this.inicializar(cantidadCeldas);
  }

  private void inicializar(int cantidadCeldas){
    for (int i=0; i < cantidadCeldas; i++){
      Celda _celda = new Celda();
      this.camino.add(segmentar(_celda));
    }
  }

  private Celda segmentar(Celda celda){
    if(trebol.lanzarMonedaBool()){
      //humano = new Demonio("Demonio", 19);
      celda.setEntidad(new Demonio("Demonio", 19));
    }

    // Si el objeto "humano" sigue siendo Humano, tendrá
    // una probabilidad de convertirse en Cazador
    if(!(celda.getEntidad() instanceof Demonio)){
      // Si se obtiene 5 o 6, upgrade a Cazador
      if(trebol.lanzarDado() >= 5){
        //humano = new Cazador("Cazador", humano.getEdad());
        celda.setEntidad(new Cazador("Cazador", celda.getEntidad().getEdad()));
      }
    }

    return celda;
  }

  public int getPosicionJugador() {
    return posicionJugador;
  }

  public void setPosicionJugador(int posicion) {
    this.posicionJugador = posicion;
    this.camino.get(posicion).setVisitado(true);
  }

  public int size(){
    return this.camino.size();
  }

  public Celda getCelda(int i){
    return this.camino.get(i);
  }

  @Override
  public String toString() {
    String temp = "";
    for (Celda c: this.camino) {
      temp+= c.toString();
    }
    return temp;
  }
}
