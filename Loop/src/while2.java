
public class while2 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 4;
		int c;
		while(a < 10) {
			c= b*a;		//산술연산
			//System.out.print(c+ " ");
			a++;
			
			//a++;
			//System.out.println(c+ " ");
		}
		
		/*
		  응용문제
		  해당 결과값을 확인 하여 반복문으로 코드를 작성하시오.
		  56, 49, 42. 35, 28, 21
		*/
		
		int i = 8;
		int j = 7;
		int k;
		while(i >2) {
			k = i * j;
			//System.out.print(k + ", ");
			System.out.printf("%d, ", k);
			i--;
		}
		
		/*
		  응용문제2
		  다음 결과 값을 확인한 후 해당 결과값에 맞는 코드를
		  작성하시오.
		  4, 7, 10, 13, 16, 19, 22
		*/
		
		
		
		
	}

}
