package pro;

public class EjerCompleIII2 {

	public static void main(String[] args) {
        int n1 = 0, c = 0, inv = 0;
		System.out.print("Son números capicua los siguientes ");
        for (int i = 100; i <= 10000 ; i++) {
        	n1 = i;
	    while (0 < i) {
	    	c = i % 10;
	    	inv = inv * 10 + c;
	    	i = i / 10;
	    }
	    if(inv == n1) {
		System.out.print(n1 + " ");
	    }else {
	    }
	    i = n1;
	    inv = 0;
        }
	}
}