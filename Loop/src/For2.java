
public class For2 {

	public static void main(String[] args) {
		
		int a;     //for문 초기값
		int b =2;  //연산에 사용할 변수
		int c;    //연산한 결과값 사용
	    for(a = 1; a <= 9; a++) {
	    	c = b * a;  //산술연산 작업
	    	//System.out.print(c+",");  //연산된 결과값을 출력함
	    }
	    
	    /*응용문제
	    다음 결과값을 보고 코드를 작성하시오.
	    45, 40, 35, 30, 25, 20
	    */
	    
	    int a1;			//for 변수값
	    int b1 = 5;		//5배수값
	    int c1;			//계산값
	    for(a1 = 9; a1 > 3; a1--) {
	    	c1 = a1 * b1;
	    	//System.out.print(c1 + ",");
	    }
	    
	    /*
	     응용문제 다음 결과값을 확인 후 코드를 제작하여 출력하시오.
	     11,22,33,44,55,66,77,88,99
	    */
	    
	    int a2;
	    int b2 = 11;
	    int c2;
	    for(a2 = 1; a2 < 10; a2++) {
	    	c2 = a2 * b2;
	    	//System.out.print(c2 + ",");
	    }
	    
	    int z; //for
	    int x; //결과값
	    
	    for(z = 1; z < 10; z++) {
	    	x = (10*z) + z;  //x = 11 * z
	    	System.out.print(x + ",");
	    }
	    
	    /*
	      [반복문]
	      for
	      while
	      do~while
	      반복문엔 string이 없음
	    */
	    
	}

}
