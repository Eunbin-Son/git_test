package main;

import java.util.Scanner;

<<<<<<< HEAD
import login.Login;
=======
import member.Member;
>>>>>>> 94cb2667671cf38d619cdbfa8e7e05ed515c7549

public class MainClass {
	public static void main(String[] args) {
		System.out.println("main 시작");
		// kim - 로그인관련 기능 만드세요
		// cho - 회원 관리 기능을 만드세요
		Scanner input = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("1.로그인 2.회원관리");
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
