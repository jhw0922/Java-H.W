package lecture20190512;

public class Main3 {//Ŭ������ �̸��� main3�� ����
	public static void main(String[] args) {//main�� ����
		int numbers[] = {1,2,3,4,5,6,7};
		int i;
		int sum = 0;
		for(i=0;i<numbers.length;i++)
		{
			sum = sum + numbers[i];
		}
		System.out.println(sum);
	}
}
