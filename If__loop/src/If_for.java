
public class If_for {

	public static void main(String[] args) {
		
		
		
		//final int a = 1;	//final을 사용시 변수 -> 상수로 변경
							//상수: 절대 변하지 않는 수를 말합니다.
		/*
		final String name = "홍길동";
		name = "이순신"                       //오류, 상수이기 때문
		System.out.println(name);
		*/
		
		//System.out.println(a);
		
		final int ct = 103;				//고정값
		int f;							//반복문
		boolean ok = false;				//조건에 대한 true, false;
		for(f = 1; f < 101; f++) {										
			
			if(f == ct) {	//반복문 값과 고정값이 같을 경우
				System.out.println("등록된 값이 확인 됩니다.");
				ok = true;	//조건에 대한 값을 변경함.
			}
			
				
			
		}	//for문 종료										
		
		if(ok == false) {	//만약에 반복문이 끝났는데도 반복문 안에 조건 사항이 없을 경우 출력되는 코드.
			System.out.println("확인이 되지 않는 숫자 입니다.");
		}
		
		/* 
		  응용문제
		  총 20번의 값을 반복합니다. 그 중 홀수값만 출력합니다.
		*/
		
		int ff;
		String odd = "";			//odd : 홀수 , even : 짝수
		for(ff = 1; ff < 21; ff++) {
			
			if(ff % 2 == 1) {  //ff % 2 != 0
				System.out.print(ff + " ");
			}
			else {		//만약에 홀수 값일 경우 odd 변수에 지속적으로 값을 추가하게 됨
				odd = ff + ""; // 마지막 홀수만 찍힘  -> 홀수 다 찍히게 하려면 odd = odd + ff + " "; <-> odd += ff + " ";  //추가 할 경우 " "  빈공간을 활용하여 적용
			}
			
		}
		System.out.println(odd);
	}

}
