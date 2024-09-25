package pro;

import java.util.Scanner;
import java.text.DecimalFormat;

public class BucleII8 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        int n;
        double x, r = 1;
		System.out.print("Introduce un valor distinto a 0 para X: ");        
	    x = in.nextDouble();
	    while(x == 0) {
			System.out.print("Valor incorrecto, por favor introduce un valor distinto a 0 para X: ");
		    x = in.nextDouble();
	    }
		System.out.print("Introduce un valor entero no negativo a n: ");        
	    n = in.nextInt();
	    while(n < 0) {
			System.out.print("Valor incorrecto, por favor introduce un valor entero no negativo a n: ");   
			n = in.nextInt();
	    }
        
    	for (int i = 1; i <= n ; i++) {
    		r *= x;
        	}in.close();
    		System.out.print("El valor final es " + df.format(r)); 

	}

}
