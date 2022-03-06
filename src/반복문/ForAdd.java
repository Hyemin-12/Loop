package 반복문;
//숫자를 입력받아서 1~n까지의 숫자의 합을 구하시오 (단, method 이용하기)
import java.util.Scanner;
public class ForAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("숫자 입력:");
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

