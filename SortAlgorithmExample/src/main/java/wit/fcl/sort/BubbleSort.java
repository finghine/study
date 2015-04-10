package wit.fcl.sort;

public class BubbleSort implements ISort {

	@Override
	public void sort(int[] array) {
		simpleSort(array);
	}

	public void simpleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length - i; j++) {
				if (array[j] < array[j - 1]) {
					Common.swap(array, j, j - 1);
				}
			}
		}
	}

	public void improveSort(int[] array) {
		boolean isSwapInLoop = true;
		for (int i = 0; i < array.length && isSwapInLoop; i++) {
			isSwapInLoop = false;
			for (int j = 1; j < array.length - i; j++) {
				if (array[j] < array[j - 1]) {
					isSwapInLoop = true;
					Common.swap(array, j, j - 1);
				}
			}
		}
	}

	public void impore2Sort(int[] array) {
		int lastSwapIndex = array.length;
		int lastpos;
		for (int i = 0; i < array.length; i++) {
			lastpos = lastSwapIndex;
			for (int j = 1; j < lastpos; j++) {
				if (array[j] < array[j - 1]) {
					Common.swap(array, j, j - 1);
					lastSwapIndex = j;
				}
			}
		}
	}
}
