package �ݺ���;
/*       *         ��5��  1 ���� 4 ��1
        ***             2 ����3  ��3
       *****          
      *******
     *********
 */

public class Star_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}// end of ����
			for(int k=1; k<=(i*2)-1; k++ ) {
				System.out.print("*");
			}
			System.out.println();
		} // end of ��
	}

}
