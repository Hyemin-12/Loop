package System.out;

/*Ű����κ��� ������ 100�� ���� ������ �Է��� �޾� �Է��� ������
50�� �̸��� ������� ���� ���ϴ� ���α׷��� �ۼ����� */
import java.util.Scanner;
public class While_vacation2{
	public static void main(String[] args) {
	
		int result =getFCnt();
		System.out.println("������� �� :"+ result +"��");  
	   } 
	
	public static int getFCnt() {  
	                 int score;   
		   int FCnt=0;
		   final int Cutline=50; 
		   Scanner scan=new Scanner(System.in);
		   
		   while(true) {
			   System.out.print("���� �Է�:");
			   score=scan.nextInt( );
			   if(score==100) break; 
			   if(score<Cutline) FCnt++; 
	   }
		   return FCnt; 
	}
	 }  