import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		
		/*
		  응용문제3
		  사용자가 해당 값을 입력합니다.
		  단, 사용자가 2개의 숫자를 입력하되 첫 번째 숫자와 두 번째 숫자 범위
		  안에 있는 모든 숫자를 더해서 결과값이 나오도록 제작하시오.
		  단, 해당 코드는 do ~ while 작성합니다.
		  
		   예시)
		   첫번쨰 범위 숫자는? 5
		   두번째 범위 숫자는? 10
		   범위 숫자 모든 합계는 : 45 입니다.
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 범위 숫자는?");
		int i = sc.nextInt();	
		
		Scanner sc1 = new Scanner(System.in);   //스캐너는 반복사용이 가능해 이 부분 지워도 상관없음
		System.out.println("첫번째 범위 숫자는?");
		int j = sc1.nextInt();
		
		int a = 0;
		do {
			a += i  ;
			i++;
		}while(i <= j);
		System.out.println("범위 숫자 모든 합계는 : "+ a);
		sc.close();
	}

}
