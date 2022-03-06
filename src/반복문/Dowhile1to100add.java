package 반복문;

public class Dowhile1to100add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int sum=0;
		do {
			//실행문,증감식
			sum+=i;
			i++;
		
		}while(i<=100);
		System.out.println(sum);

	}
	
}


