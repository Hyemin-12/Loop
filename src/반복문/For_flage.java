package �ݺ���;
// 1-2+3-4+5-6.....100 ������ �� ���ϱ� 
public class For_flage {
	public static void main(String args[]) {
		int sum1=0;
		int sum2=0;
		
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				sum1+=(i*(-1)); 
			}
		}
		for(int i=1; i<=100; i++) {
			if(i%2==1) {
				sum2+= i;
			}
		}
			System.out.println(sum1+sum2);
		}
	}



