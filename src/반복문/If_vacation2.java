package �ݺ���;

/* Ű����κ��� ���̸� �Է¹޾Ƽ� 20�̻��� ��� "����",
20�̸��� 10�̻��� ��� "10��", 10�̸��� ��� "���"�� ����ϴ� ���α׷��� �ۼ����� */

import java.util.Scanner;
  public class If_vacation2{
     public static void main(String args[ ]){
       int age;
       Scanner scan=new Scanner(System.in);

       System.out.println("�����Է�:");
       age=scan.nextInt( );
     
       if(age>=20){
           System.out.println("����");
        }else if(age<20 && age >=10){
           System.out.println("10��");
        }else if(age<10){
           System.out.println("���");
         }
     }
}