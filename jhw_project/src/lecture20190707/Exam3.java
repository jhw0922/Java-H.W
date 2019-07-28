package lecture20190707;

public class Exam3 {

	public static String main(String[] args) {


String answer = "";
        
        String phone_number = null;
		for(int i=0;i<phone_number.length()-4;i++)//뒤의 4개 숫자 빼고 다 *처리
        {
            answer+="*";
        }
        
        answer+=phone_number.substring(phone_number.length()-4,phone_number.length());//뒤의 4개 숫자만 정상처리
 
        return answer;
    }

	

}
