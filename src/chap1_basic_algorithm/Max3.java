package chap1_basic_algorithm;

import java.util.Scanner;//클래스 선언보다 앞에 작성

class Max3 {
	    public static void main(String[] args) {
	        Scanner stdIn = new Scanner(System.in);//변수명 stdIn는 바꿀수 있음.

	        System.out.println("세 정수의 최댓값을 구합니다.");//키보드값을 입력받는 부분보다 앞에 작성
	        System.out.print("a의 값 : ");  int a = stdIn.nextInt();//stdIn.nextInt 키보드로 입력한 값 중 정숫값(int)을 읽어 들임. next(자료형)
	        System.out.print("b의 값 : ");  int b = stdIn.nextInt();
	        System.out.print("c의 값 : ");  int c = stdIn.nextInt();
	        int max = a;
	        if (b > max) max = b; //if문 if (b > max) max = b; b가 최댓값(a)보다 크면 max를 b로 바꿔라, 괄호 안의 b > max룰 제어식이라고 함.ㅣ
	        if (c > max) {
	        	max = c;
	        }//같은 형식 한줄에 쓰면 중괄호 생략 가능

	        System.out.println("최댓값은 " + max + "입니다.");
	    }
}
