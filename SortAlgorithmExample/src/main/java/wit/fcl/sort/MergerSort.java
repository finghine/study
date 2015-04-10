package wit.fcl.sort;

public class MergerSort implements ISort {

	@Override
	public void sort(int[] array) {
		int len = array.length;
		int[] temp = new int[len];
		mergerSort(array, 0, len - 1, temp);
	}

	// [start,end]
	public void mergerSort(int[] array, int start, int end, int[] temp) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergerSort(array, start, mid, temp);
			mergerSort(array, mid + 1, end, temp);
			mergerArray(array, start, mid, end, temp);
		}
	}

	// merager [start,mid] ºÍ (mid,end]
	public void mergerArray(int[] array, int start, int mid, int end, int[] temp) {
		int i = start;
		int ie = mid;
		int j = mid + 1;
		int je = end;
		int k = 0;
		while (i <= ie && j <= je) {
			if (array[i] < array[j]) {
				temp[k++] = array[i++];
			} else {
				temp[k++] = array[j++];
			}

			// temp[k++] = array[i] < array[j] ? array[i++] : array[j++];
		}
		while (i <= ie) {
			temp[k++] = array[i++];
		}
		while (j <= je) {
			temp[k++] = array[j++];
		}
		for (int index = 0; index < k; index++) {
			array[start + index] = temp[index];
		}
	}
}
