package pkg1;

public class methods  {
	double a= 1.5;
	static double b= 2;
	static final boolean s= true;
	
	public static void primeNo() {
		System.out.println("prime number is that which is divisible bye itself \n or by 1 only not by any other number.");
		System.out.println("0,1 are not prime numbers.");
		System.out.println("2 is only even prime number.");
	}	
	 public void add()
	{
		System.out.println("(10+5)----> "+ (10+5)+"\n");
	}
	
	public void mul() {	
		System.out.println("(a*b)---->"+(a*b)+ "\n ");
	}
	
	//public void 
	
	public void logic() {
		boolean s =false;
		System.out.println(s+ "\n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p=b/42; 
		System.out.println("sq= (b/42) =>"+p);
		float d;
		d=5/56;
		System.out.println("d=(5/56)  =>" +d);
		methods obj = new methods();
	obj.add();
	obj.mul();	
	System.out.println(obj.a*methods.b);
	obj.logic();
	
	System.out.println(s+"\n");
	primeNo();
	}
}
