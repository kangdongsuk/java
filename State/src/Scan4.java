import java.util.Scanner;

public class Scan4 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.println("입력할 내용을 적어주세요!");
		//String memo = a.next();  // next() : 스페이스바 입력까지만 적용
		
		String memo = a.nextLine();   //nextline() : 스페이스바 포함 모두 입력적용
		System.out.println(memo);
		
		a.close();   //scanner 종료를 기본으로 적용 해주어야 한다.
		
		String mid = "park";   //string + 숫자 = %s
		int age = 25;          //숫자는 %d
		/*
		 [중요사항]
		 %f : float, double
		 %t : date, time 시간, 날짜
		 %b : boolean(true,false)
		*/
		
		
		//System.out.println(mid + "님의 나이는" + age + "입니다.");
		//printf : f라는 뜻이 format을 뜻합니다.		
		System.out.printf("%s님의 나이는 %d 입니다.", mid, age); 
		
	}

}
