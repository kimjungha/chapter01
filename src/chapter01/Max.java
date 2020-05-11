package chapter01;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(); //blocking
		int b = scanner.nextInt(); //blocking
		int c = scanner.nextInt(); // blocking
		
		int max =0;
		if(a >=b) {
			if(c>=a) { // a>b, c>a
				max = c;
			} else { // a>b, a>c
				max = a;
			} 
		}// a>b 
		else { //b >a
			if(c>=b) { // b>a , c>a
				max = c;
			} else { //b>a , b>c
				max = b;
			}	
		} //b >a
		System.out.println("max:"+max);
		
	}

}
