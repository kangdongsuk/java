import java.util.Scanner;

public class Scan4 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.println("�Է��� ������ �����ּ���!");
		//String memo = a.next();  // next() : �����̽��� �Է±����� ����
		
		String memo = a.nextLine();   //nextline() : �����̽��� ���� ��� �Է�����
		System.out.println(memo);
		
		a.close();   //scanner ���Ḧ �⺻���� ���� ���־�� �Ѵ�.
		
		String mid = "park";   //string + ���� = %s
		int age = 25;          //���ڴ� %d
		/*
		 [�߿����]
		 %f : float, double
		 %t : date, time �ð�, ��¥
		 %b : boolean(true,false)
		*/
		
		
		//System.out.println(mid + "���� ���̴�" + age + "�Դϴ�.");
		//printf : f��� ���� format�� ���մϴ�.		
		System.out.printf("%s���� ���̴� %d �Դϴ�.", mid, age); 
		
	}

}