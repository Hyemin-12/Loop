package �ݺ���;

/* Ű����κ��� ���ڸ� �Է¹޾� 1���� �Է¹��� ������ ���� ���ϴ� ���α׷��� �ۼ����� */

import java.util.Scanner;
    public class For_vacation1{
       public static void main(String args[]){
            	int n;
              int sum=0;
	Scanner scan=new Scanner(System.in);
              System.out.println("���� �Է�:");
              n=scan.nextInt( );

	 for(int i=1; i<=n; i++){
	   sum+=i;
                }
               System.out.println("��:"+sum);
            }
     }
               