import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		
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
		Scanner a = new Scanner(System.in);
		System.out.println("첫번째 숫자값을 입력하세요.");
		int b = a.nextInt();
		
		Scanner c = new Scanner(System.in);
		System.out.println("두번쨰 숫자값을 입력하세요.");
		int d = c.nextInt();
		
		if(b*d <= 100) {
			System.out.println("100이하의 결과값입니다.");
		}
		else {
			System.out.println("해당 값은 100이상의 결과값입니다.");
		}
		a.close();
		c.close();
		
		/*
		 응용문제. 조건문 코드를 작성 하시오.
		 고객이 자신의 통장에서 입,출금을 하는 프로세서를 제작해야 합니다.
		 고객의 기본 자산 금액 : 100,000원
		 "1번 입력시 입금, 2번 입력시 출금 입니다." 라는 메세지가
		 제일 먼저 실행 되어야 합니다.
		 1번을 입력시 "해당 금액을 입력하세요"
		 사용자가 입력한 금액 + 기본 자산금액을 합한
		 총 자산 금액을 출력하시오.
		 
		 2번 입력시 "출금할 금액을 입력하세요"
		 사용자가 입력한 금액 - 기본 자산금액을 계산하여
		 총 자산금액을 출력하시오.
		*/
		
	}

}
