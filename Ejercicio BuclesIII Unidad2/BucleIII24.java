package pro;

import java.util.Scanner;

public class BucleIII24 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, tot = 0;
	    System.out.print("Introduce un n�mero: ");
	    n = in.nextInt();
        for (int i = 1; i <= n/2 ; i++) {
        	if(n % i == 0) {
        	tot += i;
        	}
        }
        if(tot == n) {
    	System.out.print("Es un n�mero perfecto");
        }else {
        System.out.print("No es un n�mero perfecto");	
        }
        in.close();
	}

}
