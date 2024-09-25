package pro;

import java.util.Scanner;

public class EjerCompleIII5 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c;
        System.out.print("Introduce el codigo identificador de 3 cifras: ");
	    c = in.nextInt();
	    while((c<100)|(999<c)) {
	    	System.out.print("Codigo invalido, por favor introduce un codigo de 3 cifras: ");
		    c = in.nextInt();	
	    }
	    if((c % 3 == 0)&&(c % 5 == 0)) {
	    	if(c % 2 == 0) {
	    		System.out.println("Categoria de empleado detectada. Bienvenido Directivo General");
	    	}else {
	    		System.out.println("Categoria de empleado detectada. Bienvenido Directivo");
	    	}
	    }else if ((c % 2 == 0)&&(c % 3 != 0)&&(c % 5 != 0)) {
	    	System.out.println("Categoria de empleado detectada. Bienvenido Seguridad");
	    }else {
	    	System.out.println("Categoria de empleado no detectada. Por favor intente otro codigo");
	    }
	    System.out.println();
	    System.out.print("FIN PROGRAMA");
	    in.close();
	}
}