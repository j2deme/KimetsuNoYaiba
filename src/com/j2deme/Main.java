package com.j2deme;


import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) throws Throwable {
      Humano nezuko = new Humano("Nezuko", 14);
      Humano tanjiro = new Humano("Tanjiro", 15);
      Humano player;
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

      System.out.println("Elegiste a " + player.getNombre());

      Camino c1 = new Camino(10);
      System.out.println(c1);

      for (int i = 0; i < c1.size(); i++) {
        // TODO: Crear función para leer la celda en la posición "i"
      }
    }
}
