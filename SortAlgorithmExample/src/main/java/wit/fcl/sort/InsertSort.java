package wit.fcl.sort;

public class InsertSort implements ISort {

	@Override
	public void sort(int[] array) {
		// baseInsertSort(array);
		sort3(array);
	}

	public void baseInsertSort(int[] array) {
		// 起始有序区只有a[0]，每次从无序区的第一个元素a[i]插入有序区中
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			// 从[0,i-1]中找出一个位置,j,插入a[i]
			int j = 0;
			for (; j < i; j++) {
				if (array[j] > temp) {
					break;
				}
			}
			// 移动[j,i-1]->[j+1,i]
			for (int k = i; k > j; k--) {
				array[k] = array[k - 1];
			}
			// 插入
			array[j] = temp;
		}
	}

	// 把查找位置和移动结合起来
	public void sort2(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int k = i;
			for (; k > 0 && temp < array[k]; k--) {
				array[k] = array[k - 1];
			}
			array[k] = temp;
		}
	}

	// 边找位置，边换
	public void sort3(int[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0 && array[j] < array[j - 1]; j--) {
				Common.swap(array, j, j - 1);
			}
		}
	}

}
