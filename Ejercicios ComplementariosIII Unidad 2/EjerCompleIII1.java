package pro;

import java.util.Scanner;

public class EjerCompleIII1 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2, c = 0, inv = 0;
        System.out.println("FINALIZAR PROGRAMA INTRODUCIR 0");
	    System.out.print("Introduce un numero: ");
	    n1 = in.nextInt();
	    n2 = n1;
	    while(n1!= 0) {
	    while (0 < n1) {
	    	c = n1 % 10;
	    	inv = inv * 10 + c;
	    	n1 = n1 / 10;
	    }
	    if(inv == n2) {
		System.out.println("Es un numero capicua");
	    }else {
	    System.out.println("No es un numero capicua");
	    }
	    inv = 0;
        System.out.println();
        System.out.println("FINALIZAR PROGRAMA INTRODUCIR 0");
	    System.out.print("Introduce un numero: ");
	    n1 = in.nextInt();
	    n2 = n1;
	    }
	    System.out.print("FIN PROGRAMA");
	    in.close();
	}
}