package 반복문;
import java.util.Scanner;
public class tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int choice;
		int bad=0;
		System.out.print("나무꾼이 실수로 강에 낡은 도끼를 떨어뜨리자 강에서 산신령이 나타났어요");
	
	while(true) {
		System.out.print("\n산신령:니 도끼가 금도끼면 1을 입력하고 ,낡은 도끼면 2을 입력해라:");
		choice=scan.nextInt( );
		if(choice==2) break;
		bad+=choice;
	}
		System.out.println("너는 거짓말을"+ (choice==2)+"번 했으니"+(choice==2)+"만큼 벌을 받자꾸나");
	}

}
