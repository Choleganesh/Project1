
public class primeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no = 17;
		if (no ==0 || no == 1 ) {
			System.out.println(no + " is not prime nember");
		}
		else if	(no % 2 == 0 && no % 3 == 0) {	 
			 System.out.println(no +" is not prime number");
		}
		 else {
			 System.out.println(no + " is prime no");
		 }
			 
				 

	}

}
