import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		/*
		   ���빮��
		   A�л��� ���� ������ �Է� �ް� ��������� ������ ���α׷��� �����մϴ�.
		   "������ �Է��ϼ���?" ��� ������ �� 5���� ������ �Ǹ�,
		   ��� ������ �ջ��Ͽ� ����մϴ�.
		   do ~ while������ �ۼ�
		   ��� ������ �ջ� �� �� 5���� ������ ���� ��հ��� ����ϼž� �մϴ�.
		   ��� �޼����� "�ش� ������ ������: " ���
		   ��, ���� ������ 40�� ���� �� ��� "������Դϴ�." ��� �޼����� �����
		   ���μ����� �����մϴ�. 40�� �̻��� ��� "�հ�" �̶�� �޼����� ����Ͻʽÿ�.
		   
		   [�߰���ȹ]
		   "�Է��Ͻ� ���� ���� �����ּ���:"��� ���� ���� ��� ��
		   �ش� ���� �� ��ŭ �ݺ����� ������ �Ǹ�, ���� �� ��ŭ ��հ��� ����Ǿ���մϴ�.
		   
		 */

		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է��Ͻ� ���� ���� �����ּ���: ");
		int c = sc.nextInt();
		int a = 1;  //5�� �ݺ� ���� ����
		int b = 0;	//��� ���� ���̱� ������ 0
		do {
			System.out.println("������ �Է��ϼ���?");
			b = b + sc.nextInt(); 
			a++;
		}while(a <= c);
			System.out.println("�ش� ������ �����: "+  b / c);
		if(b / 5 <= 40) {
			System.out.println("������Դϴ�.");
		}
		else {
			System.out.println("�հ��Դϴ�.");
		}
		
		sc.close();	
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է��Ͻ� ���� ���� �����ּ���: ");
		int subject = sc.nextInt();
		int w = 1;
		int user;
		int total = 0;
		while(w<=subject) {
			System.out.println("������ �Է��ϼ���?");
			user = sc.nextInt();
			total += user;
			w++;
		}
		int avg = total / subject;		// double avg = (double)(total) / subject;  -> �Ҽ������� ����
		String msg;
		if(avg < 40) {
			msg = " ������Դϴ�.";
		}
		else {
			msg = " �հ��Դϴ�.";
		}
		System.out.println("���� ��� ������" + avg + "�� �̸�," + msg);
		sc.close();
	}

}
