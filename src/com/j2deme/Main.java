package com.j2deme;


import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static int HP = 25;
    public static int CELDAS = 15;

    public static void main(String[] args) throws Throwable {
      Humano nezuko = new Humano("Nezuko", 14);
      Humano tanjiro = new Humano("Tanjiro", 15);
      Humano player;
      Suerte trebol = new Suerte();
      Scanner teclado = new Scanner(System.in);
      System.out.println("Elige tu personaje:");
      System.out.println("1) Tanjiro");
      System.out.println("2) Nezuko");
      System.out.print("Opción: ");
      int op = 0;
      op = teclado.nextInt();
      if(op == 1){
        player = tanjiro;
      } else {
        player = nezuko;
      }
      player.setVida(HP);

      System.out.println("Elegiste a " + player.getNombre());

      Camino c1 = new Camino(CELDAS);
      System.out.println(c1);

      for (int i = 0; i < c1.size(); i++) {
        //System.out.println(c1.getCelda(i).getEntidad());
        if(c1.getCelda(i).getEntidad() instanceof Cazador){
          player.setVida(player.getVida() + 1);
        }

        if(c1.getCelda(i).getEntidad() instanceof Demonio){
          player.setVida(player.getVida() - trebol.lanzarDado());
        }

        c1.setPosicionJugador(i);
        System.out.println(c1);

        if(player.getVida() <= 0){
          System.out.printf("%s ha muerto!", player.getNombre());
          break;
        }
      }
      if(player.getVida() >= 1){
        System.out.printf("Vida restante: %d\n", player.getVida());
        System.out.println("Has ganado!");
      }
    }
}
