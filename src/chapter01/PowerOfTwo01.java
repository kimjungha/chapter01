package chapter01;

import java.util.Scanner;

public class PowerOfTwo01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int result = 1;
		int i = 0;
		System.out.println("몇 승수를 할까요?:");
		int pow = scanner.nextInt();
		
		while(i<pow) {
			result = result *2;
			i++;
		}
		
		System.out.println("2의"+ pow + "제곱근은"+ result + "입니다");
		scanner.close();
	}

}
