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
		int i = sc.nextInt();
		
		int a;
		int b = 0;
		for(a = 1; a < 10; a++) {
			b = b + (a * i); 	//b += b*a;
		}
		if(b%2 == 0) {  //b%2 != 1
			System.out.println("¦��");
		}
		else {
			System.out.println("Ȧ��");			
		}
		
		
		/*
		 	Scanner sc = new Scanner(System.in);
		 	String msg = "�����ܿ� ���� ���ڸ� �Է��ϼ���?"
		 	String msg2;  // �޼��� ����
		 	System.out.println(msg);
		 	int user = se.nextint();
		 	
		 	int f = 1;
		 	int total = 0;
		 	do{
		 		total = total + (user * f);
		 		f++;
		 	}while(f < 10);
		 	System.out.println(total);
		 	if(total % 2 == 0) {
		 		msg2 = "¦��";
		 	}
		 	else {
		 		msg2 = "Ȧ��";
		 	}	
		 		System.out.println("������� " + msg2 + " �Դϴ�.")
		*/

	}

}
