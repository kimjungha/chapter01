package chapter01;

public class ArithTest01 {

	public static void main(String[] args) {

		int a = 3;
		int b = 7;
		
		//산술연산(Arithmetic Operator) 이항 연산자 
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);	
		System.out.println(a / b); //나누기 
		System.out.println(a % b); //나머지 
		
		
		//int op int => int
		System.out.println(10/3);
		
		//int op double => double
		System.out.println(10/3.);
		
		//주의 
		System.out.println((double)10/3);
		System.out.println((double)(10/3));
	
		//증감(단항) i++, ++i 단항이어서 단항연산자 
		a = 1;
		
		System.out.println(a);
		a++; //2가됨  a+=1 a = a+1:
		System.out.println(a);
		a--; //a= a-1; //a =1됨
		System.out.println(a);
		++a; //a = a+1;
		System.out.println(a);
		
		int h  = 10;
		System.out.println(h++); //먼저 결과를 낸다음에 그 다음에 일을 더하는거 , 뒤에 붙였다 해서 후위연산자 
		int e = 10;
		System.out.println(++e); //앞에 붙였다 해서 전위연산자 

		
		
		
	}
	

}
