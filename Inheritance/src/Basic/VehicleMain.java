package Basic;

public class VehicleMain {

	public static void main(String[] args) {
		//Method OverRiding
		FourWheeler FW = new FourWheeler();
		Vehicle vh = new Vehicle();
		FW.start();
		//Heirarchical Inheritance
		 FourWheeler obj1 = new FourWheeler();
	     TwoWheeler obj2 = new TwoWheeler();
	     obj1.start();
	     obj2.start();
	}
}
