
public class Do2 {

	public static void main(String[] args) {
		
		
		int a = 1;	//반복문 기초값
		int b = 9;	//산술 고정값
		int c;
		do {
			c = a * b;
			//System.out.print(c + " ");
			a++;
		}while(a < 10);
		
		
		/*
		 응용문제
		 다음 결과값을 보고 do~while문으로 코드를 작성하시오.
		 35 45 55 65 75
		*/
		
		int i = 0; 
		int j = 35;
		int k;
		do {
			k = j + i;    //(k * 10) + 5;
			System.out.print(k + " ");
			i += 10;					 
		}while(i < 50);
	}

}
