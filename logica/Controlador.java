package Logica;

import java.util.Scanner;

public class Controlador {

 static Scanner entrada = new Scanner(System.in);

 public static void main(String[] args) {
 
  double x1,x2,y1,y2;
  
  System.out.print("escriba la primera x");
  x1 = entrada.nextInt();
  System.out.print("escriba la primera y");
  x2 = entrada.nextInt();
  System.out.print("escriba la segunda x");
  y1 = entrada.nextInt();
  System.out.print("escriba la segunda y");
  y2 = entrada.nextInt();
 
  Puntos p1 = new Puntos(x1,x2);
  Puntos p2 = new Puntos(y1,y2);
 
 
  double distancia = p1.calcularDistanciaDesde(p2);
  System.out.println("La distancia de p1 a p2 es: " + distancia);
 

 }

}

