package lecture20190707;

public class Exam3 {

	public static String main(String[] args) {


String answer = "";
        
        String phone_number = null;
		for(int i=0;i<phone_number.length()-4;i++)//���� 4�� ���� ���� �� *ó��
        {
            answer+="*";
        }
        
        answer+=phone_number.substring(phone_number.length()-4,phone_number.length());//���� 4�� ���ڸ� ����ó��
 
        return answer;
    }

	

}
