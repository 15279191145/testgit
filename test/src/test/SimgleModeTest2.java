package test;
/**
 * 懒汉模式是在需要创建实例的时候在获取
 * @author Administrator
 *
 */
public class SimgleModeTest2 {
	private static SimgleModeTest2 simple=null;
	private SimgleModeTest2(){
		
	}
	/*public  SimgleModeTest2 getInstance() {
		if(simple!=null) {
			simple=new SimgleModeTest2();			
		}
		return simple;
	}*/
	//改进
	public SimgleModeTest2 getgetInstance() {
		synchronized (SimgleModeTest2.class) {
			if(simple!=null) {
				simple=new SimgleModeTest2();				
			}
			return simple;
		}
	}
}
