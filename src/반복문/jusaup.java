package 반복문;
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
			System.out.print("숫자 입력1:");
			dice1=scan.nextInt( );
			System.out.print("숫자 입력2:");
			dice2=scan.nextInt( );
			System.out.print("숫자 입력3:");
			dice3=scan.nextInt( );
			if(dice1+dice2+dice3==10) break; // 가장 가까운 명령어 , { } => 빠져나와라
			sum+=dice1+dice2+dice3;
		}
		
		 System.out.print("점수합:"+sum);
}

}
