package mode;

public class SimpleFactory {
	
	public FlyIns createFly() {
		return new FlyIns();
	}
	public SwimIns createSwim() {
		return new SwimIns(); 
	}
	
	public Object create(Class<?> clazz) {
		if(clazz.getName().equals(FlyIns.class.getName())) {
			return createFly();
		}else {
			return createSwim();
		}
		
		
	}
	
}
		
		














