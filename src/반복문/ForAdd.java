package �ݺ���;
//���ڸ� �Է¹޾Ƽ� 1~n������ ������ ���� ���Ͻÿ� (��, method �̿��ϱ�)
import java.util.Scanner;
public class ForAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("���� �Է�:");
		int number=scan.nextInt( );
		int sum=0;
	    AddTwo(number,sum);
	}
	
		public static void AddTwo(int number, int sum) {
		for(int i=1; i<=number; i++) {
			sum+=i;
		}
			System.out.println(sum);
		

	}
	}

