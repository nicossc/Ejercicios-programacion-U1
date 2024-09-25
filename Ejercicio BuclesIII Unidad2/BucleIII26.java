package pro;

import java.util.Scanner;

public class BucleIII26 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, l = 0, n;
	    System.out.print("Introduce un número: ");
	    n1 = in.nextInt();
	    n = n1;
	    while (n1 > 0) {
	    l++;
	    n1 = n1 / 10;
	    }
	    System.out.print("El numero " + n + " tiene un total de " + l + " cifras");
	    in.close();
	}
}