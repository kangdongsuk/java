import java.util.Scanner;

public class Scan3 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
			System.out.println("����ڰ� ���ϴ� ���ڸ� �Է��ϼ���?");
			int b = a.nextInt();
			// %�� ���� �����鼭 ���������� Ȯ���ϴ� ���ı�
			if (b % 2 == 0) {
				System.out.println("¦�� �Դϴ�.");
			}
			else {
				System.out.println("Ȧ�� �Դϴ�.");
			
			
			}
	}

}
