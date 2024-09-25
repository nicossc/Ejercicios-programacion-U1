package pro;

import java.util.Scanner;

public class BucleIII21 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    int val1, val2, coc = 0;
	    System.out.print("Introduce el primer valor: ");
		val1 = in.nextInt();
		while(val1 <= 0) {
		System.out.print("Valor introducido invalido, por favor introduce un valor entero positivo: ");
		val1 = in.nextInt();
		}	
	    System.out.print("Introduce el segundo valor: ");
		val2 = in.nextInt();
		while(val2 <= 0) {
		System.out.print("Valor introducido invalido, por favor introduce un valor entero positivo: ");
		val2 = in.nextInt();
		}	

	    while(val1 >= val2) {
		val1 = val1 - val2;
		coc++;
		}
	    System.out.println("El cociente es " + coc + " y el resto es " + val1);
	    System.out.print("Fin Programa");
	    in.close();
	    }

}