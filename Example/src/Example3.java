import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		
		/*
		  ���빮��3
		  ����ڰ� �ش� ���� �Է��մϴ�.
		  ��, ����ڰ� 2���� ���ڸ� �Է��ϵ� ù ��° ���ڿ� �� ��° ���� ����
		  �ȿ� �ִ� ��� ���ڸ� ���ؼ� ������� �������� �����Ͻÿ�.
		  ��, �ش� �ڵ�� do ~ while �ۼ��մϴ�.
		  
		   ����)
		   ù���� ���� ���ڴ�? 5
		   �ι�° ���� ���ڴ�? 10
		   ���� ���� ��� �հ�� : 45 �Դϴ�.
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���� ���ڴ�?");
		int i = sc.nextInt();	
		
		Scanner sc1 = new Scanner(System.in);   //��ĳ�ʴ� �ݺ������ ������ �� �κ� ������ �������
		System.out.println("ù��° ���� ���ڴ�?");
		int j = sc1.nextInt();
		
		int a = 0;
		do {
			a += i  ;
			i++;
		}while(i <= j);
		System.out.println("���� ���� ��� �հ�� : "+ a);
		sc.close();
	}

}
