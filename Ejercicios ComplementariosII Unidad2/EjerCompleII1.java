package pro;

import java.util.Scanner;

public class EjerCompleII1 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = 0, b = 0, c = 0, res;
        int n1, n2;
	    System.out.print("Introduce un n�mero de 3 cifras: ");
	    n1 = in.nextInt();
	    while((n1<100)|(n1>999)) {
		System.out.print("N�mero erroneo, por favor introduce un n�mero de 3 cifras: ");
		n1 = in.nextInt();
	    }
		n2 = n1;
        while(n1 > 0){
        a = n1 % 10;
        n1 /= 10;
        b = n1 % 10;
        n1 /= 10;
        c = n1 % 10;
        n1 /= 10;
        }
        res = Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3);
        if(res == n2) {
        System.out.print("La suma de los cubos de las cifras de " + n2 + " es igual al propio n�mero");
        }else {
        System.out.print("La suma de los cubos de las cifras de " + n2 + " no es igual al propio n�mero");
        }
        in.close();
	}
}
