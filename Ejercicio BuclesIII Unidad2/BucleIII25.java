package pro;

import java.util.Scanner;

public class BucleIII25 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2, n, tot = 0;
	    System.out.print("Introduce el primer número: ");
	    n1 = in.nextInt();
	    while(n1<0) {
		System.out.print("Error, introduce otra vez el número ");
		n1 = in.nextInt();
	    }
	    System.out.print("Introduce el segundo número: ");
	    n2 = in.nextInt();
	    while(n2<0) {
		System.out.print("Error, introduce otra vez el número ");
		n2 = in.nextInt();
	    }
	    if(n1 < n2) {
	    n = n2;
	    n2 = n1;
	    n1 = n;
	    }
        for (int i = 1; i <= n2 ; i++) {
        tot+=n1;
        }
        System.out.print("El producto es " + tot);
        in.close();
	}

}
