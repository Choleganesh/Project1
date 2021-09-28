package pkg1;

public class Fibo {

	public static void main(String[] args) {
		
		int x = 0, y = 1;
		System.out.println(x);
		System.out.println(y);
		if (y>20) {
			System.out.println(x);
			x = y;
			System.out.println(y);
			y = y+x;
			
		}
	}

}
