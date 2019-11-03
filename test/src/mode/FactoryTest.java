package mode;

public class FactoryTest {
	public static void main(String[] args) {
		/*VehicleFactory produce=new BikeFactory();
		produce.create().run();*/
		VehicleFactory produce=new BusFactory();
		produce.create().run();
	}

}
