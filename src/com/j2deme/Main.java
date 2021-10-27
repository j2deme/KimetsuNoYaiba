package com.j2deme;


import java.util.Vector;

public class Main {

    public static void main(String[] args) throws Throwable {
      /*Humano nezuko = new Humano("Nezuko", 14);
      Humano tanjiro = new Humano("Tanjiro", 15);
      nezuko.finalize(); //finalize() called explicitly*/
      Suerte trebol = new Suerte();
      Vector<Humano> poblacion = new Vector<>();

      for (int i = 0; i < 10; i++){
        Humano humano = new Humano("Humano " + (i + 1), 19);
        if(trebol.lanzarMonedaBool()){
          humano = new Demonio("Demonio "+ (i + 1), 19);
        }

        // Si el objeto "humano" sigue siendo Humano, tendrá
        // una probabilidad de convertirse en Cazador
        if(!(humano instanceof Demonio)){
          // Si se obtiene 5 o 6, upgrade a Cazador
          if(trebol.lanzarDado() >= 5){
            humano = new Cazador("Cazador " + (i + 1), humano.getEdad());
          }
        }

        poblacion.add(humano);
      }

      // foreach, para cada elemento en el vector o arreglo
      for (Humano humano : poblacion) {
        System.out.print(humano);
      }
    }
}
