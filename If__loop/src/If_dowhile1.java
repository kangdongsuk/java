
public class If_dowhile1 {

	public static void main(String[] args) {
		
		/*
		  ���빮��
		  ������ 6�� �߿��� 35�̻� ��� ���ڸ� ����Ͻÿ�.
		
		int dw = 1;
		int total;
		do {
			total = 6 * dw;
			if(total >= 35) {
			system.out.print(total+" ");
			}
			dw++;
		}while(dw <= 9);
		*/
		
		int a = 1;
		int b = 6;
		int c;
		do {
			c = b * a;
			if(c >= 35) {
				//System.out.printf("%d " , c);				
			}
			a++;
		}while(a < 10);
		
		/*
		  ���빮��
		  14~27���� ���� �� ¦�� ���� ��� ���Ͽ� ���� ������� ����Ͻÿ�. 
		*/
		
		int i = 14;
		int j = 0;
		do {
			if(i % 2 == 0) {				
			j = j +i;
			}
			i++;
		}while(i < 28);
		System.out.print(j + " ");
		
		
	}

}
