package �ݺ���;
import java.util.Scanner;
public class jusaup {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int dice1;
		int dice2;
		int dice3;
		int sum=0;
		int up=0;

		while(true) {
			System.out.print("���� �Է�1:");
			dice1=scan.nextInt( );
			System.out.print("���� �Է�2:");
			dice2=scan.nextInt( );
			System.out.print("���� �Է�3:");
			dice3=scan.nextInt( );
			if(dice1+dice2+dice3==10) break; // ���� ����� ��ɾ� , { } => �������Ͷ�
			sum+=dice1+dice2+dice3;
		}
		
		 System.out.print("������:"+sum);
}

}
