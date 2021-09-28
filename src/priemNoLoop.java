
public class priemNoLoop {
	
	static void forLoop() {
		System.out.println("by using for loop");
		System.out.println(" Prime Numbers - ");
		for (int n = 2; n<=100; n++) {	
			int s = 0;	
			for (int k = 1; k<=n; k++) {
				if (n % k == 0) {
					s++;
				}
			}
			if (s==2) {
				System.out.print(n +",");
			}
		/*	else {
				System.out.println(n + " is not prime");
			}*/
		}
		
		System.out.println("\n\n Non-prime Numbers - ");
		for (int n = 2; n<=100; n++) {
			
					int s = 0;			
					for (int k = 1; k<=n; k++) {
						if (n % k == 0) {
							s++;
							
						}
					}
					if (s!=2) {
						System.out.print(n +",");
					}
				/*	else {
						System.out.println(n + " is prime");
					}*/
				}
	}
	
	static void whileLoop() {
		System.out.println("by using while loop");
		System.out.println(" Prime Numbers - ");
		int n = 2;
		while(n<=100) {	
			int s = 0;
			int k = 1;
			while(k<=n) {
				if (n % k == 0) {
					s++;
				}k++;
			}
			if (s==2) {
				System.out.print(n +",");
			}n++;
		}
		System.out.println("\n\n Non-prime Numbers - ");
		int j = 2;
		while(j<=100) {	
			int s = 0;	
			int k = 1;
			while(k<=j) {
				if (j % k == 0) {
					s++;
				}k++;
			}
			if (s!=2) {
				System.out.print(j +",");
			}j++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		forLoop(); 
		System.out.println("\n");
		whileLoop();
		
	}

}
