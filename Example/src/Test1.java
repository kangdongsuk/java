import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		/*

		 [응용문제]1

		 사용자가 입력하여 조건에 맞는 메세지를 출력하시오.

		 첫번째 숫자값을 입력하세요?

		 두번째 숫자값을 입력하세요?

		 

		 첫번째 숫자값 * 두번째 숫자값에 대한 결과를 출력하시오.

		 단, 해당 결과값이 100 이하 일 경우

		 출력메세지 "100이하의 결과값입니다." 라고 설정하고

		 100이상일 경우 "해당 값은 100이상 결과값을 입니다." 라고 출력하시오.   

		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자값을 입력하세요?");
		int user1 = sc.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("두번째 숫자값을 입력하세요?");
		int user2 = sc2.nextInt();
		
		int user3 = user1 * user2;
		if(user3 < 100) {
			System.out.println("100이하의 결과값입니다.");
		}
		else {
			System.out.println("100이상의 결과값입니다.");
		}
		sc.close();
		sc2.close();
		
	}

}
