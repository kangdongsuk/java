
public class While1 {

	public static void main(String[] args) {
		
		int a = 1;		//while ���۰�
		while(a < 11) { //while ������, ���ᰪ
			
			//System.out.print(a + ",");
			a++;        //���� or ����
		}
		
		int b = 10;
		while(b > 4) {
			//System.out.print(b + ",");
			b--;
		}
		
		/*
		 ���빮��
		 ���� ������ while������ �ۼ��Ͻÿ�.
		 22~16���� ���ڸ� ����Ͻÿ�.
		*/
	
		int c = 22;
		while(c >15) {
			//System.out.print(c + ",");
			//System.out.printf("%d" + c);
			c--;
		}
		
		int aa = 1;			//�ʱⰪ
		int bb = 10;		//���ᰪ
		while(aa <= bb) {	//�ݺ��� ����
			//System.out.printf("%d" ,aa);
			aa++;	//����
		}
		
		/*
		 ���빮�� ���� 2���� �̿��Ͽ� ������ �°� ���� ����Ͻÿ�.
		 99~47���� ����Ͻÿ�. 
		*/
		
		int a1 = 99;
		int b1 = 47;
		while(a1 >= b1) {
			System.out.printf("%d,", a1);
			a1--;
		}

	}

}
