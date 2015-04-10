package wit.fcl.sort;

public class QuickSort implements ISort {

	@Override
	public void sort(int[] array) {
		sort(array, 0, array.length - 1);
	}

	public void sort(int[] array, int left, int right) {
		if (left < right) {
			int mid = adjustArray(array, left, right);
			sort(array, left, mid - 1);
			sort(array, mid + 1, right);
		}
	}

	public int adjustArray(int[] array, int left, int right) {
		int x = array[left];
		int s = left;
		int e = right;
		while (s < e) {
			while (s < e && array[e] >= x) {
				e--;
			}
			if (s < e) {
				array[s] = array[e];
				s++;
			}
			while (s < e && array[s] <= x) {
				s++;
			}
			if (s < e) {
				array[e] = array[s];
				e--;
			}
		}
		array[s] = x;
		return s;
	}
}
