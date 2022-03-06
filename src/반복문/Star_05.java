package 반복문;
/*       *         총5줄  1 공백 4 별1
        ***             2 공백3  별3
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
			}// end of 공백
			for(int k=1; k<=(i*2)-1; k++ ) {
				System.out.print("*");
			}
			System.out.println();
		} // end of 줄
	}

}
