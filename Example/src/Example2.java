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
		int i = sc.nextInt();
		
		int a;
		int b = 0;
		for(a = 1; a < 10; a++) {
			b = b + (a * i); 	//b += b*a;
		}
		if(b%2 == 0) {  //b%2 != 1
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");			
		}
		
		
		/*
		 	Scanner sc = new Scanner(System.in);
		 	String msg = "구구단에 대한 숫자를 입력하세요?"
		 	String msg2;  // 메세지 구분
		 	System.out.println(msg);
		 	int user = se.nextint();
		 	
		 	int f = 1;
		 	int total = 0;
		 	do{
		 		total = total + (user * f);
		 		f++;
		 	}while(f < 10);
		 	System.out.println(total);
		 	if(total % 2 == 0) {
		 		msg2 = "짝수";
		 	}
		 	else {
		 		msg2 = "홀수";
		 	}	
		 		System.out.println("결과값은 " + msg2 + " 입니다.")
		*/

	}

}
