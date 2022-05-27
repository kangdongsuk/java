
public class Example6 {

	public static void main(String[] args) {
		
		/*
		   응용문제6
		   1~10까지 순차적으로 적용하는 반복문이 있습니다.
		   단, 1~5까지는 모든값을 곱하고, 6~10까지는 모든값을 더합니다.
		   해당 두개의 값을 비교하여 더한값이 큰지, 곱한값이 큰지를 결과로 출력하시오.
		 */
		
		/*
		int a;
		int b = 1;	//곱하기이기 때문에 0이 아닌 1로 설정
		int c = 0;  //더하기이기 때문에 0으로 설정
		for(a = 1; a < 11; a++) {
			if(a < 6) {
				b *= a;		//b = b * a
			}
			else if(a > 5) {
				c += a;		//c = c + a
			}
		}
		if(b > c) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
		*/
		
		int w = 1;
		int total = 0; //더하기
		int total2 = 1; //곱하기
		
		while(w <= 10) {
			if(w <= 5) {
				total2 = total2 * w;
			}
			else {
				total = total + w;
			}
			w++;
		}
		if(total2 < total) {
			System.out.println("더한값이 큽니다.");
		}
		else if(total2 > total) {
			System.out.println("곱한값이 큽니다.");
		}
		else {
			System.out.println("두 비교값이 같습니다.");
		}
	}

}
