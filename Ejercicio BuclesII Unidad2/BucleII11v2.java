package pro;

import java.util.Scanner;

public class BucleII11v2 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int respuesta = 0;

	    do
	    {
		System.out.println("1.- Altas");
		System.out.println("2.- Bajas");
		System.out.println("3.- Modificaciones");
		System.out.println("4.- Consultas");
		System.out.println("5.- Salir");   
	    respuesta = in.nextInt();
	    switch (respuesta) {
	    case 1:
	    System.out.println("Estoy en Altas");
		System.out.println();  
	    break;
	    case 2:
	    System.out.println("Estoy en Bajas");
		System.out.println();  
	    break;
	    case 3:
	    System.out.println("Estoy en Modificaciones");
		System.out.println();  
	    break;
	    case 4:
	    System.out.println("Estoy en Consultas");
		System.out.println();  
	    break;
	    case 5:
	    System.out.println("Saliendo...");
	    break;
	    default:
		System.out.println("Numero introducido erroneo, por favor vuelva a intentarlo");
		System.out.println();  
		break;
	    } 
	    }while(respuesta != 5);
	    in.close();
        
	}

}
