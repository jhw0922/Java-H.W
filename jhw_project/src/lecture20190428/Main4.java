package lecture20190428;

public class Main4 {

	public static void main(String[] args) {


		 int A = 1; int B = 3; int C = 5;
		 
		 System.out.println(A - A);
		 System.out.println(A * B % C);
		 System.out.println(++A * A + B);
		 System.out.println(A++ * ++A);
		 System.out.println(A * B++ - B);
		 System.out.println(--C - C * ++C);
		 System.out.println(A * (++A * 5 % (C++)));
		 System.out.println((A++) + ++A * A);
		 
	}
}
