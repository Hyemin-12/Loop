package 반복문;

import java.util.Scanner;;
public class Dowhilemin {

		public static void main(String[] args) {

			int input;
			int min=10000; //양수 중 가장 작은 값 0
			Scanner scan=new Scanner(System.in);
			
			do {
				System.out.println("숫자입력:");
				input=scan.nextInt();
				if(input<= min) {
					min=input; //입력받는 값을 max와 계속 비교해서 최댓값 구하기 
				}
			}while(input!=0); //입력이 0이면 종료
			System.out.println("최댓값:"+ min);
		}
}
			
			


