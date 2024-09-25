package pro;

import java.util.Scanner;

public class BucleII14 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    int num = 0, contar = 0;

	    for(int i = 1; i <= 10; i++) {
	    	System.out.print("Introduce un número entero: ");
	    	num = in.nextInt();
	    	while(num < 0) {
		    	System.out.print("Numero introducido invalido, por favor introduce un número entero: ");
		    	num = in.nextInt();
	    	}
	    	if(num == 5) {
	    		contar++;
	    	}

	    	  	
	    }
	    System.out.println("Has introducido el número 5 un total de " + contar + " veces.");
	    in.close();
  }
}