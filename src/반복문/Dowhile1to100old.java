package 반복문;
//1부터 100까지 숫자중 홀수만 출력
public class Dowhile1to100old {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		do {
			//실행문,증감식
			if(i%2==1) {
			System.out.println(i);
			}
			i++;
		}while(i<=100);
	}

}
