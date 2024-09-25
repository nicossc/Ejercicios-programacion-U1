package pro;

import java.util.Scanner;

public class BucleIII22 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, suma = 0;
        String respuesta = "A";
        do
        {
            System.out.print("Introduce un numero: ");
            n = in.nextInt();
            suma += n;
            in.nextLine();
            System.out.print("Continuar (S/N)?: ");
            respuesta = in.nextLine();
            while((!"N".equals(respuesta.toUpperCase()))&&(!"S".equals(respuesta.toUpperCase()))) {
            System.out.println("Respuesta invalida, por favor vuelta a intentarlo");
            System.out.print("Continuar (S/N)?: ");
            respuesta = in.nextLine();
            }
        }while (!"N".equals(respuesta.toUpperCase()));
        System.out.println("La suma de los números es " + suma);
	    System.out.print("Fin Programa");
        in.close();

	}

}
