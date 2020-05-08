package chapter01;

public class TypeCast01 {

	public static void main(String[] args) {
			//implicity(임시적)
			int i = 10;
			long l= i;
			
			//explicity(명시적)
			System.out.println(i + ":"+l);
			long l2 = 123456789;
			int i2 = (int)l2;
			
	}

}
