import java.math.BigInteger;

public class Big_loop {

	public static void main(String[] args) {

		/*1~100까지의 전체 합 출력
		
		int a;
		int b = 0;
		for(a = 1; a < 101; a++) {
			b = b + a; // b += a;
		}
		System.out.println(b);
		*/
		
		//1~100까지 곱한 결과값
		int i;
		BigInteger j = new BigInteger("1");
		for(i = 1; i <101; i++) {
			j = j.multiply(BigInteger.valueOf(i));
		}
		System.out.println(j);
	}

}
