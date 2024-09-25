package pro;

import java.util.Scanner;

public class BucleII9v2 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0, r = 1;
        System.out.println("Para finalizar introducir -99");
		System.out.print("Introduce un valor entero al que calcular el factorial: ");   
	    n = in.nextInt();
	    while((n<0)&&(n!=-99)) {
	    System.out.print("Valor incorrecto, introduce un valor entero al que calcular el factorial: ");   
		n = in.nextInt();
	    }
	    while(n!=-99) {
    	 for (int i = n; i >= 0 ; i--) {
    		for (int j = 0; j <= i ; j++) {
        	r *= j;
            System.out.print(j);
             if (r == 0) {
             r = 1;
             }
             if(j != i) {
             System.out.print(" * ");
             }
    		}
        	System.out.print(" = " + r);
	    	r = 1;
	    	System.out.println();
         }
    	 System.out.println();
    	 System.out.println("Para finalizar introducir -99");
 		 System.out.print("Introduce un valor al que calcular el factorial: ");   
		 n = in.nextInt();
		 while((n<0)&&(n!=-99)) {
		 System.out.print("Valor incorrecto, introduce un valor entero al que calcular el factorial: ");   
		 n = in.nextInt();
		 }
	    }
		 System.out.print("FIN PROGRAMA"); 
	    in.close();
	}
}