package main;

import java.util.Scanner;

<<<<<<< HEAD
import login.Login;
=======
import member.Member;
>>>>>>> 94cb2667671cf38d619cdbfa8e7e05ed515c7549

public class MainClass {
	public static void main(String[] args) {
		System.out.println("main ����");
		// kim - �α��ΰ��� ��� ���弼��
		// cho - ȸ�� ���� ����� ���弼��
		Scanner input = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("1.�α��� 2.ȸ������");
			num = input.nextInt();
			switch(num) {
			case 1:
				Login lo = new Login();
				lo.login();
				break;
			case 2:
				Member m = new Member();
				m.member();
				break;
			}
		}
	}
}
