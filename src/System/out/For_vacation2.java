package System.out;

/*Ű����κ��� ���ڸ� �Է¹޾� 1���� �Է¹��� �������� ���� ���Ͻÿ� */

import java.util.Scanner;
  public class For_vacation2{
     public static void main(String args[ ]){
      	   int n;
      	   int pro=1;
    	   Scanner scan=new Scanner(System.in);
    	   System.out.print("���� �Է�:");
     	   n=scan.nextInt( );
 
	for(int i=1; i<=n; i++){
                 pro*=i;
               }
           System.out.println("��:"+pro);
          }
}