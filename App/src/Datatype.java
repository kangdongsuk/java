
public class Datatype {

	public static void main(String[] args) {
		// String : 문자 "" 무조건 사용
		String a = "1234";
		System.out.println(a);
		/* 정수형 끝 */
		byte b = 127; // byte : -128~127
		System.out.println(b);

		short c = 32767;// short : -32,768~32,767
		System.out.println(c);
		int d = 100000; // int : -2,147,483,648 ~ 2,147,483,647
		System.out.println(d);
		long f = 999999999;// long 사용 시 끝에 L 사용해야함 
		// long : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 기본 메모리 할당에서 추가적용시 가능범위가 늘어남
		System.out.println(f);
		/* 정수형끝 */
		
		/* 실수형 */
		float e = 3.5f;//float 사용시 끝에 f사용해야함 3.4000000000000~38
		System.out.println(e);
		
		double h = 44.5;//1.784~308 (d를 유/무 모두됌)
		System.out.println(h);
		/*실수형끝*/
		
		
	}

}
