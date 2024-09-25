package pro;

import java.util.Scanner;

public class EjerComple5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, num = 1;
		System.out.print("¿Cuantas lineas quieres mostrar?: ");
		n = in.nextInt();
		
		for(int i=1;i<=n;i++) {
	    	for(int j=1;j<=i;j++) {
	    		System.out.print("\t" + num);
	    		num++;
	    	}
	    	System.out.println();
		 }  
	    	in.close();
	}
}