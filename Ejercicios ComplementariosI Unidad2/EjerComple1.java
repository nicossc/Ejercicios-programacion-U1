package pro;

import java.util.Random;

public class EjerComple1 {

	public static void main(String[] args) {
		Random valor = new Random(); 
		int nume, par = 0, impar = 0;
		for (int i = 1; i <= 10 ; i++) {
		nume =valor.nextInt(9)+1; 
		if(nume % 2 == 0) {
			par++;
		}else {
			impar++;
		}
		}
		if (par == impar) {
			System.out.println("Hay un total de " + par + " y " + impar + " impares, por lo tanto hay los mismos pares que impares");
		}else if(par > impar){
            System.out.println("Hay un total de " + par + " y " + impar + " impares, por lo tanto hay más pares que impares.");
		}else{
			System.out.println("Hay un total de " + par + " y " + impar + " impares, por lo tanto hay más impares que pares.");
		}
		
	}

}
