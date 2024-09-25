package pro;

import java.util.Scanner;

public class EjerComple6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, num1 = 0, num2 = 1, res;
		System.out.print("¿Cuantos numeros quieres mostrar? (minimo 3): ");
		n = in.nextInt();
		while(n < 3) {
		System.out.print("Numero erroneo, por favor intentelo de nuevo (minimo 3): ");
		n = in.nextInt();
		}
		n = n - 2;
		System.out.print(num1 + " " + num2 + " ");
		for(int i=1;i<=n;i++) {
		res = num1 + num2;
		num1 = num2;
		num2 = res;
		System.out.print(res + " ");
		 }  
	    	in.close();
	}
}