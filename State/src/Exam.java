import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		
		//scanner�� import ���

				//�������(����ڰ� � ���� �Է��ϴ����� ���� ����)

				//�ش� ����ڰ� �Է��� ���� �޴� ������ ����

				/*

				 [���빮��]

				 ����ڰ� �Է��Ͽ� ���ǿ� �´� �޼����� ����Ͻÿ�.

				 ù��° ���ڰ��� �Է��ϼ���?

				 �ι�° ���ڰ��� �Է��ϼ���?

				 

				 ù��° ���ڰ� * �ι�° ���ڰ��� ���� ����� ����Ͻÿ�.

				 ��, �ش� ������� 100 ���� �� ���

				 ��¸޼��� "100������ ������Դϴ�." ��� �����ϰ�

				 100�̻��� ��� "�ش� ���� 100�̻� ������� �Դϴ�." ��� ����Ͻÿ�.   

				*/
		Scanner a = new Scanner(System.in);
		System.out.println("ù��° ���ڰ��� �Է��ϼ���.");
		int b = a.nextInt();
		
		Scanner c = new Scanner(System.in);
		System.out.println("�ι��� ���ڰ��� �Է��ϼ���.");
		int d = c.nextInt();
		
		if(b*d <= 100) {
			System.out.println("100������ ������Դϴ�.");
		}
		else {
			System.out.println("�ش� ���� 100�̻��� ������Դϴ�.");
		}
		a.close();
		c.close();
		
		/*
		 ���빮��. ���ǹ� �ڵ带 �ۼ� �Ͻÿ�.
		 ������ �ڽ��� ���忡�� ��,����� �ϴ� ���μ����� �����ؾ� �մϴ�.
		 ������ �⺻ �ڻ� �ݾ� : 100,000��
		 "1�� �Է½� �Ա�, 2�� �Է½� ��� �Դϴ�." ��� �޼�����
		 ���� ���� ���� �Ǿ�� �մϴ�.
		 1���� �Է½� "�ش� �ݾ��� �Է��ϼ���"
		 ����ڰ� �Է��� �ݾ� + �⺻ �ڻ�ݾ��� ����
		 �� �ڻ� �ݾ��� ����Ͻÿ�.
		 
		 2�� �Է½� "����� �ݾ��� �Է��ϼ���"
		 ����ڰ� �Է��� �ݾ� - �⺻ �ڻ�ݾ��� ����Ͽ�
		 �� �ڻ�ݾ��� ����Ͻÿ�.
		*/
		
	}

}