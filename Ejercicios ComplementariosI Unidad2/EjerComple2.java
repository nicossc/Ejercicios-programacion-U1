package pro;

import java.util.Random;
import java.util.Scanner;

public class EjerComple2 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		Random valor = new Random(); 
		int nume, res = 0, fallo = 0;
		boolean win=false;
		nume =valor.nextInt(99)+1; 
		while(win == false) {
			System.out.print("�Qu� n�mero entre 1 y 100 ha salido?: ");
			res = in.nextInt();
			while ((res<1)&&(res>100)) {
				System.out.println("N�mero introducido invalido, por favor introduce un n�mero entre 1 y 100.");
				res = in.nextInt();
			}
			if(res != nume) {
				System.out.print("Fallaste, ");
				fallo++;
				if(res<nume) {
					System.out.println("el n�mero es mayor que el introducido");
					System.out.println();
				}else {
					System.out.println("el n�mero es menor que el introducido");
					System.out.println();
				}
			}
			if(res == nume) {
				System.out.println("Acertaste, enhorabuena.");
				win = true;
			}
		}
		System.out.println("Tuviste un total de " + fallo + " fallos hasta que lograste acertar el n�mero.");
		in.close();

	}

}
