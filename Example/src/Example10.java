import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {
		/*
		   ���빮��10
		   ���� �̿����� ���� ���� ���α׷��� �����ϰ� �˴ϴ�.
		   ���� �׸��� ��ü 3�����̸�,
		   ��� true�� ���� �Ǿ�߸� ���� ���μ����� ������ �˴ϴ�.
		   ����ڿ��� ���� �Ǵ� ������ ������ �����ϴ�.
		   "�����׸� �����Ͻðڽ��ϱ�?" ��� �޼��� ��� ������(1), ���Ⱦ���(2)
		   
		   ���� �׸��� �Ѱ����� �������� ���� ���
		   "��� ���� �ϼž߸� ���� �˴ϴ�." ��� ��� �մϴ�.
		   ��� ���� �Ͽ��� ���
		   "ȸ�������� �Ϸ� �Ǿ����ϴ�." ��� ����մϴ�.
		 */
		
//		Scanner sc = new Scanner(System.in);
//		int i = sc.nextInt();
//		int a;
//		boolean b = true, c = false; 
//		
//		for(a = 1; a <= 3; a++) {
//			System.out.println("�����׸� �����Ͻðڽ��ϱ�?");
//		
//			if(i == 1) {
//				System.out.println("������");	
//			}
//			else if(i == 2) {
//				System.out.println("���Ǿ���");
//			}
//		
//		}
//		if() {
//			System.out.println("��� ���� �ϼž߸� ����˴ϴ�.");
//		}
//		else {
//			System.out.println("ȸ�������� �Ϸ� �Ǿ����ϴ�.");
//		}
		
		
		Scanner sc = new Scanner(System.in);
		int w = 1;
		int agree;
		boolean all_agree = false;
		do {
			System.out.println("�����׸� �����Ͻðڽ��ϱ�? ��� �޼��� ��� ������(1), ���Ⱦ���(2)");
			agree = sc.nextInt();
			if(agree == 1) {
				all_agree = true;
			}
			else {
				all_agree = false;
				// break; �Է½� ���Ǿ��� üũ�ϸ� "��� �����ϼž߸� ����˴ϴ�." ���
			}
			w++;
		}while(w <= 3);
		
		if(all_agree == false) {
			System.out.println("��� ���� �ϼž߸� ����˴ϴ�.");
		}
		else {
			System.out.println("ȸ�������� �Ϸ� �Ǿ����ϴ�.");
		}
		sc.close();
	}

}
