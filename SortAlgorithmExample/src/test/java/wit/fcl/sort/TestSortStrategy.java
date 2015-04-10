package wit.fcl.sort;

import java.util.Arrays;

public class TestSortStrategy {
	
	public static void performanceTesting(int size){
		
		
	}

	public static void main(String[] args) {
		BubbleSort bubble = new BubbleSort();
		StrategyMgr mgr = new StrategyMgr(bubble);
		
//		int[] array = Common.generateArray(100000,10000);
		int[] array = Common.generateArray(10,100);
		int[] array2 = Arrays.copyOf(array, array.length);
		Common.printArray(array);
//		mgr.setStrategy(new QuickSort());
//		mgr.setStrategy(new MergerSort());
//		mgr.setStrategy(new InsertSort());
//		mgr.setStrategy(new ShellSort());
//		mgr.setStrategy(new SelectSort());
		mgr.setStrategy(new HeapSort());
		
		mgr.sort(array);
		Common.printArray(array);
		
		SortTimer t = new SortTimer();
		t.start();
		Arrays.sort(array2);
		t.end();
		
//		Common.printArray(array);
//		Common.printArray(array2);
	}

}
