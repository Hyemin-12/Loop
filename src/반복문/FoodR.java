package �ݺ���;

import java.util.Scanner;
public class FoodR {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			
			int food;
			int eat;
			int choice;
			int menu;
			 System.out.println("������ ���̸� �� �� �� �ִ� ��³� �Ĵ翡 ���� ���� ȯ���մϴ�~\n"
			 		+ "\n��----------��³��� �ѽ� �޴���  ---------��\n"
			 		+ "¬�ɷ��� �ڽ�1 : �ҹ�, ������, �ſ� ����ä, �Ұ��, ��\n"
			 		+ "���� ��� �ڽ�2 : ���̹�, �ᳪ����, �̿��ٱ�, ���\n"
			 		+ "������ ���� �ڽ�3 : �����Ա�, ��������, ������ħ, ������, ����Ķ���\n"
			 		+ "���� : ����, �̼�����, ������, ��ȭ��, ������, �ݶ�, ���̴� (�� 1)\n"
			 		+ "�⺻ ���� : ��ġ, ��ġ��, �������, ��ä, ��ġ����, ���̺��߹�ħ");
		       System.out.println("----------------------------------");
		 
while(true) {
	System.out.print("� �ڽ������� �ֹ��Ͻðڽ��ϱ� \n�ڽ� �Է�:");
	food=scan.nextInt();
	if(food==1||food==2||food==3)break;
}
		while(true) {
			System.out.print("�⺻ ������ �߰��Ͻðڽ��ϱ�? \n��=0 | �ƴϿ�=1  �Է�:");
			eat=scan.nextInt();
			if(eat==0||eat==1)break;
			else{
			System.out.println("�������� �ʴ� �ڽ��̰ų� �߸� �Է��ϼ̽��ϴ�.");
		}
		}
		while(true) {
			System.out.print("��� ���Ḧ �����Ͻðڽ��ϱ�?(���Ÿ� ���� �� 2 �Է�, ������ ���� �� 3�Է�) \n���� �Է�");
			choice=scan.nextInt();
			if(choice==2||choice==3) break;
		}
		}
}

			/*while(true) {
				System.out.print("��� ������ ������. \n 1. �ѽ� \n 2. �߽� \n 3. �Ͻ� \n 4. ��Ÿ \n");
				food = scan.nextInt();
				if (food == 1) {
					cnt1++;
				} else if (food == 2) {
					cnt2++;
				} else if (food == 3) {
					cnt3++;
				} else if (food == 0) break; //0�� �Է��ϴ� ���� �� �԰ڴٴ� ��
				} 
			System.out.println("��ǰ��     " + cnt1 + "�� �Է�, " + "�߽��� " + cnt2 + "�� �Է�, " + "�Ͻ��� " + cnt3 +" �� �ԷµǾ����ϴ�.");*/
		

