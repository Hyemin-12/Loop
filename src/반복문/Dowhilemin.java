package �ݺ���;

import java.util.Scanner;;
public class Dowhilemin {

		public static void main(String[] args) {

			int input;
			int min=10000; //��� �� ���� ���� �� 0
			Scanner scan=new Scanner(System.in);
			
			do {
				System.out.println("�����Է�:");
				input=scan.nextInt();
				if(input<= min) {
					min=input; //�Է¹޴� ���� max�� ��� ���ؼ� �ִ� ���ϱ� 
				}
			}while(input!=0); //�Է��� 0�̸� ����
			System.out.println("�ִ�:"+ min);
		}
}
			
			


