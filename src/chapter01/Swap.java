package chapter01;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		
		if(n1 < n2) {
			int c = n1; //c에다가 n1값을 저장 , 덮기전에 임시공간이 필요하다 , c가 임시공간인거  
			n1 = n2;
			n2 = c;
		}
		
		System.out.println("n1:" + n1);
		System.out.println("n2:" + n2);


	}

}
