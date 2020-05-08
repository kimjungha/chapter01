package chapter01;

public class TypeCast02 {

	public static void main(String[] args) {
		
		byte b = 25;
		short s = b; //임시적 
		int i = s; //임시적
		long l = i; //임시적 작은 값이 큰 공간에 들어가는건 임시적 문제없음 
		float f = i;
		double d = f; //임시적 작은 값이 큰 공간에 들어가니까 문제 없음 

		byte b1 = (byte)256;
		char c2 = 'B'; //c2에 b라는 단어 하나인데 아스키코드에 의해 숫자가 메모리에 저장이됨
		int c3 = (int)c2; //문자형을 int형을 만든다는건 아스키코드값
		System.out.println("b = " + b);
		System.out.println("s = " + s);
		System.out.println("i = " + i);
		System.out.println("l = " + l);

		System.out.println("f = " + f);
		System.out.println("d = " + d);
		System.out.println("b1 = " + b1);
		System.out.println(c3);

	}

}
