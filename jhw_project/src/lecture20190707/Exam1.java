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
	 * 출처: https://sdann1001.tistory.com/entry/프로그래머스알고리즘-level1-가운데-글자-가져오기 [코딩꿈나무스단의개발노트]
	 */

	

}
