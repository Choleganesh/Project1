package pkg2;
import pkg1.*;


public class demo2 extends swapping {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		methods obj= new methods();
		
		obj.add(); //The method add() from the type methods is not visible
		
		methods.primeNo(); /*The static method primeNo() from the type methods 
						should be accessed in a static way*/
		
		
		obj.mul();  //The method mul() from the type methods is not visible
		
		obj.logic();	/*Multiple markers at this line
					   - The method logic() from the type methods is not visible. */ 
		
		
		swap();
	
	}

}
