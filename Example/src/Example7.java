import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		
		/*
		   ���빮��7
		   ����ڰ� ���� ������ Ȯ���Ͽ� ���� �Է� �� �ش� ����� �����ϴ� ���μ����� �����Ͻÿ�.
		   "ù��° �Է°� ��(1~10����) �Դϴ�.":
		   "�ι�° �Է°� ��(1~10����) �Դϴ�.":
		   "����° �Է°� ��(1~10����) �Դϴ�.":
		   "������ ���� �Դϴ�. �ش� �� ���� ���� ���� �����ȣ�� �����ÿ�." +, -, *, /
		   
		   �ش� �����ȣ�� �°� ������ �����Ͽ� �������� ��½�Ű�ÿ�.
		   (�ݺ����� �Ƚᵵ �Ǹ� ���ǹ��� �ʿ�)
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° �Է°� ��(1~10����) �Դϴ�.");
		int i = sc.nextInt();
		System.out.println("�ι�° �Է°� ��(1~10����) �Դϴ�.");
		int j = sc.nextInt();
		System.out.println("����° �Է°� ��(1~10����) �Դϴ�.");
		int k = sc.nextInt();
		System.out.println("������ �����Դϴ�. �� ���� ���� ���� �����ȣ�� �����ÿ�.");
		String z = sc.next();
		
		int a;  //���ϱ�, ����    ��� ��
		int b;  //���ϱ�, ������   ��� ��
		if(z.equals("+")) {				// a == b  -> a.equals("b")
			System.out.println(a = i + j + k);  // (i + j + k)
		}
		else if(z.equals("-")) {
			System.out.println(a = i - j - k);  // (i - j - k)
		}
		else if(z.equals("*")) {
			System.out.println(b = i * j * k);	//(i * j * k)
		}
		else if(z.equals("/")) {
			System.out.println(b = i / j / k); //(j / j / k)    �Ҽ����� ������ �Ϸ��� float, double ���
		}
	}

}
