package 반복문;
//0을 입력하면 종료
//양수만 입력한다고 가정
//입력받은 숫자 중 최대값 찾기
/* 해결방법
 * 1.max 변수선언=> 초기값 0
 * 2. if(입력 받은 수 > max)   => max = 입력받은수(max에 넣는다)
 * 3. 반복
 */
import java.util.Scanner;
public class DowhileMax {
		public static void main(String[] args) {

			int input;
			int max=0; //양수 중 가장 작은 값 0
			Scanner scan=new Scanner(System.in);
			
			do {
				System.out.println("숫자입력:");
				input=scan.nextInt();
				if(input>= max) {
					max = input ; //입력받는 값을 max와 계속 비교해서 최댓값 구하기 
				}
			}while(input!=0); //입력이 0이면 종료
			System.out.println("최댓값:"+ max);
		}
}
			
			
