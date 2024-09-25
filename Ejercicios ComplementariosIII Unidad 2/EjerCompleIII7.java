package pro;

public class EjerCompleIII7 {

	public static void main(String[] args) {
		int r = 0;
		for (int i = 100; i >= 0 ; i-=2) {
			r += i;
			System.out.print(i);
				if (i>0) {
					System.out.print(" + ");
				}
		}
		System.out.print(" = " + r);
	}

}
