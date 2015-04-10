package wit.fcl.sort;

import java.util.Arrays;

import org.junit.Test;

public class PerformanceTesting {

	StrategyMgr mgr = new StrategyMgr();
	SortTimer timer = new SortTimer();
	@Test
	public void test() {
		//10w,50w,100w,500w数据进行排序，
//		对N*log(N)的算法，和系统排序算法比较时间
		final int W = 10000;
		int totalNum = 500*W;
		System.out.println("size:"+totalNum);
		timer.start();
		int[] array = Common.generateArray(totalNum,Integer.MAX_VALUE);
		int[] array1=Arrays.copyOf(array, array.length);
		int[] array2=Arrays.copyOf(array, array.length);
		int[] array3=Arrays.copyOf(array, array.length);
		timer.end("create array use");
		
		mgr.setStrategy(new QuickSort());
		timer.start();
		mgr.sort(array1);
		timer.end("quicksort  use");
		
		mgr.setStrategy(new MergerSort());
		timer.start();
		mgr.sort(array2);
		timer.end("mergersort use");
		
		mgr.setStrategy(new HeapSort());
		timer.start();
		mgr.sort(array3);
		timer.end("heapsort   use");
		
		timer.start();
		Arrays.sort(array);
		timer.end("system     use");
		
	}
}
