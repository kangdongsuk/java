
public class If2 {

	public static void main(String[] args) {
		
		String mid1, mid2,mpass;
		mid1 = "hong";
		mid2 = "kim";
		mpass = "123456";
		/* �ش� ���ǹ��� ���ڷ� Ȯ���ϴ� ���������̸�, else�� �����ϴ� �κ� */
		if(mid1 == "hong") {
		System.out.println("ȯ���մϴ�.");	
		}
		else if(mid1 == "park") {  //�߰��� �񱳴���� ���� ���
			System.out.println("ȯ���մϴ�.");
		}
		
		else {
			System.out.println("���Ե��� ���� ����� �Դϴ�.");
		}
		
		/* ���̵� �� �н����带 ��� �����ϴ� ���� ���ǹ� */
		if(mid2 == "kim") {  //ū if��
			//���� if��
			if(mpass == "a123456") {
				System.out.println("�α��� �ϼ̽��ϴ�.");
			}
			else {
				System.out.println("�н����尡 Ʋ���ϴ�.");
			}
		}
		else {
			System.out.println("���Ե��� ���� ����� �Դϴ�.");
		}
		
	}

}
