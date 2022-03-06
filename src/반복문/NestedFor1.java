package 반복문;
//i=1; j=1 
//     j=2
//i=2; j=1 
//     j=2
//i=3; j=1 
//     j=2
public class NestedFor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {           //5번 반복 
			for(int j=1; j<=5; j++) {     //1-5까지의 수를 출력하는 것 
				System.out.print(i);//i=1일때 j=1또는 2 한 세트 완료 후에 줇바꿈 사용 
			} //inner for  
			System.out.println(" "); // 한  세트 후 줄바꿈이 되어서 열이 된다 
	} //outer for 
  }
}

/* i=1  j=1 2 3 4 5 
   i=2  j=1 2 3 4 5  */
