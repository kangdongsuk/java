
public class Example6 {

	public static void main(String[] args) {
		
		/*
		   ���빮��6
		   1~10���� ���������� �����ϴ� �ݺ����� �ֽ��ϴ�.
		   ��, 1~5������ ��簪�� ���ϰ�, 6~10������ ��簪�� ���մϴ�.
		   �ش� �ΰ��� ���� ���Ͽ� ���Ѱ��� ū��, ���Ѱ��� ū���� ����� ����Ͻÿ�.
		 */
		
		/*
		int a;
		int b = 1;	//���ϱ��̱� ������ 0�� �ƴ� 1�� ����
		int c = 0;  //���ϱ��̱� ������ 0���� ����
		for(a = 1; a < 11; a++) {
			if(a < 6) {
				b *= a;		//b = b * a
			}
			else if(a > 5) {
				c += a;		//c = c + a
			}
		}
		if(b > c) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
		*/
		
		int w = 1;
		int total = 0; //���ϱ�
		int total2 = 1; //���ϱ�
		
		while(w <= 10) {
			if(w <= 5) {
				total2 = total2 * w;
			}
			else {
				total = total + w;
			}
			w++;
		}
		if(total2 < total) {
			System.out.println("���Ѱ��� Ů�ϴ�.");
		}
		else if(total2 > total) {
			System.out.println("���Ѱ��� Ů�ϴ�.");
		}
		else {
			System.out.println("�� �񱳰��� �����ϴ�.");
		}
	}

}
