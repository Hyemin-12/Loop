package 반복문;

import java.util.Scanner;
public class FoodR {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			
			int food;
			int eat;
			int choice;
			int menu;
			 System.out.println("음식의 묘미를 맛 볼 수 있는 기뮤녕 식당에 오신 것을 환영합니다~\n"
			 		+ "\n★----------기뮤녕의 한식 메뉴판  ---------★\n"
			 		+ "짭쪼롬한 코스1 : 쌀밥, 육개장, 매운 진미채, 불고기, 떡\n"
			 		+ "속이 든든 코스2 : 현미밥, 콩나물국, 미역줄기, 약과\n"
			 		+ "따뜻한 설날 코스3 : 떡만둣국, 생선구이, 나물무침, 장조림, 계란후라이\n"
			 		+ "음료 : 식혜, 미숫가루, 오미자, 쌍화차, 수정과, 콜라, 사이다 (택 1)\n"
			 		+ "기본 반찬 : 김치, 동치미, 우엉조림, 잡채, 멸치볶음, 오이부추무침");
		       System.out.println("----------------------------------");
		 
while(true) {
	System.out.print("어떤 코스음식을 주문하시겠습니까 \n코스 입력:");
	food=scan.nextInt();
	if(food==1||food==2||food==3)break;
}
		while(true) {
			System.out.print("기본 반찬을 추가하시겠습니까? \n예=0 | 아니요=1  입력:");
			eat=scan.nextInt();
			if(eat==0||eat==1)break;
			else{
			System.out.println("제공하지 않는 코스이거나 잘못 입력하셨습니다.");
		}
		}
		while(true) {
			System.out.print("어떠한 음료를 구매하시겠습니까?(구매를 원할 시 2 입력, 원하지 않을 시 3입력) \n음료 입력");
			choice=scan.nextInt();
			if(choice==2||choice==3) break;
		}
		}
}

			/*while(true) {
				System.out.print("드실 음식을 고르세요. \n 1. 한식 \n 2. 중식 \n 3. 일식 \n 4. 기타 \n");
				food = scan.nextInt();
				if (food == 1) {
					cnt1++;
				} else if (food == 2) {
					cnt2++;
				} else if (food == 3) {
					cnt3++;
				} else if (food == 0) break; //0을 입력하는 것은 안 먹겠다는 것
				} 
			System.out.println("상품명     " + cnt1 + "번 입력, " + "중식은 " + cnt2 + "번 입력, " + "일식은 " + cnt3 +" 번 입력되었습니다.");*/
		

