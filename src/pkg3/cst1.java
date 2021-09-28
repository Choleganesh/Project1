package pkg3;

public class cst1 implements cars{
	
	public static void main(String[] args) {
		cars c = new cst1();	
		c.tyres();
		c.airbags();
		c.Fueltype();
		c.milage();
		c.speed();
		c.Engines();
		c.space();
	}
	public void tyres() {
		System.out.println("--> CEAT Tyres ");
	}
	public void airbags() {
		System.out.println("--> yes, it gives best support ");
	}
	public void Fueltype() {
		System.out.println("--> both CNG and Petrol supported ");
	}
	public void milage() {
		System.out.println("--> 22Km/lit ");
	}
	public void speed() {
		System.out.println("--> Higher speed is 300K/hr ");
	}
	public void Engines() {
		System.out.println("--> ---cc ");
	}
	public void space() {
		System.out.println("--> 5 seater ");
	}

}