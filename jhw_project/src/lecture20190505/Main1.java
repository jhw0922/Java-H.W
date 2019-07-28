package lecture20190505;

public class Main1 {

	public static int plus(int num1, int num2) {
		int result = num1 + num2;
		
		return result;
		//return num1 + num2;
	}
	
	public static int min(int num1, int num2) {
		int result = num1 - num2;
		
		return result;
		//return num1 - num2;
	}
	
	public static int m(int num1, int num2) {
		int result = num1 * num2;
		
		return result;
		//return num1 * num2;
	}
	
	public static int n(int num1, int num2) {
		int result = num1 / num2;
		
		return result;
		//return num1 / num2;
	}
	public static void main(String[] args) {


		int number1 = 10, number2 = 5;
		
		int plus = plus(number1, number2);
		int min = min(number1, number2);
		int m = m(number1, number2);
		int n = n(number1, number2);
		
		System.out.println(plus);
		System.out.println(min);
		System.out.println(m);
		System.out.println(n);

	}

}
