package test;
/**
 * 饿汉模式是在类加载的时候就已经生成了类对象
 * @author Administrator
 *
 */
public class SimgleModeTest {
	private static SimgleModeTest simple=new SimgleModeTest();
	private SimgleModeTest(){
		
	}
	public  SimgleModeTest getInstance() {
		return simple;
	}
}
