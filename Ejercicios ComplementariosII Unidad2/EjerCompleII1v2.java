package pro;

public class EjerCompleII1v2 {

	public static void main(String[] args) {
        double a = 0, b = 0, c = 0, res = 0;
        int n2;
        System.out.print("Los números que sus cifras al cubo sumadas entre si son iguales a ellos son ");
        for (int i = 100; i <= 999 ; i++) {
		n2 = i;
        a = i % 10;
        i /= 10;
        b = i % 10;
        i /= 10;
        c = i % 10;
        i /= 10;
        i = n2;
        res = Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3);
        if(n2 == res) {
        System.out.print(res + " ");
        }
        }
	}
}
