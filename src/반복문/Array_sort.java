package �ݺ���;
//10���� ������ �Է� �޾� ������������ ������ �����ϴ� ���α׷��� �ۼ��϶�.

import java.util.Scanner;
public class Array_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int score[]=new int[10];
		int temp;
		
		for(int i=0;i<score.length;i++) {
			System.out.print("�����Է�:");
			score[i]=scan.nextInt();
			while(score[i]>100||score[i]<0) {
				System.out.print("�ٽ� �Է�:");
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