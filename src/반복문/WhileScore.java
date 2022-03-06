package 반복문;
//0이 입력될때까지 score를 입력받아 입력이 완료되면 
// 점수의 합과 평균을 출력하는 프로그램을 작성하라.
/* 해결방안 
 * 1. 변수 : 점수(정수) 합(정수) 평균(실수) 정수갯수(반복횟수)
 * 2. while(입력, 정수누적 합, 반복횟수 증가 )=>true, 점수==0 break; 
 * 3. 합 출력, 평균=합/반복횟수
 * 4. 평균 출력
 */

import java.util.Scanner;
 public class WhileScore {
   public static void main(String[] args) {
	   int score;
	   int sum=0;
	   double avg;
	   int count=0;
	   Scanner scan=new Scanner(System.in);
	   
	   while(true) {
		   System.out.print("점수 입력:");
		   score=scan.nextInt( );

		  if(score==0) break;
			   sum+=score;
			   count++;
		   
	   }
	   avg=sum/count;
	   System.out.println("점수합"+sum);
	   System.out.println("평균"+ avg);
   } 
 }
 