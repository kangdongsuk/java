
public class If_for {

	public static void main(String[] args) {
		
		
		
		//final int a = 1;	//final�� ���� ���� -> ����� ����
							//���: ���� ������ �ʴ� ���� ���մϴ�.
		/*
		final String name = "ȫ�浿";
		name = "�̼���"                       //����, ����̱� ����
		System.out.println(name);
		*/
		
		//System.out.println(a);
		
		final int ct = 103;				//������
		int f;							//�ݺ���
		boolean ok = false;				//���ǿ� ���� true, false;
		for(f = 1; f < 101; f++) {										
			
			if(f == ct) {	//�ݺ��� ���� �������� ���� ���
				System.out.println("��ϵ� ���� Ȯ�� �˴ϴ�.");
				ok = true;	//���ǿ� ���� ���� ������.
			}
			
				
			
		}	//for�� ����										
		
		if(ok == false) {	//���࿡ �ݺ����� �����µ��� �ݺ��� �ȿ� ���� ������ ���� ��� ��µǴ� �ڵ�.
			System.out.println("Ȯ���� ���� �ʴ� ���� �Դϴ�.");
		}
		
		/* 
		  ���빮��
		  �� 20���� ���� �ݺ��մϴ�. �� �� Ȧ������ ����մϴ�.
		*/
		
		int ff;
		String odd = "";			//odd : Ȧ�� , even : ¦��
		for(ff = 1; ff < 21; ff++) {
			
			if(ff % 2 == 1) {  //ff % 2 != 0
				System.out.print(ff + " ");
			}
			else {		//���࿡ Ȧ�� ���� ��� odd ������ ���������� ���� �߰��ϰ� ��
				odd = ff + ""; // ������ Ȧ���� ����  -> Ȧ�� �� ������ �Ϸ��� odd = odd + ff + " "; <-> odd += ff + " ";  //�߰� �� ��� " "  ������� Ȱ���Ͽ� ����
			}
			
		}
		System.out.println(odd);
	}

}
