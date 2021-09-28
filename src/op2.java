
public class op2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 689;

		int b = a++ + a++ + a++ + ++a + ++a;

		int c = a++ + b-- + ++b + --b;

		int d =b++ - --a - --b + b++ + b++ + a++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

}
