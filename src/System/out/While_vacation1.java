package System.out;

/*Ű����κ��� ���ڸ� �Է¹޾� ¦���� �Էµɶ����� �Է��� �޴� 
 * ���α׷��� �ۼ��Ѵ� (¦���� �ƴ� �� ��� �Է�) */


import java.util.Scanner;
 public class While_vacation1{
	public static void main(String[] args) {

		int n;
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.println("���� �Է�:");
			n=scan.nextInt();
			if(n%2==0) break; 
		}
	}
 } 