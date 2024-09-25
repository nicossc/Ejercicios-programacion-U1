package pro;

import java.util.Scanner;

public class BucleIII23 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int num, n = 0, par = 0, impar = 0, may, men, div = 0;
        System.out.print("Introduce un numero: ");
        num = in.nextInt();
        may = num;
        men = num;
		while(num >= 1000) {
		n++;
		if(num % 2 == 0) {
		par++;
		}else {
		impar++;
		}
		if(num>may) {
		may = num;
		}
		if(num<men) {
		men = num;
		}
        for (int i = 2; i <= num/2 ; i++) {
        	if(num % i == 0) {
        		div += 1;
        	}
        }
        if(div == 0) {
        	System.out.println(num + " es un número primo");
        }else {
        	System.out.println(num + " no es un número primo");
        	div = 0;
        }
        System.out.print("Introduce un numero: ");
        num = in.nextInt();
		}
		System.out.println("Se han introducido un total de " + n + " numeros, el mayor número introducido es " + may + " el menor es " + men + " un total de " + par + " numeros pares y un total de " + impar + " numeros impares");
	    System.out.print("Fin Programa");
        in.close();
	}

}
