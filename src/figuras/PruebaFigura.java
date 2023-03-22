package figuras;

import java.util.Scanner;
import java.awt.Color;

public class PruebaFigura {

private static final String AREA = "El área es ";//

public static void main(String[] args) {
int opcion;
Scanner teclado = new Scanner (System.in);
do { 
   opcion = mostrarMen();
   if (opcion != 4){
      System.out.print ("Introduzca la coordenada x del centro: ");
      double x = teclado.nextDouble();
      System.out.print ("Introduzca la coordenada y del centro: ");
      double y = teclado.nextDouble();
   String perímetro = "El perímetro es ";
switch (opcion)
	   {  case 1:
	primeraOpción(teclado, x, y, perímetro);
        	 break;
         case 2:
	rectangulo(teclado, x, y, perímetro);
        	 break;
         case 3:
	cuadrado(teclado, x, y, perímetro);
	         break;
        }
   }
}while (opcion != 4); 
teclado.close();
}

private static void cuadrado(Scanner teclado, double x, double y, String perímetro) {
	System.out.print ("Introduzca el lado del cuadrado: ");
	 double lado = teclado.nextDouble();
	 Cuadrado c = new Cuadrado(x, y, Color.red, lado);
	 System.out.println (perímetro + c.perímetro());
	 System.out.println (AREA + c.área());
}

private static void rectangulo(Scanner teclado, double x, double y, String perímetro) {
	System.out.print ("Introduzca la base del rect�ngulo: ");
	 double base = teclado.nextDouble();
	 System.out.print ("Introduzca la altura del rect�ngulo: ");
	 double altura = teclado.nextDouble();
	 Rectangulo r = new Rectangulo(x, y, Color.red, base, altura);
	 System.out.println (perímetro + r.perímetro());
	 System.out.println (AREA + r.área());
}

private static void primeraOpción(Scanner teclado, double x, double y, String perímetro) {
	System.out.print ("Introduzca el lado 1 del tri�ngulo: ");
	 double lado1 = teclado.nextDouble();
	 System.out.print ("Introduzca el lado 2 del tri�ngulo: ");
	 double lado2 = teclado.nextDouble();
	 System.out.print ("Introduzca el lado 3 del tri�ngulo: ");
	 double lado3 = teclado.nextDouble();
	 Triangulo t = new Triangulo(x, y, Color.red, lado1, lado2, lado3);
	 System.out.println (perímetro + t.perímetro());
	 System.out.println (AREA + t.área());
}

public static int mostrarMen(){
int opción;
System.out.println ("1) Tri�ngulo");
System.out.println ("2) Rect�ngulo");
System.out.println ("3) Cuadrado");
System.out.println ("4) Salir");
Scanner teclado = new Scanner (System.in);
do {
    System.out.print ("Introduzca una opci�n (1-4): ");
    opción = teclado.nextInt();
    if (opción < 1 || opción > 4)
	   System.out.println ("Debe introducir un n�mero entre 1 y 4");
   } while (opción < 1 || opción > 4);
return opción;
}
}
