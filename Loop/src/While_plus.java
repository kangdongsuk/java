
public class While_plus {

	public static void main(String[] args) {
		
		/*
		   5~10���� ���� �հ� ���� ����Ͻÿ�.
		*/
		
		int a =5;	//�ʱⰪ
		int total = 0;	//�հ�ġ�� ������Ű�� ���� ������
		while(a < 11) {	// += , -=, *=, /=, %=
			total = total + a;	// total += a;
			a++;
		}
		//System.out.println("�հ�:" + total);
		
		/*
		  ���빮��
		  3~8���� ���� �� �հ� ���� ����Ͻÿ�
		*/
		
		int a1 = 3;
		int b1 = 1; //���ϱ� �հ踦 ������ 1�⺻������ ����
		while(a1 < 9) {
			b1 = b1 * a1;
			a1++;
		}
		System.out.println("���� �� �հ�:" + b1);
	}

}
