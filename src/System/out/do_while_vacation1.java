package System.out;

/*Ű����κ��� ���ڸ� �Է¹޾� do while�� �̿��Ͽ� 1���� �Է¹��� ���ڱ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ� */

import java.util.Scanner;
    public class do_while_vacation1{
      public static void main(String args[ ]){
    	  int i=1;
                int n;
                int sum=0;
                Scanner scan=new Scanner(System.in);
                System.out.print("���� �Է�:");
                n=scan.nextInt();

 	     do{
		   sum+=i;
		     i++;

	     }while(i<=n);
	        System.out.println(sum);
             }
     }
          
