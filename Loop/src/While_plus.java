
public class While_plus {

	public static void main(String[] args) {
		
		/*
		   5~10까지 더한 합계 수를 출력하시오.
		*/
		
		int a =5;	//초기값
		int total = 0;	//합계치를 누적시키기 위한 변수값
		while(a < 11) {	// += , -=, *=, /=, %=
			total = total + a;	// total += a;
			a++;
		}
		//System.out.println("합계:" + total);
		
		/*
		  응용문제
		  3~8까지 곱한 총 합계 수를 출력하시오
		*/
		
		int a1 = 3;
		int b1 = 1; //곱하기 합계를 설정시 1기본값으롤 설정
		while(a1 < 9) {
			b1 = b1 * a1;
			a1++;
		}
		System.out.println("곱한 총 합계:" + b1);
	}

}
