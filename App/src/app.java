
public class app {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c;
		// ��Ģ�����ȣ : +, -, *, /

		// c= a+b;
		// c = a - b;
		// c = a * b;
		c = a / b;
		System.out.println(c);

		String a1 = "ȫ�浿";
		String b1 = "ȯ���մϴ�";
		String c1;
		c1 = a1 + b1;// �������� �϶� +�� ����+���ڿ��� ǥ���� �� �ֽ��ϴ�.
		System.out.println(c1);

		
		
		/* ���빮��
		 * ������ ���� ��µǴ� �ڵ带 �ϼ��Ͻÿ�.
		 * ȫ�浿�� �������� 50000�Դϴ�.
		 * ��, ȫ�浿�� 50000�� ���� ���������� ��ȭ�� �� �ֽ��ϴ�.  
		 */
		
		String j = "ȫ�浿";
		int k = 50000;
		System.out.println(j+"�� �������� " + k + " �Դϴ�.");
		
		/*
		 * ���빮��
		 * �Ƹ��� ����Ʈ���� ��ǰ�� ���� �߽��ϴ�.
		 * ��ٱ��Ͽ� ���� ��ǰ ������ ��� ���ؼ� �� ���� �ݾ��� 
		 * ��µǵ��� �Ͻÿ�. �� $ ȯ���� ��� �Ǿ�� �մϴ�.
		 * 8.25
		 * 4.02
		 * 3.71
		 ������� ������ ���� ����ϼ���.
		 �� �����ݾ� $ �Դϴ�. */
		
	 double p = 8.25;
	 double o = 4.02;
	 double i = 3.71;
	 double t=p+o+i;
	 System.out.println("�� �����ݾ�$"+t+"�Դϴ�.");
	 
	 
	 int u = 3;
	 int r = 9;
	 double w= (double)u/r; //���������� �ڷ��� ���� �ִ� �ڵ�
	 System.out.println(w);
	 
	 
	 
		

	}

}
