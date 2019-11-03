package mode;

public class Test {
	public static void main(String[] args) {
		SimpleFactory factory=new SimpleFactory();
		FlyIns s=(FlyIns) factory.create(FlyIns.class);
		s.run();
		StringBuilder sb=new StringBuilder();
		sb.append("abc");
		sb.append("cds");
		System.out.println(sb);
	}
}
