package 반복문;
//10명의 점수를 입력 받아 오름차순으로 점수를 정렬하는 프로그램을 작성하라.

import java.util.Scanner;
public class Array_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int score[]=new int[10];
		int temp;
		
		for(int i=0;i<score.length;i++) {
			System.out.print("점수입력:");
			score[i]=scan.nextInt();
			while(score[i]>100||score[i]<0) {
				System.out.print("다시 입력:");
				score[i]=scan.nextInt();
			}
		}
		for(int i=0;i<score.length;i++) {
			for(int j=i+1;j<score.length;j++) {
				if(score[i]>score[j]) {
					temp =score[i];
					score[i]=score[j];
					score[j]=temp;
		}
}
		}
		for(int i=0;i<score.length;i++) {
			System.out.println(score[i]);
		}
  }
}