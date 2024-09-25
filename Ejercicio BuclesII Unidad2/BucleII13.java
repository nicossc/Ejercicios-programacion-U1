package pro;

import java.util.Scanner;

public class BucleII13 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    int tabla = 1, resultado;

	    for(int i = 1; i <= 10; i++) {

	    	resultado = tabla * i;
	    	System.out.println(tabla + " x " + i + " = " + resultado);
	    	if((i==10)&&(tabla!=9)) {
		    	System.out.println();
	    		tabla++;
	    		i = 0;
	    	}    	
	}in.close();
  }
}