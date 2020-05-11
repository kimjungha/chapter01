package chapter01;

import java.util.Scanner;

public class Bitwise {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a= 4;
		int b = 2;
		System.out.println(4 &2); //&가 and연산자인데 4는 0100 , 2는 0010이니까 and연산자쓰면 0!
		System.out.println(4|2); // 0110 이 되니까 이걸 십진수로 바꾸면 6
		int c = -15;
		int d = 0;
		System.out.println(c^d); //모두 다르니까 1111로 되어서, 15가 나옴
		System.out.println(~c);//

	}

}
