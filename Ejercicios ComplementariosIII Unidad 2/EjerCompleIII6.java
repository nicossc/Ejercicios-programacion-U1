package pro;

import java.util.Scanner;
import java.util.Random;

public class EjerCompleIII6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double d = 1, v;
		Random valor = new Random(); 
		int b = valor.nextInt(5)+1; 
		System.out.print("Introduce el valor total de la compra: ");
		v = in.nextInt();
		
		switch(b) {
		case 1:
			System.out.println("La bolita es de color: Blanco, no hay descuento");
			d = 1;
			break;
		case 2:
			System.out.println("La bolita es de color: Verde, hay un 10% de descuento");
			d = 0.9;
			break;
		case 3:
			System.out.println("La bolita es de color: Amarilla, hay un 25% de descuento");
			d = 0.75;
			break;
		case 4:
			System.out.println("La bolita es de color: Azul, hay un 50% de descuento");
			d = 0.50;
			break;
		case 5:
			System.out.println("La bolita es de color: Roja, hay un 100% de descuento");
			d = 0;
			break;
		}
		v = v * d;
		System.out.print("El coste final de la compra es de " + v);
		in.close();
	}

}
