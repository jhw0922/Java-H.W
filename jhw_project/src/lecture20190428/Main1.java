package lecture20190428;

public class Main1 {

	public static void main(String[] args) {


		int a = 1; int b = 2; int c = 3;
		a += b++ + c;
		b += ++b + c;
		c += c++ + ++c;
		
		System.out.println(a++);
		System.out.println(a + (a++));
		System.out.println(a++ + ++a * a);

	}

}
