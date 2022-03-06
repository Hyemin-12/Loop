package 반복문;

/*키보드로부터 숫자를 입력받아 짝수인 경우에 "SW학과" 
홀수인경우에 "디자인 학과"를 출력하는 프로그램을
작성하자( switch문을 이용)*/

public class Switch_vacation2{
   public static void main(String args[ ]){
       int n=Integer.parseInt(args[0]);
       
	switch(n%2){
	 case 0: System.out.println("SW학과입니다.");break;
               case 1: 
	 case 2: System.out.println("디자인학과입니다.");break;
             }
      }
}