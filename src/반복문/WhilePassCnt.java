package 반복문;

import java.util.Scanner;
 public class WhilePassCnt {
	public static void main(String[] args) {
		
		//매서드 선언
		int result = getPassCnt();
		System.out.println("통과자 수 :"+ result +"명");  //참가자수 받기
		
		getAchiveClass(result); //통과자수가 3명이상이면 "우수학급" 출력 => getAchiveClass()
	   }  //main
	
	public static int getPassCnt() {  //매개변수
	       int score;   //점수
		   int passCnt=0; //통과자수
		   final int Cutline=80; 
		   Scanner scan=new Scanner(System.in);
		   
		   while(true) {
			   System.out.print("점수 입력:");
			   score=scan.nextInt( );
			   if(score<0) break; //음수일때
			   if(score>=Cutline) passCnt++;  //80점 이상 통과자수 구하기 
	   }
		   return passCnt; //참가자수 반환하기 
	}
	
	public static void getAchiveClass(int result) {
		if(result>=3) System.out.println("우수학급");
		else System.out.println("우수학급이 아닙니다.");
	}
	 }  //class
