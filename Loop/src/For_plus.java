
public class For_plus {

	public static void main(String[] args) {
		
		/* 1~10까지 모든 숫자를 합한 결과값을 출력하시오. */
		
		int f;
		int total = 0;	
		for(f = 1; f < 11; f++) {	//total변수값에 반복값을 지속적으로 증가시킴
			total = total + f;		//  ->  total += f;
		}
		System.out.println("총합계" + total);  //출력문이 반복문 밖에 있음
		
		//+=(더하기 할당) -=(빼기할당) *=(곱하기할당) /=(나누기할당)
		//b = b - f; -> b -= f;
		
		/*
		  응용문제
		  전체값은 500이 있습니다. 총 8회 동안 반복되면서
		  한 번 반복할때 마다 12씩 감소하도록 하여 최종 값을 출력하시오.
		  결과값 404
		*/
		
		int a;
		int b = 500;
		for(a = 1; a <9; a++) {
			b = b - 12;
		}
		System.out.println("최종값" + b );
		
		/*
			응용문제
			구구단 2단 2*1 ~ 2*9까지의 총 합계를 출력하시오.
			정답 합계 90
		*/
		
	}

}
