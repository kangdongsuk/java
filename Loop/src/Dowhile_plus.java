
public class Dowhile_plus {

	public static void main(String[] args) {
		
		/*
		  do~while : 30~35까지 합계를 출력하시오.
		 */
		
		int a = 30;
		int b = 0;
		do {
			b = b + a;
			a++;
		}while(a < 36);
		//System.out.println("합계: " + b);
		
		/*
		  응용문제
		  합계숫자 189가 있습니다. 단 1~10까지 합계치와 현재 189를 뺸 총합계를 출력하시오. 
		*/
		
		int a1 = 1;
		int b1 = 189;
		do {
			b1 = b1 - a1;
			a1++;
		}while(a1 < 11);
		System.out.println(b1);
	}

}
