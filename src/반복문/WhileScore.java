package �ݺ���;
//0�� �Էµɶ����� score�� �Է¹޾� �Է��� �Ϸ�Ǹ� 
// ������ �հ� ����� ����ϴ� ���α׷��� �ۼ��϶�.
/* �ذ��� 
 * 1. ���� : ����(����) ��(����) ���(�Ǽ�) ��������(�ݺ�Ƚ��)
 * 2. while(�Է�, �������� ��, �ݺ�Ƚ�� ���� )=>true, ����==0 break; 
 * 3. �� ���, ���=��/�ݺ�Ƚ��
 * 4. ��� ���
 */

import java.util.Scanner;
 public class WhileScore {
   public static void main(String[] args) {
	   int score;
	   int sum=0;
	   double avg;
	   int count=0;
	   Scanner scan=new Scanner(System.in);
	   
	   while(true) {
		   System.out.print("���� �Է�:");
		   score=scan.nextInt( );

		  if(score==0) break;
			   sum+=score;
			   count++;
		   
	   }
	   avg=sum/count;
	   System.out.println("������"+sum);
	   System.out.println("���"+ avg);
   } 
 }
 