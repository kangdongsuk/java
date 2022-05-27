import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		/*
		   응용문제
		   A학생에 대한 성적을 입력 받고 평균점수가 나오는 프로그램을 제작합니다.
		   "점수를 입력하세요?" 라는 문구는 총 5번이 나오게 되며,
		   모든 점수는 합산하여 출력합니다.
		   do ~ while문으로 작성
		   모든 점수는 합산 한 후 5개의 점수에 대한 평균값을 출력하셔야 합니다.
		   출력 메세지는 "해당 점수의 평점은: " 출력
		   단, 평점 점수가 40점 이하 일 경우 "재시험입니다." 라고 메세지를 출력후
		   프로세서는 종료합니다. 40점 이상일 경우 "합격" 이라고 메세지를 출력하십시오.
		   
		   [추가기획]
		   "입력하실 과목 수를 적어주세요:"라고 제일 먼저 출력 후
		   해당 과목 수 만큼 반복문이 적용이 되며, 과목 수 만큼 평균값이 적용되어야합니다.
		   
		 */

		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하실 과목 수를 적어주세요: ");
		int c = sc.nextInt();
		int a = 1;  //5번 반복 시작 지점
		int b = 0;	//모든 점수 합이기 때문에 0
		do {
			System.out.println("점수를 입력하세요?");
			b = b + sc.nextInt(); 
			a++;
		}while(a <= c);
			System.out.println("해당 점수의 평균은: "+  b / c);
		if(b / 5 <= 40) {
			System.out.println("재시험입니다.");
		}
		else {
			System.out.println("합격입니다.");
		}
		
		sc.close();	
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하실 과목 수를 적어주세요: ");
		int subject = sc.nextInt();
		int w = 1;
		int user;
		int total = 0;
		while(w<=subject) {
			System.out.println("점수를 입력하세요?");
			user = sc.nextInt();
			total += user;
			w++;
		}
		int avg = total / subject;		// double avg = (double)(total) / subject;  -> 소수점까지 나옴
		String msg;
		if(avg < 40) {
			msg = " 재시험입니다.";
		}
		else {
			msg = " 합격입니다.";
		}
		System.out.println("최종 평균 점수는" + avg + "점 이며," + msg);
		sc.close();
	}

}
