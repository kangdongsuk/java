import java.util.Scanner;

public class Scan5 {

	public static void main(String[] args) {

		byte a = 10;
		if (a < 10) {
			System.out.println("�Է��� ���� 10�̻� ���ڸ� �Է��ϼ���.");
		} else if (a >= 10 || a <= 22) { // ���ǹ��� ������ �����Ͽ� ������
			System.out.println("��÷�Դϴ�.");
		} else {
			System.out.println("���� ���� ���� �Դϴ�.");
		}
		
		/*
		 * ���빮�� 1~45���� ���� �ϳ��� �Է��ϼ���?
		 * 
		 * error���� 0�� �Է� : �����Է��� �߸� �Ǿ����ϴ�. 45���� ū ���ڸ� �Է� : ���ڴ� 1~45������ �Է� �����մϴ�.
		 * 
		 * 1~45���ڸ� �Է��Ͽ��� ��� 7,12,14 ������ ���ڰ� �Է½� ��÷�Դϴ�. ��� ��� �� �ܿ� ���ڽ� ������ȸ�� �����ϼ��� ��� ���
		 */

		Scanner number = new Scanner(System.in);
		System.out.println("1~45���� ���� �ϳ��� �Է��ϼ���?");

		int i = number.nextInt();
		if (i == 0) {
			System.out.println("���� �Է��� �߸� �Ǿ����ϴ�.");
		} else if (i >= 1 && i < 46) {
			if (i == 7 || i == 12 || i == 14) {
				System.out.println("��÷�Դϴ�.");
			} else {
				System.out.println("�� �ܿ� ���ڽ� ������ȸ�� �����ϼ���.");
			}
		} else {
			System.out.println("���ڴ� 1~45������ �Է� �����մϴ�.");
		}
		
		
		}
		
		
	}


