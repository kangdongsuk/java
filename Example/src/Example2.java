import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		
		/*
		  ���빮��2
		  ����ڰ� �Է��� ���ڿ� ���缭 �������� �۵��Ǹ�.
		  ������ ����� ����Ͽ� ¦�� ���� Ȧ�� ������ ����Ͻÿ�.
		  
		  "�����ܿ� ���� ���ڸ� �Է��ϼ���?" ��� �޼����� ��µǸ�
		  �ش� ���ڿ� ���缭 ��� ����� ���ϸ�,
		  ���� ���� ���� ¦�� ���� Ȧ�� ������ ����ϸ� �˴ϴ�.
		  ��. �ش� �ݺ����� for ~ do while������
		  �Ѱ����� �����ؼ� �ۼ��Ͻÿ�.
		  ��Ʈ : �ݺ��� �ȿ� ���ǹ��� ���� �ȵ˴ϴ�.
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�����ܿ� ���� ���ڸ� �Է��ϼ���?");
		
		int a;
		int b;
		int c = 1;
		for(a = 1; a < 10; a++) {
			for(b = 1; b < 10; b++)
			b = sc.nextInt();
			c = b * a;
		}
		System.out.println("c");
		

	}

}
