
public class If3 {

	public static void main(String[] args) {

		//boolean : ture, false�� �����ϰ� �˴ϴ�.
		boolean ck = false;
		if(ck == true) {
			System.out.println("ȸ�������� ���� �˴ϴ�.");
		}
		else {
			System.out.println("�̿����� �����ϼž߸� ���� �˴ϴ�.");
		}
		
		String mid, mpass;
		mid = "lee";
		mpass = "a1234";
		
		// && : �Ѱ��� ���� �̻� ��� ���� ���
		// || : �Ѱ��� ���� �̻󿡼� �Ѱ��� ���� ���
		
		if(mid == "park" && mpass == "a1234") {
			System.out.println("�α��� �ϼ̽��ϴ�.");
		}
		else {
			System.out.println("���̵� �� �н����带 Ȯ���ϼ���");
		}
		
		if(mid == "park" || mid == "kim") {
			//if(mid == "park" || mpass == "a1234") { // �� ���� �߿� �Ѱ����ε� ���� ���
			System.out.println("ȸ���� Ȯ�� �Ǿ����ϴ�.");
		}
		else {
			System.out.println("Ȯ�ε� ���̵� �����ϴ�.");
		}
	}

}
