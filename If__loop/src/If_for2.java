
public class If_for2 {

	public static void main(String[] args) {
	
		//1~100���� ���� �� 80�̻��� ���ڸ� ���
		int f;
		for(f = 1; f < 101; f++) {  //�ݺ��� �ȿ��� ���� �̰� ���� �� ���ǹ��� ���
			if(f >= 80) {
				//System.out.print(f + " ");
			}
		}
		
		/*
		  ���빮��
		  200~300���� ���� �� 240������ ���ڸ� ����Ͻÿ�. 
		*/
		
		int a1;
		for(a1 = 200; a1 <= 300; a1++) {
			if(a1 <=240) {
				//System.out.print(a1 + " ");
			}
		}
		
		final int a = 3;
		int w;
		for(w = 1; w < 11; w++) {
			if(w % a == 0) {
				//System.out.printf("%d " , w);  //print(w + " ")�� ����
			}
		}
		
		/*
		  ���빮��
		  ������ �� 2���� �ݺ��մϴ�. ��, 2�� ����� �� 10�̻� ���ڸ� ����մϴ�.
		*/
		
		final int b1 = 2;
		int b;
		int c;
		for(b = 1; b < 10; b++) {
			c = b * b1;			
			if(c >= 10) {		
				//System.out.print(c + " ");
			}
		}
		
		/*
		  ���빮��
		  ���� ������� ���� ���� �ش� ���� ��µǵ��� �ڵ带 �����Ͻÿ�.
		  18 36 54 72
		
		int p;
		int total3;
		for(p = 1; p <10; p++) {
			total3 = 9 * p;
			if(p%2 == 0) {
			system.out.print(total3 + " ")
		*/
		
	    int i = 9;
		int j;
		int k;
		for(j = 1; j < 10; j++) {
			k = i * j;
			if(k % 2 == 0) {  //  ->  k%18 == 0
				//System.out.print(k + " ");
			}
		}
		
		/*
		  ���빮��
		  ���� ������� ���� �ش� ���� ��µǵ��� �ڵ带 �����Ͻÿ�.
		  1~20 ������ ���� �Դϴ�.
		  6 14 17 19 
		*/
		
		int o;
		for(o = 1; o < 21; o++) {
			if(o == 6 || o == 14 || o == 17 || o == 19) {
				System.out.print(o + " ");
			}
		}
		
	}

}
