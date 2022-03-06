package 반복문;
/* 키보드로부터 각 과목의 점수를 입력받아 90이상이면 A,
80이상이면 B, 70이상이면 C, 70미만일 경우 "재시험"을 출력하는 프로그램을 작성하라 */

import java.util.Scanner; 
public class If_vacation1{
     public static void main(String args[ ]){	
int score;
Scanner scan=new Scanner(System.in);

System.out.print("점수입력:");
score=scan.nextInt( );

if(score>=90){
            System.out.println("성취도 : A");
}else if(score>=80){
            System.out.println("성취도 : B");	
}else if(score>=70){
            System.out.println("성취도 : C");	
}else if(score<70){
            System.out.println("재시험");	
   }
 }
}
