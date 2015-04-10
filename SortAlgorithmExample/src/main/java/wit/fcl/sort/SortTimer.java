package wit.fcl.sort;

public class SortTimer {
	long time = 0;

	public void start() {
		time = System.currentTimeMillis();
	}

	public void end() {
		long time1 = System.currentTimeMillis() - time;
		System.out.println(time1 + " ms");
	}
	public void end(String msg) {
		long time1 = System.currentTimeMillis() - time;
		System.out.println(msg+": "+time1 + " ms");
	}
}
