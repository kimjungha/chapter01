package chapter01;

//클래스 표기법 주의 
//출력해야하니까 main 필요함 

public class GoodsTest {

	public static void main(String[] args) {
	int i = 10;
	Goods g1 = new Goods();
	g1.price = 1000;
	
	//=========================================================
	int j = i;
	Goods g2 = new Goods();
	g2 = g1;
	
	//===================================================
	System.out.println(j + ":"+i);
	String s = "Hello World";
	System.out.println(g2.no + ":" + g1.price );
	System.out.println(s);
	}

}
