import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		
		/*
		 	���빮��
		 	����� �н������ a1234 �Դϴ�.
		 	����ڰ� �н����带 �Է��մϴ�. ��, 3ȸ �̻� ���н� ������ ���� ��� �ǵ��� �մϴ�.
		 	"�н����� Ƚ�� �������� ����� ������ �湮�ϼž� �մϴ�.
		 	��, �н����尡 ���� ��� "�α��� �Ǿ����ϴ�." ��� ��� �Ǿ�� �մϴ�.
		 */
		
		Scanner sc = new Scanner(System.in);		
		
		String mpass = "a1234";
		int a;												
		String b;												
		for(a = 1; a < 4; a++) {
			System.out.println("�н����� �Է��ϼ���");
				b = sc.next();
				if(b.equals(mpass)) {
					System.out.println("�α��� �Ǿ����ϴ�."); 				
				break; //break�� �ݺ����� ���� �����Ҷ� ����մϴ�.
				}
				if(a==3) {
					System.out.println("�н����� Ƚ�� �������� ����� ������ �湮�ϼž� �մϴ�");
					
				}
		}
		sc.close();
		/*
		final String pw = "a1234";
		int c = 3;
		Scanner sc = new Scanner(System.in);
		int w = 0;
		String msg = "�н����带 �Է��� �ּ���";
		while(w < 4) {
			System.out.println("�н����带 �Է��ϼ���.");
			String userpw = sc.next();
			if(pw.equals(userpw)) {				
				System.out.println("�α��� �Ǿ����ϴ�.");
				break;
			}
			else {
				msg = "�н����带 �Է��� �ּ���";
				c--;
			if(c == 0) {
				System.out.println("�н����� Ƚ�� �������� ����� ������ �湮�ϼž� �մϴ�.");
				}
			w++;
			}
		
		
		
		}
		*/
		
	}

}
