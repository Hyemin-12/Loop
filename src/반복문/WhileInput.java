package �ݺ���;

import java.util.Scanner;
//������ ���� => ����(�Է� 1)�� �Է��� ������ �Է��� �޴� ���α׷� �ۼ�
//������ �ƴ� ��� ��� �Է�
 public class WhileInput {
	public static void main(String[] args) {

		int input;
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.println("���� �Է�:");
			input=scan.nextInt();
			if(input==1) break; // ���� ����� ��ɾ� , { } => �������Ͷ�
		}
	}
 }