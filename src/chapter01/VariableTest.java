package chapter01;

//작성자 : 김정하
//작성일 : 2020.05.08

public class VariableTest {

	public static void main(String[] args) {
	/*
	 * 1.자료형 (Data Type) : 기본(primitive) 8개
	 */
	/*
	* 
   */
		//정수 
		byte b = 10; //1byte -128부터 127 까지 
		short s = 10; // 2byte 메모리 아끼기 
		int i  = 10; //4byte
		long l = 1234567; //8byte
		
		//실수  실생활에서 자주 쓰이지는 않음 
		float f = 3.14f; //4byte wk
		double d = 3.14;
		
		//문자 
		char c  = 'A' ; 
		
		//부울대수 
		boolean b1 = true; //1byte
		boolean b2 = false;
		
		/* 
		 * 2. 자료형 (Data Type) : 객체 참조형(reference type)
		 */
		
		//문자열 
		//문자열은 기본타입이 아니다. 문자열 기본타입은 char가 모여, 있는 String class 이다. 
		//즉 String 은 class이다. 
		String string = "jungwoo";
		int n = 10;
		
		Goods g1 = new Goods(); //클래스 쓰고싶으면 꼭 new해서 객체 만들기 
		Goods g2 = new Goods();
		int  Goodus= g1.price = 1090;
		
		//배열
		char [] value ; //몇개인지는 모르나 여러개를 저장할 수 있는 배열선언
		
		/*
		 * 3. 변수 초기화 
		 */
		//지역 변수 
		/*
		 * int j=13339;
		 * System.out.println(j);
		 */
		
		
		/*
		 * 4. 상수 
		 */
		// 상수  상수는 값이 변하지 않는다  프로그램이 끝날때까지 값이 변하지 않는다. 
		final int a3 = 78;
		final int NUMBER = 10000; //상수는 관례로 변수명 대문자로 쓴다. 
		//오류 : 초기화시 final 이 붙어있는 변수는 다음코드에서 값을 대입할 수 없다. 
		final double p1 = 3.1244;
	
		System.out.println(Goodus);
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(string);
		
	}
	
	
}
