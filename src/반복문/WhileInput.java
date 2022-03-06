package 반복문;

import java.util.Scanner;
//여성만 입장 => 여성(입력 1)이 입력할 때까지 입력을 받는 프로그램 작성
//여성이 아닌 경우 계속 입력
 public class WhileInput {
	public static void main(String[] args) {

		int input;
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.println("성별 입력:");
			input=scan.nextInt();
			if(input==1) break; // 가장 가까운 명령어 , { } => 빠져나와라
		}
	}
 }