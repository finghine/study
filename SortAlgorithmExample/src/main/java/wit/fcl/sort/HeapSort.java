package wit.fcl.sort;

public class HeapSort implements ISort {

	@Override
	public void sort(int[] array) {
		makeMaxHeap(array);
		maxHeapSort(array);
	}

	public void maxHeapFixup(int[] array, int valueIndex) {
		int temp = array[valueIndex];
		int pos = valueIndex;
		int j = (pos - 1) / 2;// ���ڵ�
		while (j >= 0 && pos != 0) {
			if (array[j] > temp)
				break;
			array[pos] = array[j];
			pos = j;
			j = (pos - 1) / 2;
		}
		array[pos] = temp;
	}

	public void maxHeapFixup2(int[] array, int valueIndex) {
		// �ò�������ķ�ʽ��
		int pos = valueIndex;
		for (int i = (pos - 1) / 2; i >= 0 && pos != 0 && array[i] < array[pos]; pos = i, i = (pos - 1) / 2) {
			Common.swap(array, i, pos);
		}
	}

	public void maxHeapAddNumber(int[] array, int index, int nNum) {
		array[index] = nNum;
		maxHeapFixup2(array, index);
	}

	/**
	 * ��i����Ԫ������ѵ�������
	 * <p>
	 * �ӵ�i��Ԫ�ؿ�ʼ������
	 * 
	 * @param array
	 * @param i
	 * @param len
	 */
	public void maxHeapFixdown(int[] array, int i, int len) {
		int temp = array[i];
		int j = i * 2 + 1;
		while (j < len) {
			if (j + 1 < len && array[j + 1] > array[j]) {
				j++;
			}
			if (array[j] <= temp) {
				break;
			}
			array[i] = array[j];
			i = j;
			j = 2 * i + 1;
		}
		array[i] = temp;
	}

	public void maxHeapDeleteNumber(int[] array, int len) {
		Common.swap(array, 0, len - 1);
		maxHeapFixdown(array, 0, len - 1);
	}

	public void makeMaxHeap(int[] array) {
		int len = array.length;
		// Ҷ�ӽڵ������Ѿ������õĶ�,ֱ�Ӵ����һ��Ҷ�ӽ��ĸ��ڵ㿪ʼ����
		for (int i = len / 2 - 1; i >= 0; i--) {
			maxHeapFixdown(array, i, len);
		}
	}

	public static void main(String[] args) {
		HeapSort hs = new HeapSort();
		int[] array = Common.generateArray(10, 100);
		Common.printArray(array);
		hs.makeMaxHeap(array);
		Common.printArray(array);
	}

	/**
	 * <p>
	 * �ڽ��öѵ�����£���������
	 * 
	 * @param array
	 */
	public void maxHeapSort(int[] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			Common.swap(array, i, 0);
			maxHeapFixdown(array, 0, i);
		}
	}
}
