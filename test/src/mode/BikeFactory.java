package mode;

public class BikeFactory extends VehicleFactory{

	@Override
	public Car create() {
		// TODO Auto-generated method stub
		Car car=new Car(); 
		car.setNumber(2);
		return car;
	}

}
