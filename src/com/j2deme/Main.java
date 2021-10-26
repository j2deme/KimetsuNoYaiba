package com.j2deme;

public class Main {

    public static void main(String[] args) throws Throwable {
      /*Humano nezuko = new Humano("Nezuko", 14);
      Humano tanjiro = new Humano("Tanjiro", 15);
      nezuko.finalize(); //finalize() called explicitly*/
      Suerte trebol = new Suerte();

      for (int i = 0; i < 10; i++){
        Humano humano = new Humano("Humano " + (i + 1), 19);
        if(trebol.lanzarMonedaBool()){
          humano = new Demonio("Demonio "+ (i + 1), 19);
        }

        // Si el objeto "humano" sigue siendo Humano, tendrá
        // una probabilidad de convertirse en Cazador
        if(!(humano instanceof Demonio)){
          System.out.println("Probabilidad de cazador.");
        }

        System.out.println(humano.getNombre());
      }
    }
}
