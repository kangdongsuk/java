import java.util.Scanner;

public class Scan5 {

	public static void main(String[] args) {

		byte a = 10;
		if (a < 10) {
			System.out.println("입력한 값은 10이상 숫자를 입력하세요.");
		} else if (a >= 10 || a <= 22) { // 조건문에 범위를 설정하여 적용함
			System.out.println("당첨입니다.");
		} else {
			System.out.println("범위 밖의 숫자 입니다.");
		}
		
		/*
		 * 응용문제 1~45까지 숫자 하나를 입력하세요?
		 * 
		 * error문구 0을 입력 : 숫자입력이 잘못 되었습니다. 45보다 큰 숫자를 입력 : 숫자는 1~45까지만 입력 가능합니다.
		 * 
		 * 1~45숫자를 입력하였을 경우 7,12,14 세가지 숫자가 입력시 당첨입니다. 라고 출력 그 외에 숫자시 다음기회에 참여하세요 라고 출력
		 */

		Scanner number = new Scanner(System.in);
		System.out.println("1~45까지 숫자 하나를 입력하세요?");

		int i = number.nextInt();
		if (i == 0) {
			System.out.println("숫자 입력이 잘못 되었습니다.");
		} else if (i >= 1 && i < 46) {
			if (i == 7 || i == 12 || i == 14) {
				System.out.println("당첨입니다.");
			} else {
				System.out.println("그 외에 숫자시 다음기회에 참여하세요.");
			}
		} else {
			System.out.println("숫자는 1~45까지만 입력 가능합니다.");
		}
		
		
		}
		
		
	}


