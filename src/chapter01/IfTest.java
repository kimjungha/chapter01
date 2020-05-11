package chapter01;
import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {

		//입력되었다는 가정하에 
	
	
		int diff = 0;
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(); //blocking
		int b = scanner.nextInt(); //blocking
		
		
		
		if( a > b) {
			diff = a-b;
		}
		else {
			diff = b - a;
			System.out.println("b가 큰 경우");
		}
	
		diff = (a > b ) ? a - b: b - a;
		
		
		
		
		
		//이렇게 로직이 들어가는 형태 
		diff = b - a;
		System.out.println(diff);
		
		
		
		
		
		
	}

}
