package pro;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EjerCompleIII4 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        double v, p1 = 0;
        int s = 0;
        System.out.print("Introduce el precio la hora trabajada: ");
	    v = in.nextDouble();
	    
	    for (int i = 1; i <= 4 ; i++) {
	    	System.out.print("Introduce las horas trabajadas en la semana: ");
	    	s = in.nextInt();
	    	if(s>35) {
	    		s = s - 35;
	    		p1 += 35 * v + s * (v * 1.5);
	    	}else {
	    		p1 += s * v;
	    	}
	    }if((600 <= p1)&&(p1<=1000)) {
	    	p1 = p1 * 0.8;
	    	System.out.print("El sueldo mensual sera de " + df.format(p1));
		}else if(1000<p1) {
			p1 = p1 * 0.7;
		    System.out.print("El sueldo mensual sera de " + df.format(p1));
		}else {
			System.out.print("El sueldo mensual sera de " + df.format(p1));
		}
		in.close();
	}

}