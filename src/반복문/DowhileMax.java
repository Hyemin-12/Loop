package �ݺ���;
//0�� �Է��ϸ� ����
//����� �Է��Ѵٰ� ����
//�Է¹��� ���� �� �ִ밪 ã��
/* �ذ���
 * 1.max ��������=> �ʱⰪ 0
 * 2. if(�Է� ���� �� > max)   => max = �Է¹�����(max�� �ִ´�)
 * 3. �ݺ�
 */
import java.util.Scanner;
public class DowhileMax {
		public static void main(String[] args) {

			int input;
			int max=0; //��� �� ���� ���� �� 0
			Scanner scan=new Scanner(System.in);
			
			do {
				System.out.println("�����Է�:");
				input=scan.nextInt();
				if(input>= max) {
					max = input ; //�Է¹޴� ���� max�� ��� ���ؼ� �ִ� ���ϱ� 
				}
			}while(input!=0); //�Է��� 0�̸� ����
			System.out.println("�ִ�:"+ max);
		}
}
			
			
