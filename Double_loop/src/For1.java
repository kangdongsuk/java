
public class For1 {

	public static void main(String[] args) {

		// ������ 2~3�� ���

		int f, ff; // �ݺ����� ����� ���� ������ �̸� ��
		for (f = 2; f <= 3; f++) { // [ū �ݺ���] 2~3������ �ݺ���
			for (ff = 1; ff <= 9; ff++) { // [���� �ݺ���] 1~9���� �ݺ�
				// System.out.println(f + "*" + ff); //���� �ݺ����� �۵��� �� ���� ����� ���
			}
		}

		/*
		  ���빮�� 
		  ������ 5�ܺ��� 7�ܱ��� ����� �ϵ�, 4������ ���������� ������ ���ı��� ����Ͻÿ�. 
		  5*1 ~ 7*4 
		  �ش� ������� �� �հ踦 ����Ͻÿ�.
		 */

		int a;
		int b;
		int c = 0;
		for (a = 5; a <= 7; a++) {
			for (b = 1; b <= 4; b++) {
				c = c + (a * b);
				//System.out.print(a + "*" + b);
			}
		}
		System.out.println(c);
	}

}
