import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		/*
		 ���빮��
		 while������ �ڵ带 �ۼ��ؾ� �ϸ�, ���μ����� ������ �����ϴ�.
		 ����ڰ� ��ǰ�� ��ü �����Ͽ����ϴ�.
		 "7000 �����Ͻðڽ��ϱ�?" ��� ��µǸ�. ���� 1�̶�� �Է��ϸ�
		 �������� �ݾ׿� �߰� �Ǿ����ϴ�. ��, 2��� �Է½�
		 �������� �ݾ׿� �߰� �Ǿ����� �ȵ˴ϴ�. 
		 
		 �� ���� Ƚ���� 4�� �Դϴ�.
		 �������� ���� ���� �ݾ��� �������� �ڵ带 �ۼ��Ͻÿ�.
		*/
		
		Scanner sc = new Scanner(System.in);
		final int money = 7000;
		int a = 1;
		int b;
		int total = 0;
		while(a < 5) {
			System.out.println("7000 �����Ͻðڽ��ϱ�?");		
			b = sc.nextInt();
			if(b == 1) {
				total = total + money;
			}
			a++;
		}
		System.out.println("�����ݾ���: " + total);
	}

}
