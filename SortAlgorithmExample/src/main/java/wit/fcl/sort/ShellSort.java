package wit.fcl.sort;

public class ShellSort implements ISort {

	@Override
	public void sort(int[] array) {
		// baseSort(array);
		sort2(array);
	}

	public void baseSort(int[] array) {
		int len = array.length;
		for (int gap = len / 2; gap > 0; gap /= 2) { // 步长gap
			for (int i = 0; i < gap; i++) { // 每组进行排序，有gap次插入排序
				for (int j = i + gap; j < len; j += gap) {// 一次插入排序
					for (int k = j; k > i && array[j] < array[j - gap]; k -= gap) {
						Common.swap(array, j, j - gap);
					}
				}
			}
		}
	}

	public void sort2(int[] array) {
		int len = array.length;
		for (int gap = len / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < len; i += gap) {
				for (int j = i; j > 0 && array[j] < array[j - gap]; j -= gap) {
					Common.swap(array, j, j - gap);
				}
			}
		}
	}

}
