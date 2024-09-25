package pro;

import java.util.Scanner;

public class BucleIII27 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2, tot1 = 0, tot2 = 0;
	    System.out.print("Introduce el primer número: ");
	    n1 = in.nextInt();
	    System.out.print("Introduce el segundo número: ");
	    n2 = in.nextInt();
        for (int i = 1; i <= n1/2 ; i++) {
        	if(n1 % i == 0) {
        	tot1 += i;
        	}
        }
        if(tot1 == n2){
        	for (int i = 1; i <= n2/2 ; i++) {
        	 if(n2 % i == 0) {
        	 tot2 += i;
        	 }
        	}
        	if(tot2 == n1) {
        	 System.out.print(n1 + " y " + n2 + " son numeros amigos");
        	}else {
                System.out.print(n1 + " y " + n2 + " no son numeros amigos");
        	}
        }else {
            System.out.print(n1 + " y " + n2 + " no son numeros amigos");
        	in.close();
        }

	}
}
