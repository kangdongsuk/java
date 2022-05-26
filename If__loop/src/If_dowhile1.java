
public class If_dowhile1 {

	public static void main(String[] args) {
		
		/*
		  응용문제
		  구구단 6단 중에서 35이상 결과 숫자만 출력하시오.
		
		int dw = 1;
		int total;
		do {
			total = 6 * dw;
			if(total >= 35) {
			system.out.print(total+" ");
			}
			dw++;
		}while(dw <= 9);
		*/
		
		int a = 1;
		int b = 6;
		int c;
		do {
			c = b * a;
			if(c >= 35) {
				//System.out.printf("%d " , c);				
			}
			a++;
		}while(a < 10);
		
		/*
		  응용문제
		  14~27까지 숫자 중 짝수 값만 모두 더하여 최종 결과값을 출력하시오. 
		*/
		
		int i = 14;
		int j = 0;
		do {
			if(i % 2 == 0) {				
			j = j +i;
			}
			i++;
		}while(i < 28);
		System.out.print(j + " ");
		
		
	}

}
