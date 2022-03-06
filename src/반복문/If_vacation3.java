package 반복문;

/*키보드로부터 핸드폰 사용시간을 입력받아 10시간 이상이면 "중독", 
 * 6시간 이상 10시간 미만일 경우 "주의",
6시간 미만일 경우 "좋음"을 출력하는 프로그램을 작성*/

import java.util.Scanner;
  public class If_vacation3{
     public static void main(String args[ ]){
       int time;
       Scanner scan=new Scanner(System.in);

       System.out.println("시간입력:");
       time=scan.nextInt( );
     
       if(time>=10){
           System.out.println("중독");
        }else if(time>=6 && time <10) {
           System.out.println("주의");
        }else if(time<6) {
           System.out.println("좋음");
         }
     }
}