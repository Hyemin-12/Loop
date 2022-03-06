package 반복문;

import java.util.Scanner;
public class Divisor_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n;
        Scanner scan=new Scanner(System.in);
        System.out.print("숫자 입력:");
        n= scan.nextInt();
     
        for(int number=1; number<=n; number++){
           if(n% number==0){
             System.out.println("약수:"+number);
        }
    }
 }
}
