import java.util.Scanner;

public class While_scan1 {

	public static void main(String[] args) {
		
		/*
		  ���빮��
		  �� 2���� ������ �ϰ� �˴ϴ�.
		  ����ڰ� ���ڸ� �Է��Ͽ� �� ���� ���� ���ϴ� scanner�� �����Ͻÿ�. 
		*/
		
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int b; //����ڰ� �Է��ϴ� ��
		int total = 0;
		while(a < 3) {
			System.out.println("���� �Է��Ͻÿ�.");  //(a + "��° ���ڸ� �Է��ϼ���.")
			b = sc.nextInt();
			total = total + b;
			a++;
		}
		System.out.println("�� ���� ��: " + total);
		sc.close();
	}

}
