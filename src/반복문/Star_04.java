package ¹Ýº¹¹®;

public class Star_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			for(int k=4;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
					System.out.print("*");
				}
			for(int j=1; j<=i; j++) {
				System.out.print("*" );
			}
			System.out.print("\n");
		}
	}
}

