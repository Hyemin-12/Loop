package �ݺ���;

import java.util.Scanner;
 public class WhilePassCnt {
	public static void main(String[] args) {
		
		//�ż��� ����
		int result = getPassCnt();
		System.out.println("����� �� :"+ result +"��");  //�����ڼ� �ޱ�
		
		getAchiveClass(result); //����ڼ��� 3���̻��̸� "����б�" ��� => getAchiveClass()
	   }  //main
	
	public static int getPassCnt() {  //�Ű�����
	       int score;   //����
		   int passCnt=0; //����ڼ�
		   final int Cutline=80; 
		   Scanner scan=new Scanner(System.in);
		   
		   while(true) {
			   System.out.print("���� �Է�:");
			   score=scan.nextInt( );
			   if(score<0) break; //�����϶�
			   if(score>=Cutline) passCnt++;  //80�� �̻� ����ڼ� ���ϱ� 
	   }
		   return passCnt; //�����ڼ� ��ȯ�ϱ� 
	}
	
	public static void getAchiveClass(int result) {
		if(result>=3) System.out.println("����б�");
		else System.out.println("����б��� �ƴմϴ�.");
	}
	 }  //class
