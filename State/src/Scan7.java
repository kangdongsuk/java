import java.util.Scanner;

public class Scan7 {

	public static void main(String[] args) {
		/*
		 [인증번호 발송에 대한 번호 비교 코드]
		 Q. 인증받은 번호를 입력하세요.
		 숫자 220524
		 사용자가 숫자 220524를 외에 입력시 "인증번호가 틀립니다."라고 출력
		 동일한 인증번호 숫자를 입력시 "인증확인 되셨습니다."라고 출력
		 단, 220524는 java 실행시 가장 먼저 실행되는 변수로 처리하세요.
		 */
		
		int sc = 220524;
		Scanner a = new Scanner(System.in);
		System.out.println("Q. 인증받은 번호를 입력하세요.");
		int b = a.nextInt();
		
		if(sc == b) {
			System.out.println("인증확인 되셨습니다.");
		}
		else {
			System.out.println("인증번호가 틀립니다.");
		}
		a.close();
	}
	

}
		//scanner을 import 사용
		//문구출력(사용자가 어떤 값을 입력하는지에 대한 문구)
		//해당 사용자가 입력한 값을 받는 변수를 지정
		/*
		 [응용문제]
		 사용자가 입력하여 조건에 맞는 메세지를 출력하시오.
		 첫번째 숫자값을 입력하세요?
		 두번째 숫자값을 입력하세요?
		 
		 첫번째 숫자값 * 두번째 숫자값에 대한 결과를 출력하시오.
		 단, 해당 결과값이 100 이하 일 경우
		 출력메세지 "100이하의 결과값입니다." 라고 설정하고
		 100이상일 경우 "해당 값은 100이상 결과값을 입니다." 라고 출력하시오.   
		*/ 
		

