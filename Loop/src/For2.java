
public class For2 {

	public static void main(String[] args) {
		
		int a;     //for�� �ʱⰪ
		int b =2;  //���꿡 ����� ����
		int c;    //������ ����� ���
	    for(a = 1; a <= 9; a++) {
	    	c = b * a;  //������� �۾�
	    	//System.out.print(c+",");  //����� ������� �����
	    }
	    
	    /*���빮��
	    ���� ������� ���� �ڵ带 �ۼ��Ͻÿ�.
	    45, 40, 35, 30, 25, 20
	    */
	    
	    int a1;			//for ������
	    int b1 = 5;		//5�����
	    int c1;			//��갪
	    for(a1 = 9; a1 > 3; a1--) {
	    	c1 = a1 * b1;
	    	//System.out.print(c1 + ",");
	    }
	    
	    /*
	     ���빮�� ���� ������� Ȯ�� �� �ڵ带 �����Ͽ� ����Ͻÿ�.
	     11,22,33,44,55,66,77,88,99
	    */
	    
	    int a2;
	    int b2 = 11;
	    int c2;
	    for(a2 = 1; a2 < 10; a2++) {
	    	c2 = a2 * b2;
	    	//System.out.print(c2 + ",");
	    }
	    
	    int z; //for
	    int x; //�����
	    
	    for(z = 1; z < 10; z++) {
	    	x = (10*z) + z;  //x = 11 * z
	    	System.out.print(x + ",");
	    }
	    
	    /*
	      [�ݺ���]
	      for
	      while
	      do~while
	      �ݺ����� string�� ����
	    */
	    
	}

}
