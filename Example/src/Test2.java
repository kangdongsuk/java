import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		/*
		 ���빮��. ���ǹ� �ڵ带 �ۼ� �Ͻÿ�.
		 ���� �ڽ��� ���忡�� ��,����� �ϴ� ���μ����� �����ؾ� �մϴ�.
		 ���� �⺻ �ڻ� �ݾ� : 100,000��
		 
		 "1�� �Է½� �Ա�, 2�� �Է½� ��� �Դϴ�." ��� �޼�����
		 ���� ���� ���� �Ǿ�� �մϴ�.
		 1���� �Է½� "�ش� �ݾ��� �Է��ϼ���"
		 ����ڰ� �Է��� �ݾ� + �⺻ �ڻ�ݾ��� ����
		 �� �ڻ� �ݾ��� ����Ͻÿ�.
		 
		 2�� �Է½� "����� �ݾ��� �Է��ϼ���"
		 ����ڰ� �Է��� �ݾ� - �⺻ �ڻ�ݾ��� ����Ͽ�
		 �� �ڻ�ݾ��� ����Ͻÿ�.
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println( "1�� �Է½� �Ա�, 2�� �Է½� ��� �Դϴ�.");
		int i = sc.nextInt();
		
		int total = 100000;
		int a;
		if(i == 1) {
			System.out.println("�ش� �ݾ��� �Է��ϼ���");		
			a = total + sc.nextInt();
			System.out.println("�� �ڻ�ݾ��� "+ a);
		}
		else if (i == 2){
			System.out.println("����� �ݾ��� �Է��ϼ���");
			a = total - sc.nextInt();
			System.out.println("�� �ڻ�ݾ���" + a);
		}
		else {
			System.out.println("�������� �ڵ尡 �ƴմϴ�.");
			sc.close();
		}
		*/
		
		int money = 100000;
		Scanner sc = new Scanner(System.in);
		System.out.println( "1�� �Է½� �Ա�, 2�� �Է½� ��� �Դϴ�.");
		int work = sc.nextInt();
		int total;
		Scanner cal = new Scanner(System.in);
		if(work == 1) {
			System.out.println("�Ա� �ݾ� �Է�");
			total = cal.nextInt();
			money = money + total;
		}
		else if(work == 2) {
			System.out.println("��� �ݾ� �Է�");
			total = cal.nextInt();
			money = money - total;	
		}
		else {
			System.out.println("�������� �ڵ尡 �ƴմϴ�.");
		}
		System.out.println("�� �ݾ���" + money);
	}

}
