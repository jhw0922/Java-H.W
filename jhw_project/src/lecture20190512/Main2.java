package lecture20190512;

public class Main2 {

	public static void main(String[] args) {


		int a;//������ a����
		for(int x = 0; x<=10; x++)//x�� ����
		{
			for(int y = 0; y<=10; y++)//y�� ����
			{
				if(2*x+4*y == 10) {
					System.out.println("x= " + x + "");
					//2*x+4*y == 10�� ���� x�� �� ���
					System.out.println("y= " + y + "");
					//2*x+4*y == 10�� ���� y�� �� ���
				}
			}
		}

	}

}
