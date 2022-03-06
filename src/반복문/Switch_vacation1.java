package 반복문;

/* 키보드로부터 숫자를 입력받아 2의 배수인지 아닌지 판단하는 프로그램을 작성하자 (switch문 사용) */
import java.util.Scanner;
   public class Switch_vacation1{
      public static void main(String args[ ]){
	int n;
	Scanner scan=new Scanner(System.in);
   	System.out.println("숫자 입력:");
	n=scan.nextInt( );
 
              switch(n%2){
	 case 0: System.out.print("2의 배수이다"); break;
    	 case 1:
	 case 2: System.out.print("2의 배수가 아니다");break;
           }
      } 
}
     