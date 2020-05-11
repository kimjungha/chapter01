package chapter01;

public class Logical {
	//논리연산자에 대해서 
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		// f||t => t
		// t||f =>t
		// t||t =>t
		// f||f =>f
		System.out.println(a == b || a>b);
		
		// f&&t => f
		// t&&f =>f
		// t&&t =>t
		// f&&f =>f
		System.out.println(a == b || a>b);
		System.out.println(a != b || a>b );
		
		System.out.println(!(a > b)); //not 연산자 
		
		

	
		
		
		
		
	}
}
