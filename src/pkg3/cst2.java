package pkg3;

public class cst2 implements mobile, telecom {

	public static void main(String[] args) {
		System.out.println("\n miCROMAX wiTHOUT cAMERA \n");
		cst2 n = new cst2();
		n.memory();
		n.Network();
		n.SIMslot();
		n.region();
		n.operatingSys();
		n.plan();
		n.processor();
	}
	public void plan() {
		System.out.println("--> calling with all n/w,data plan ");	
	}
	public void region() {
		System.out.println("--> Maharashtra & Goa");		
	}
	public void Network() {
		System.out.println("--> All upto 5G");		
	}
	public void SIMslot() {
		System.out.println("--> Dual SIM with Hagrid SD card ");		
	}
	public void processor() {
		System.out.println("--> 965 Octa Core");		
	}
	public void operatingSys() {
		System.out.println("--> android 11");		
	}
	public void memory() {
		System.out.println("--> 8GB RAM/256 ROM(Expandable)");		
	}
}