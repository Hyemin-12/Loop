package �ݺ���;

/* Ű����κ��� ���ڸ� �Է¹޾� 2�� ������� �ƴ��� �Ǵ��ϴ� ���α׷��� �ۼ����� (switch�� ���) */
import java.util.Scanner;
   public class Switch_vacation1{
      public static void main(String args[ ]){
	int n;
	Scanner scan=new Scanner(System.in);
   	System.out.println("���� �Է�:");
	n=scan.nextInt( );
 
              switch(n%2){
	 case 0: System.out.print("2�� ����̴�"); break;
    	 case 1:
	 case 2: System.out.print("2�� ����� �ƴϴ�");break;
           }
      } 
}
     