package chapter01;

import java.util.Scanner;

public class PrimeDetect {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("소수인지 판단할 숫자:");
		int divisor = 2;
		int num = stdin.nextInt();
		boolean isPrime = true;
		
		while( num /divisor == 0) {
			divisor++;
			
		}
		if(divisor !=2) {
			System.out.println(num + "소수가 아닙니다.");
		}else {
			System.out.println(num+"소수입니다.");
		}
	}

}
