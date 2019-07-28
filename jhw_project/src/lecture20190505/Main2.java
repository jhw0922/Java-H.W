package lecture20190505;

public class Main2 {
	
	public static int calculator(int num1, int num2, char type) {
		
		int result = 0;
		if(type == 'p')
		{
			result = num1 + num2;
		}
		else if(type == 'm')
		{
			result = num1 - num2;
		}
		else if(type == 'd')
		{
			result = num1 * num2;
		}
		else if(type == 't')
		{
			result = num1 / num2;
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		
		int plus = calculator(10, 20, 'p');
		System.out.println(plus);
		int min = calculator(10, 20, 'm');
		System.out.println(min);
		int m = calculator(10, 20, 'd');
		System.out.println(m);
		int n = calculator(10, 20, 't');
		System.out.println(n);

	}

}
