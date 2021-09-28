package pkg4;

public class excepetion {
	
	public static void main(String[] args) {
		
//	public void calculator(){
		int a = 10 ;
		int  b = 0;		
		System.out.println("add" + (a+b));
		try {
			System.out.println("div" + (a/b));
		}
		catch(ArithmeticException e){
			System.out.println("change value of b Because divisible by zero is not allowed ");
		}
		catch(Exception e) {
			System.out.println("cannot dividde by zero(0)");
		}		
		System.out.println("Sub" + (a-b));
		System.out.println("Mul" + (a*b));
	
	}

}
