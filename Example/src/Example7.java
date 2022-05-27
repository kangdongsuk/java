import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		
		/*
		   응용문제7
		   사용자가 다음 질문에 확인하여 값을 입력 후 해당 결과를 돌출하는 프로세서를 제작하시오.
		   "첫번째 입력값 단(1~10까지) 입니다.":
		   "두번째 입력값 단(1~10까지) 입니다.":
		   "세번째 입력값 단(1~10까지) 입니다.":
		   "마지막 질문 입니다. 해당 세 가지 값에 대한 산술기호를 적으시오." +, -, *, /
		   
		   해당 산술기호에 맞게 수식을 적용하여 최종값을 출력시키시오.
		   (반복문은 안써도 되며 조건문이 필요)
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 입력값 단(1~10까지) 입니다.");
		int i = sc.nextInt();
		System.out.println("두번째 입력값 단(1~10까지) 입니다.");
		int j = sc.nextInt();
		System.out.println("세번째 입력값 단(1~10까지) 입니다.");
		int k = sc.nextInt();
		System.out.println("마지막 질문입니다. 세 가지 값에 대한 산술기호를 적으시오.");
		String z = sc.next();
		
		int a;  //더하기, 빼기    없어도 됨
		int b;  //곱하기, 나누기   없어도 됨
		if(z.equals("+")) {				// a == b  -> a.equals("b")
			System.out.println(a = i + j + k);  // (i + j + k)
		}
		else if(z.equals("-")) {
			System.out.println(a = i - j - k);  // (i - j - k)
		}
		else if(z.equals("*")) {
			System.out.println(b = i * j * k);	//(i * j * k)
		}
		else if(z.equals("/")) {
			System.out.println(b = i / j / k); //(j / j / k)    소수점은 나오게 하려면 float, double 사용
		}
	}

}
