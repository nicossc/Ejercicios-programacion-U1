package pro;

import java.util.Scanner;

public class BucleII16 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    int cont = 0;
	    char respuesta, val;
	    System.out.print("Introduce un caracter: ");
		respuesta = in.next().charAt(0);
		val = respuesta;

	    for(int i = 1; i <= 9; i++) {
		    System.out.print("Introduce un caracter: ");
			respuesta = in.next().charAt(0);
			if(respuesta == val) {
				cont++;
			}
	    }
	    System.out.println("Repetiste " + cont + " veces el primer caracter introducido");
	    in.close();
	}
}