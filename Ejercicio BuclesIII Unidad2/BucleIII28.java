package pro;

import java.util.Scanner;

public class BucleIII28 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int not;
        double tot, sus = 0, apro = 0, bie = 0, nota = 0, sob = 0;
	   
	    for (int i = 1; i <= 20 ; i++) {
	    System.out.print("Introduce la nota: ");
		not = in.nextInt();
		while((not<1)|(10<not)) {
		System.out.print("Nota introducida erronea, vuelve a introducir la nota: ");
		not = in.nextInt();
		}
	    switch (not) {
	    case 1:
	    case 2:
	    case 3:
	    case 4:
		sus++;
		break;
	    case 5:
		apro++;
		break;
	    case 6:
		bie++;
		break;
	    case 7:
	    case 8:
		nota++;
		break;
	    case 9:
	    case 10:
		sob++;
		break;
	    }
	    }
	    tot = ((apro+bie+nota+sob) / 20)*100;
	    System.out.println("Hay un total de:");
	    System.out.println(sus + " suspensos");
	    System.out.println(apro + " aprobados");
	    System.out.println(bie + " bienes");
	    System.out.println(nota + " notables");
	    System.out.println(sob + " sobresalientes");
	    System.out.println("Han pasado el modulo el " + tot + "% de la clase");
	    in.close();

	}

}
