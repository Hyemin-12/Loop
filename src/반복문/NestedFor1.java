package �ݺ���;
//i=1; j=1 
//     j=2
//i=2; j=1 
//     j=2
//i=3; j=1 
//     j=2
public class NestedFor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {           //5�� �ݺ� 
			for(int j=1; j<=5; j++) {     //1-5������ ���� ����ϴ� �� 
				System.out.print(i);//i=1�϶� j=1�Ǵ� 2 �� ��Ʈ �Ϸ� �Ŀ� ���ٲ� ��� 
			} //inner for  
			System.out.println(" "); // ��  ��Ʈ �� �ٹٲ��� �Ǿ ���� �ȴ� 
	} //outer for 
  }
}

/* i=1  j=1 2 3 4 5 
   i=2  j=1 2 3 4 5  */
