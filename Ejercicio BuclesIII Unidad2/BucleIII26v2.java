package pro;

import java.util.Scanner;

public class BucleIII26v2 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2, l = 0, nm = 0, posm = 0, c = 0, inv = 0;
	    System.out.print("Introduce un numero: ");
	    n1 = in.nextInt();
	    n2 = n1;
	    while (0 < n1) {
	    	l++;
	    	c = n1 % 10;
	    	inv = inv * 10 + c;
	    	if(c > nm) {
	    		nm = c;
	    		posm = l;
	    	}
	    	n1 = n1 / 10;
	     
	    }
	    System.out.println("Tiene un total de " + l + " cifras");
	    System.out.println("La cifra mas alta introducida es " + nm + " y esta en la posicion " + posm);
	    System.out.println(inv + " " + n2);
	    if(inv == n2) {
		System.out.print("Es un numero capicua");
	    }else {
	    System.out.print("No es un numero capicua");
	    }
	    in.close();
	}
}