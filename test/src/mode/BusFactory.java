package mode;

public class BusFactory extends VehicleFactory{

	@Override
	public Car create() {
		// TODO Auto-generated method stub
		Car car=new Car();
		car.setNumber(4);
		return car;
	}

}
