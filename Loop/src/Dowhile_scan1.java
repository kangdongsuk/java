import java.util.Scanner;

public class Dowhile_scan1 {

	public static void main(String[] args) {
		
		/*
		 ���빮��
		 ����ڰ� �� 3���� ���ڸ� �Է� �մϴ�.
		 3�� ���� ��� ���Ͽ� �� �հ踦 ���� ����Ͻÿ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int b;
		long sum = 1;	//long �Է½� ����������� -������ �߻�.
		do {
			System.out.println("���ڸ� �Է��մϴ�.");
			b = sc.nextInt();
			sum = sum * b;
			a++;
		}while(a < 4);
		System.out.println("�� �հ� " + sum);
		sc.close();
	}

}
