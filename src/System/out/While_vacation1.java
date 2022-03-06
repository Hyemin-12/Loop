package System.out;

/*키보드로부터 숫자를 입력받아 짝수가 입력될때까지 입력을 받는 
 * 프로그램을 작성한다 (짝수가 아닐 시 계속 입력) */


import java.util.Scanner;
 public class While_vacation1{
	public static void main(String[] args) {

		int n;
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자 입력:");
			n=scan.nextInt();
			if(n%2==0) break; 
		}
	}
 } 