package pro;

import java.util.Scanner;

public class BucleIII20 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    char respuesta;
	    System.out.println("* para salir");
	    System.out.print("Introduce un caracter: ");
		respuesta = in.next().charAt(0);

	    while(respuesta != '*') {
		    System.out.println(respuesta);
		    System.out.println("* para salir");
		    System.out.print("Introduce un caracter: ");
			respuesta = in.next().charAt(0);
			}System.out.print("Fin Programa");
	         in.close();
	    }

}