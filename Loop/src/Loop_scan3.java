import java.util.Scanner;

public class Loop_scan3 {

	public static void main(String[] args) {
		
		/* 
		 Scanner�� �Բ� do~while������ ����ڰ� �Է��ϴ� 
		 ������ ������ ����� ��µǴ� ���α׷��� �����Ͻÿ�.
		*/
		
		Scanner a = new Scanner(System.in);
		System.out.println("������ ���� ���");
		int b = a.nextInt();
		
		int c = 1;
		int d;
		do {
			d = c * b; 
			System.out.printf("%d " , d);
			c++;			
		}while(c < 10);
		
		a.close();
	}

}