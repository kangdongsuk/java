
public class Example4 {

	public static void main(String[] args) {
		
		/*
		 	���빮��4
		 	���� ������� ���缭 �ڵ尡 ��� �ǵ��� �Ͻÿ�.
		 	�ش� �ڵ�� for������ �ۼ��մϴ�.
		 	
		 	45 35 25 15 10
		 */
				
			int a;
			int b;
			for(a = 9; a > 0; a--) {
				b = 5 * a;
				if(a % 2 == 1 && a != 1 || a ==2) {	//c == 45 || c == 35 || c == 25 || c == 15 || c == 10 ����
						System.out.print(b + " ");					
					
				}
			}
	}
}