package pro;

import java.util.Random;

public class EjerCompleIII8 {

	public static void main(String[] args) {
		int a = 0, b = 0, c = 0, n = 0;
		Random valor = new Random(); 
		for (int i = 1; i <= 100 ; i++) {
		n = valor.nextInt(3)+1; 
			switch(n) {
			case 1:
				a += 1;
				break;
			case 2:
				b += 1;
				break;
			case 3:
				c += 1;
				break;
			}
		}
		if((a>b)|(c>b)) {
			if(a>c){
				System.out.println("Gano el primer candidato con " + a + " votos");
			}else if(a==c){
				System.out.println("Hubo un empate de votos entre el primer y tercer candidato, ambos tienen " + a);
			}else{
				System.out.println("Gano el tercer candidato con " + c + " votos");
			}
		}else if(a==b){
			System.out.println("Hubo un empate de votos entre el primer y segundo candidato, ambos tienen " + a);
		}else if(b==c){
			System.out.println("Hubo un empate de votos entre el segundo y tercer candidato, ambos tienen " + b);
		}else {
			System.out.println("Gano el segundo candidato con " + b + " votos");
		}
	}
}