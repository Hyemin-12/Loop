package �ݺ���;
/* Ű����κ��� �� ������ ������ �Է¹޾� 90�̻��̸� A,
80�̻��̸� B, 70�̻��̸� C, 70�̸��� ��� "�����"�� ����ϴ� ���α׷��� �ۼ��϶� */

import java.util.Scanner; 
public class If_vacation1{
     public static void main(String args[ ]){	
int score;
Scanner scan=new Scanner(System.in);

System.out.print("�����Է�:");
score=scan.nextInt( );

if(score>=90){
            System.out.println("���뵵 : A");
}else if(score>=80){
            System.out.println("���뵵 : B");	
}else if(score>=70){
            System.out.println("���뵵 : C");	
}else if(score<70){
            System.out.println("�����");	
   }
 }
}
