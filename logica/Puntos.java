package Logica;

public class Puntos {

private double x;
private double y;

public Puntos(double x, double y) {
 this.x = x;
 this.y = y;
 }
 
 public double getX() {
 return x;
 }
 public double getY() {
 return y;
 }
 
 public void setX(double x) {
 this.x=x;
 }
 public void setY(double y) {
 this.y=y;
 }
 
 public double calcularDistanciaDesde(Puntos parametros) {
 double cateto1 = this.x-parametros.getX();
 double cateto2 = this.y-parametros.getY();
 double hipotenusa = Math.sqrt(cateto1*cateto1 + cateto2*cateto2);
 return hipotenusa;
 
 }
 public String toString(){
 return "(x=" + getX() + ", Y=" + getY()+")";
 
 
}
}