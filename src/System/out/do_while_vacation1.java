package System.out;

/*키보드로부터 숫자를 입력받아 do while을 이용하여 1부터 입력받은 숫자까지의 합을 구하는 프로그램을 작성하시오 */

import java.util.Scanner;
    public class do_while_vacation1{
      public static void main(String args[ ]){
    	  int i=1;
                int n;
                int sum=0;
                Scanner scan=new Scanner(System.in);
                System.out.print("숫자 입력:");
                n=scan.nextInt();

 	     do{
		   sum+=i;
		     i++;

	     }while(i<=n);
	        System.out.println(sum);
             }
     }
          
