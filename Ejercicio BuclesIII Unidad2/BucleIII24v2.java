package pro;

public class BucleIII24v2 {

	public static void main(String[] args) {
 
        int tot = 0;
        
        for (int j = 1; j <= 10000 ; j++) {
        tot = 0;
         for (int i = 1; i <= j/2 ; i++) {
        	if(j % i == 0) {
        	tot += i;
        	}
        	if((tot == j)&&(i==j/2)) {
                System.out.println(j + " es un número perfecto");
        	}
         }
        }
	}
}