
public class op1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1413;

		int b = a++ + a++ + a++ + ++a + ++a;

		int c = b++ + a-- + ++b + --a;

		int d = c++ - --c - --c + a++ + c++ + b++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

}
