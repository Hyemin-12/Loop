package �ݺ���;
import java.util.Scanner;
public class tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int choice;
		int bad=0;
		System.out.print("�������� �Ǽ��� ���� ���� ������ ����߸��� ������ ��ŷ��� ��Ÿ�����");
	
	while(true) {
		System.out.print("\n��ŷ�:�� ������ �ݵ����� 1�� �Է��ϰ� ,���� ������ 2�� �Է��ض�:");
		choice=scan.nextInt( );
		if(choice==2) break;
		bad+=choice;
	}
		System.out.println("�ʴ� ��������"+ (choice==2)+"�� ������"+(choice==2)+"��ŭ ���� ���ڲٳ�");
	}

}
