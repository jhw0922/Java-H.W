package lecture20190428;

public class Main5 {

	public static void main(String[] args) {


		int a = 1;
		int b = 2;
		a += b += 3;
		System.out.printf("%d %d \n", a, b);
		
		a *= a++ - (a++) * b;
		System.out.println(a + b);

	}

}
