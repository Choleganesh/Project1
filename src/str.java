public class str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "python";
		StringBuilder s2 = new StringBuilder("java");
		String s3 = "";
		StringBuffer s4 = new StringBuffer("1,2,3,4,5,6,7,8,9");
		StringBuffer s5 = new StringBuffer();
		StringBuilder s6 = new StringBuilder();
			
		for(int i=s1.length()-1; i>=0; i--) {
			s3 = s3 + s1.charAt(i);
			s5 = s5.append(s1.charAt(i));
			s6 = s6.append(s1.charAt(i));
		}	            
		System.out.println("s1--> " +s3);
	
		s2 = s2.reverse();
		System.out.println("s2--> " +s2);
		
		s4 = s4.reverse();
		System.out.println("s4--> " +s4);
		System.out.println("s5--> " +s5);
		System.out.println("s6--> " +s6);
		
		system.out.println("***************************************************************");
	}
}
