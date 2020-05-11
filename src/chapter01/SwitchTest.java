package chapter01;

import java.util.Scanner;

public class SwitchTest {
 //그 달이 며칠있는가 출력
	public static void main(String[] args) {
		System.out.println("month를 입력해주세요 : ");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		int days = 0;
		
		if(month == 2) {
			days=28;
			return; //여기서 바로 main을 나가게 되는 
		} else if(month/2 == 1) {
			days =31;
		}else {
			days = 30;
		}
		

	System.out.println(month + "월은"+ days + "일 까지 있습니다. ");
	
	}
}
