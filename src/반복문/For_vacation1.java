package 반복문;

/* 키보드로부터 숫자를 입력받아 1부터 입력받은 수까지 합을 구하는 프로그램을 작성하자 */

import java.util.Scanner;
    public class For_vacation1{
       public static void main(String args[]){
            	int n;
              int sum=0;
	Scanner scan=new Scanner(System.in);
              System.out.println("숫자 입력:");
              n=scan.nextInt( );

	 for(int i=1; i<=n; i++){
	   sum+=i;
                }
               System.out.println("합:"+sum);
            }
     }
               