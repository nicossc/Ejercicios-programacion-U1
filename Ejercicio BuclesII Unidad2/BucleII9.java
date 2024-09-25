package pro;

import java.util.Scanner;

public class BucleII9 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0, r = 1;
        System.out.println("Para finalizar introducir -99");
		System.out.print("Introduce un valor al que calcular el factorial: ");   
	    n = in.nextInt();
	    while(n!=-99) {
    	for (int i = n; i >= 1 ; i--) {
    		r *= i;
        	System.out.print(i);
        	if(i!= 1) {
        	System.out.print(" * ");
        	}
    	}
    	System.out.print(" = " + r);
    	System.out.println();
    	r = 1;
        System.out.println("Para finalizar introducir -99");
		System.out.print("Introduce un valor al que calcular el factorial: ");   
	    n = in.nextInt();
        }in.close();
	   }

	}