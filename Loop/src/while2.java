
public class while2 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 4;
		int c;
		while(a < 10) {
			c= b*a;		//�������
			//System.out.print(c+ " ");
			a++;
			
			//a++;
			//System.out.println(c+ " ");
		}
		
		/*
		  ���빮��
		  �ش� ������� Ȯ�� �Ͽ� �ݺ������� �ڵ带 �ۼ��Ͻÿ�.
		  56, 49, 42. 35, 28, 21
		*/
		
		int i = 8;
		int j = 7;
		int k;
		while(i >2) {
			k = i * j;
			//System.out.print(k + ", ");
			System.out.printf("%d, ", k);
			i--;
		}
		
		/*
		  ���빮��2
		  ���� ��� ���� Ȯ���� �� �ش� ������� �´� �ڵ带
		  �ۼ��Ͻÿ�.
		  4, 7, 10, 13, 16, 19, 22
		*/
		
		
		
		
	}

}
