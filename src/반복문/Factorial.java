package 반복문;
//명령행 변개변수를 통해 입력받은 숫자n에 대해 n!을 출력하는 프로그램 작성
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