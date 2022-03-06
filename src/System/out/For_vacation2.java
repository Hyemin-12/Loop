package System.out;

/*키보드로부터 숫자를 입력받아 1부터 입력받은 수까지의 곱을 구하시오 */

import java.util.Scanner;
  public class For_vacation2{
     public static void main(String args[ ]){
      	   int n;
      	   int pro=1;
    	   Scanner scan=new Scanner(System.in);
    	   System.out.print("숫자 입력:");
     	   n=scan.nextInt( );
 
	for(int i=1; i<=n; i++){
                 pro*=i;
               }
           System.out.println("곱:"+pro);
          }
}