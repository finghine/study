package wit.fcl.sort;

public class SelectSort implements ISort {

	@Override
	public void sort(int[] array) {
		baseSort(array);
	}

	public void baseSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int minIndex = i;
			// [i+1,len)���ҳ���С����array[i]����
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			Common.swap(array, i, minIndex);
		}
	}

}
