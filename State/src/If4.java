import java.util.Scanner;   
//import : java�� �ִ� ������ �ε��� �� ����ϴ� ���
//export : java�� �ִ� ������ ���� ������ �� �ִ� ���
//java.util ��Ű�� �ȿ� Scanner Ŭ���� �κ��� �ε� �ϰ� �˴ϴ�.
//java.util ��Ű���� �׳� ������� ���ϸ� new�� �Ҵ��Ͽ� �����ڸ� ����ؾ� �մϴ�.
//��, �ش� �ڵ� ��ġ�� �ۼ��ڵ� ���� �Ʒ��� ������ �ȵ˴ϴ�.

public class If4 {

	public static void main(String[] args) {
		
		//new : ��ü�� �����ϴ� ��
		Scanner a = new Scanner(System.in);
		//System.in(�Է�) != System.out(���)
		System.out.println("���̵� �Է��ϼ���.");
		String mid = a.next();
		//next() : ����ڰ� �Է��ϴ� ���¸� ���մϴ�. (����, ���ڸ� �Է¹޴� ����)
		
		System.out.println(mid);
		
	}

}
