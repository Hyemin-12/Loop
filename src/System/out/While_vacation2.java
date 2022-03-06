package System.out;

/*키보드로부터 점수가 100이 나올 때까지 입력을 받아 입력한 점수가
50점 미만인 불통과자 수를 구하는 프로그램을 작성하자 */
import java.util.Scanner;
public class While_vacation2{
	public static void main(String[] args) {
	
		int result =getFCnt();
		System.out.println("불통과자 수 :"+ result +"명");  
	   } 
	
	public static int getFCnt() {  
	                 int score;   
		   int FCnt=0;
		   final int Cutline=50; 
		   Scanner scan=new Scanner(System.in);
		   
		   while(true) {
			   System.out.print("점수 입력:");
			   score=scan.nextInt( );
			   if(score==100) break; 
			   if(score<Cutline) FCnt++; 
	   }
		   return FCnt; 
	}
	 }  