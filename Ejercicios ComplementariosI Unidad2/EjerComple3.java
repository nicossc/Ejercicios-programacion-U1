package pro;

import java.util.Random;
import java.util.Scanner;

public class EjerComple3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random valor = new Random();
		int cara = 0, n, nume = 0;
		System.out.print("¿Cuantas veces quieres tirar la moneda?: ");
		n = in.nextInt();
		
		for (int i = 1; i <= n ; i++) {
		nume =valor.nextInt(2); 
		if(nume == 0) {
			cara++;
		}
		}
		System.out.print("Ha salido cara un total de  " + cara + " veces");
		in.close();

	}

}
