package lecture20190512;

public class Main3 {//클래스의 이름을 main3로 지정
	public static void main(String[] args) {//main을 시작
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
