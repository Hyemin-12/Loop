package �ݺ���;
//����� ���������� ���� �Է¹��� ����n�� ���� n!�� ����ϴ� ���α׷� �ۼ�
/* n! = 1*2*3*4*.....n
 * sum += i
 * gob *= i => for(int i=1; i<=n; i++)
 */
public class Factorial {
	public static void main(String[] args) {
		int gob=1;
		Integer.parseInt(args[0]); // args[1] args[2]...........
		int n=Integer.parseInt(args[0]);
		for(int i=1; i<=n; i++) {
			gob*=i;
		}
		System.out.println(gob);
   }
}