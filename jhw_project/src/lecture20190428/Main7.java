package lecture20190428;

public class Main7 {

	public static void main(String[] args) {


		char A = 'A';
		//char a = (int)A + 32;
		//위의 코드는 에러가 납니다.
		char a = (char)((int)A+ 32);
		
		char b=  65 + 33;
		
		System.out.printf("%s %d \n", A, (int)A);
		System.out.printf("%s %d \n", a, (int)a);
		System.out.printf("%s %d \n", b, (int)b);

	}

}
