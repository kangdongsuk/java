import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		
		/*
		  응용문제2
		  사용자가 입력한 숫자에 맞춰서 구구단이 작동되며.
		  구구단 결과를 계산하여 짝수 인지 홀수 인지를 출력하시오.
		  
		  "구구단에 대한 숫자를 입력하세요?" 라고 메세지가 출력되면
		  해당 숫자에 맞춰서 모든 결과를 더하며,
		  더한 값에 따라 짝수 인지 홀수 인지를 출력하면 됩니다.
		  단. 해당 반복문은 for ~ do while문까지
		  한가지를 선택해서 작성하시오.
		  힌트 : 반복문 안에 조건문이 들어가면 안됩니다.
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단에 대한 숫자를 입력하세요?");
		
		int a;
		int b;
		int c = 1;
		for(a = 1; a < 10; a++) {
			for(b = 1; b < 10; b++)
			b = sc.nextInt();
			c = b * a;
		}
		System.out.println("c");
		

	}

}
