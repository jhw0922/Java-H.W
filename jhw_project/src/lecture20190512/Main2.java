package lecture20190512;

public class Main2 {

	public static void main(String[] args) {


		int a;//정수형 a선언
		for(int x = 0; x<=10; x++)//x의 범위
		{
			for(int y = 0; y<=10; y++)//y의 범위
			{
				if(2*x+4*y == 10) {
					System.out.println("x= " + x + "");
					//2*x+4*y == 10일 때의 x의 값 출력
					System.out.println("y= " + y + "");
					//2*x+4*y == 10일 때의 y의 값 출력
				}
			}
		}

	}

}
