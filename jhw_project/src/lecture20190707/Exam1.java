package lecture20190707;

public class Exam1 {

	private static String s;

	public static String main(String[] args) {


		s = null;
		int n = s.length();
	      String answer = "";
	      if(n%2 == 1) {
	          int m = n/2;
	          answer = s.substring(m,m+1);
	      } else {
	          int m = n/2-1;
	          answer = s.substring(m,m+2);
	      }
	      return answer;
	  }


	/*
	 * ��ó: https://sdann1001.tistory.com/entry/���α׷��ӽ��˰���-level1-���-����-�������� [�ڵ��޳��������ǰ��߳�Ʈ]
	 */

	

}
