package lecture20190428;

public class Main7 {

	public static void main(String[] args) {


		char A = 'A';
		//char a = (int)A + 32;
		//���� �ڵ�� ������ ���ϴ�.
		char a = (char)((int)A+ 32);
		
		char b=  65 + 33;
		
		System.out.printf("%s %d \n", A, (int)A);
		System.out.printf("%s %d \n", a, (int)a);
		System.out.printf("%s %d \n", b, (int)b);

	}

}
