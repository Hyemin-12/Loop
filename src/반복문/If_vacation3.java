package �ݺ���;

/*Ű����κ��� �ڵ��� ���ð��� �Է¹޾� 10�ð� �̻��̸� "�ߵ�", 
 * 6�ð� �̻� 10�ð� �̸��� ��� "����",
6�ð� �̸��� ��� "����"�� ����ϴ� ���α׷��� �ۼ�*/

import java.util.Scanner;
  public class If_vacation3{
     public static void main(String args[ ]){
       int time;
       Scanner scan=new Scanner(System.in);

       System.out.println("�ð��Է�:");
       time=scan.nextInt( );
     
       if(time>=10){
           System.out.println("�ߵ�");
        }else if(time>=6 && time <10) {
           System.out.println("����");
        }else if(time<6) {
           System.out.println("����");
         }
     }
}