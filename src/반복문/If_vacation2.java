package 반복문;

/* 키보드로부터 나이를 입력받아서 20이상일 경우 "성인",
20미만이 10이상일 경우 "10대", 10미만일 경우 "어린이"를 출력하는 프로그램을 작성하자 */

import java.util.Scanner;
  public class If_vacation2{
     public static void main(String args[ ]){
       int age;
       Scanner scan=new Scanner(System.in);

       System.out.println("나이입력:");
       age=scan.nextInt( );
     
       if(age>=20){
           System.out.println("성인");
        }else if(age<20 && age >=10){
           System.out.println("10대");
        }else if(age<10){
           System.out.println("어린이");
         }
     }
}