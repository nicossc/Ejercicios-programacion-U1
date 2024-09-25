package pro;

import java.util.Scanner;

public class EjerCompleII2 {

	public static void main(String[] args) {
	       Scanner in = new Scanner(System.in);
	        int n = 0, div = 0, res = 1;
	        System.out.println("FINALIZAR PROGRAMA INTRODUCIR -99");
		    System.out.print("Introduce un número: ");
		    n = in.nextInt();
		    while (n!=-99) {
		    System.out.print(n + "# = ");
		     for (int i = 2; i <= n ; i++) {
		        for (int j = 2; j <= i/2 ; j++) {
		        	if(i % j == 0) {
		        		div += 1;
		        	}
		        }	
		        if(div == 0) {
		        System.out.print(i + " * ");
				res *= i;
			    }else {
			      div = 0;
			      }
	        }
		     System.out.print("= " + res);
		     res = 1;
		     System.out.println();
		     System.out.println("FINALIZAR PROGRAMA INTRODUCIR -99");
			 System.out.print("Introduce un número: ");
			 n = in.nextInt();
		    }
		    System.out.print("FIN PROGRAMA");
		    in.close();
	}
}