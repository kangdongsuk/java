import java.util.Scanner;

public class Dowhile_scan1 {

	public static void main(String[] args) {
		
		/*
		 응용문제
		 사용자가 총 3번의 숫자를 입력 합니다.
		 3개 숫자 모두 곱하여 총 합계를 수를 출력하시오.
		 */
		
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int b;
		long sum = 1;	//long 입력시 최종결과에서 -음수가 발생.
		do {
			System.out.println("숫자를 입력합니다.");
			b = sc.nextInt();
			sum = sum * b;
			a++;
		}while(a < 4);
		System.out.println("총 합계 " + sum);
		sc.close();
	}

}
