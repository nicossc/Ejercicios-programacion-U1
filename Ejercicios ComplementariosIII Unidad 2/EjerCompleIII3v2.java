package pro;

import java.util.Scanner;
//hacerlo con arrays
public class EjerCompleIII3v2 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String respuesta = "S";
        char l = 'c';
        
        int resu = 0, v = 0;
        while (!"N".equals(respuesta.toUpperCase())) {
        System.out.print("Introduce el precio base del producto: ");
	    v = in.nextInt();
	    resu += v;
        System.out.println();
        System.out.print("Introduce la letra de consumo (A,B,C): ");
		l = in.next().charAt(0);
		switch(l) {
		case 'A':
		resu += 100;
		break;
		case 'B':
		resu += 80;
		break;
		case 'C':
		resu += 60;
		break;
		}
        System.out.println();
		System.out.println("1. Entre 0 y 19 kg ");
		System.out.println("2. Entre 20 y 49 kg");
		System.out.println("3. Entre 50 y 79 kg");
		System.out.print("Introduce el peso del producto: ");
	    v = in.nextInt();
	    switch(v) {
		case 1:
		resu += 10;
		break;
		case 2:
		resu += 50;
		break;
		case 3:
		resu += 80;
		break;
		}
        System.out.println();
	    System.out.println("El valor final de la compra es " + resu);
	    resu = 0;
        System.out.println();
        in.nextLine();
        System.out.print("Continuar (S/N)?: ");
        respuesta = in.nextLine();
        while((!"N".equals(respuesta.toUpperCase()))&&(!"S".equals(respuesta.toUpperCase()))) {
        System.out.println("Respuesta invalida, por favor vuelta a intentarlo");
        System.out.print("Continuar (S/N)?: ");
        respuesta = in.nextLine();
        }
        System.out.println();
        }
        in.close();
	}

}
