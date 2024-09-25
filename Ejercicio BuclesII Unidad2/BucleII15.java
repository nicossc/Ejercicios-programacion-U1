package pro;

import java.util.Scanner;

public class BucleII15 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    int vocales = 0;
	    String respuesta;
	    for(int i = 1; i <= 10; i++) {
	    System.out.print("Introduce una palabra: ");
	    respuesta = in.nextLine();

	    for(int x = 0; x < respuesta.length(); x++) {
		    char letra = respuesta.toLowerCase().charAt(x);
		    if((letra == 'a') | (letra == 'e') | (letra == 'i')  | (letra == 'o')  | (letra == 'u')) {
		    vocales++;
		    }
	    }
	    }
	    System.out.println("Has introducido un total de " + vocales + " vocales.");
	    in.close();
  }
}