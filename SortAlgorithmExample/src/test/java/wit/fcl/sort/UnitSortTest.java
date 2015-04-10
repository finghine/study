package wit.fcl.sort;

import java.util.Arrays;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class UnitSortTest {

	StrategyMgr mgr = new StrategyMgr();
	int[] array = null;
	int[] arrayCopyed = null;

	@Before
	public void initData() {
		array = Common.generateArray(1000, 10000);
		arrayCopyed = Arrays.copyOf(array, array.length);
	}

	@Test
	public void BubbleSortTest() {
		mgr.setStrategy(new BubbleSort());
		mgr.sort(array);
		Arrays.sort(arrayCopyed);
		boolean realust = Arrays.equals(array, arrayCopyed);
		Assert.assertEquals(true, realust);
	}
	@Test
	public void InsertSortTest() {
		mgr.setStrategy(new InsertSort());
		mgr.sort(array);
		Arrays.sort(arrayCopyed);
		boolean realust = Arrays.equals(array, arrayCopyed);
		Assert.assertEquals(true, realust);
	}
	@Test
	public void SelectSortTest() {
		mgr.setStrategy(new SelectSort());
		mgr.sort(array);
		Arrays.sort(arrayCopyed);
		boolean realust = Arrays.equals(array, arrayCopyed);
		Assert.assertEquals(true, realust);
	}
	@Test
	public void ShellSortTest() {
		mgr.setStrategy(new ShellSort());
		mgr.sort(array);
		Arrays.sort(arrayCopyed);
		boolean realust = Arrays.equals(array, arrayCopyed);
		Assert.assertEquals(true, realust);
	}
	@Test
	public void MergerSortTest() {
		mgr.setStrategy(new MergerSort());
		mgr.sort(array);
		Arrays.sort(arrayCopyed);
		boolean realust = Arrays.equals(array, arrayCopyed);
		Assert.assertEquals(true, realust);
	}
	@Test
	public void QuickSortTest() {
		mgr.setStrategy(new QuickSort());
		mgr.sort(array);
		Arrays.sort(arrayCopyed);
		boolean realust = Arrays.equals(array, arrayCopyed);
		Assert.assertEquals(true, realust);
	}
	@Test
	public void HeapSortTest() {
		mgr.setStrategy(new HeapSort());
		mgr.sort(array);
		Arrays.sort(arrayCopyed);
		boolean realust = Arrays.equals(array, arrayCopyed);
		Assert.assertEquals(true, realust);
	}
}
