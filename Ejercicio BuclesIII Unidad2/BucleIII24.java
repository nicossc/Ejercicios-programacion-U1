package pro;

import java.util.Scanner;

public class BucleIII24 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, tot = 0;
	    System.out.print("Introduce un número: ");
	    n = in.nextInt();
        for (int i = 1; i <= n/2 ; i++) {
        	if(n % i == 0) {
        	tot += i;
        	}
        }
        if(tot == n) {
    	System.out.print("Es un número perfecto");
        }else {
        System.out.print("No es un número perfecto");	
        }
        in.close();
	}

}
