package pro;

import java.util.Random;
import java.util.Scanner;

public class EjerComple4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random valor = new Random();
		int uno = 0, dos = 0, tres = 0, cuatro = 0, cinco = 0, seis = 0, n, nume = 0;
		System.out.print("¿Cuantas veces quieres tirar la moneda?: ");
		n = in.nextInt();
		
		for (int i = 1; i <= n ; i++) {
		nume =valor.nextInt(7); 
		if(nume == 1) {
			uno++;
		}else if(nume == 2) {
			dos++;
		}else if(nume == 3) {
			tres++;
		}else if(nume == 4) {
			cuatro++;
		}else if(nume == 5) {
			cinco++;
		}else{
			seis++;
		}
		}
		System.out.println("Ha salido el número uno un total de " + uno + " veces");
		System.out.println("Ha salido el número dos un total de " + dos + " veces");
		System.out.println("Ha salido el número tres un total de " + tres + " veces");
		System.out.println("Ha salido el número cuatro un total de " + cuatro + " veces");
		System.out.println("Ha salido el número cinco un total de " + cinco + " veces");
		System.out.println("Ha salido el número seis un total de " + seis + " veces");
		in.close();

	}

}
