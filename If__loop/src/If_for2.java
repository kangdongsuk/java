
public class If_for2 {

	public static void main(String[] args) {
	
		//1~100까지 숫자 중 80이상의 숫자만 출력
		int f;
		for(f = 1; f < 101; f++) {  //반복문 안에서 값을 뽑고 싶을 때 조건문을 사용
			if(f >= 80) {
				//System.out.print(f + " ");
			}
		}
		
		/*
		  응용문제
		  200~300까지 숫자 중 240이하의 숫자만 출력하시오. 
		*/
		
		int a1;
		for(a1 = 200; a1 <= 300; a1++) {
			if(a1 <=240) {
				//System.out.print(a1 + " ");
			}
		}
		
		final int a = 3;
		int w;
		for(w = 1; w < 11; w++) {
			if(w % a == 0) {
				//System.out.printf("%d " , w);  //print(w + " ")도 가능
			}
		}
		
		/*
		  응용문제
		  구구단 중 2단을 반복합니다. 단, 2단 결과값 중 10이상 숫자만 출력합니다.
		*/
		
		final int b1 = 2;
		int b;
		int c;
		for(b = 1; b < 10; b++) {
			c = b * b1;			
			if(c >= 10) {		
				//System.out.print(c + " ");
			}
		}
		
		/*
		  응용문제
		  다음 결과값을 보고 다음 해당 값이 출력되도록 코드를 제작하시오.
		  18 36 54 72
		
		int p;
		int total3;
		for(p = 1; p <10; p++) {
			total3 = 9 * p;
			if(p%2 == 0) {
			system.out.print(total3 + " ")
		*/
		
	    int i = 9;
		int j;
		int k;
		for(j = 1; j < 10; j++) {
			k = i * j;
			if(k % 2 == 0) {  //  ->  k%18 == 0
				//System.out.print(k + " ");
			}
		}
		
		/*
		  응용문제
		  다음 결과값을 보고 해당 값이 출력되도록 코드를 제작하시오.
		  1~20 사이의 숫자 입니다.
		  6 14 17 19 
		*/
		
		int o;
		for(o = 1; o < 21; o++) {
			if(o == 6 || o == 14 || o == 17 || o == 19) {
				System.out.print(o + " ");
			}
		}
		
	}

}
