package �ݺ���;

/*Ű����κ��� ���ڸ� �Է¹޾� ¦���� ��쿡 "SW�а�" 
Ȧ���ΰ�쿡 "������ �а�"�� ����ϴ� ���α׷���
�ۼ�����( switch���� �̿�)*/

public class Switch_vacation2{
   public static void main(String args[ ]){
       int n=Integer.parseInt(args[0]);
       
	switch(n%2){
	 case 0: System.out.println("SW�а��Դϴ�.");break;
               case 1: 
	 case 2: System.out.println("�������а��Դϴ�.");break;
             }
      }
}