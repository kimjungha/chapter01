package chapter01;

import java.util.Scanner;

public class SwitchTest {
 //그 달이 며칠있는가 출력
	public static void main(String[] args) {
		System.out.println("month를 입력해주세요 : ");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		int days = 0;
		/*
		if(month == 2) {
			days=28;
			return; //여기서 바로 main을 나가게 되는 
		} else if(month/2 == 1) {
			days =31;
		}else {
			days = 30;
		}*/
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
		case 11:
		{
			days = 31;
			break;
		}
			
		case 2 :{
			days = 28;
			break;
		}


		default: {
			System.out.println("1~12월까지만 입력해주세요");//default값을 항상 넣는걸 원하지 않는다면 break문을 넣어야함
			return;
		}
		
		}
		System.out.println(month + "월은" +days+ "입니다");
		

	
	
	}
}
