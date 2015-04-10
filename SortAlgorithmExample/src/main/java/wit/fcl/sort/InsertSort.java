package wit.fcl.sort;

public class InsertSort implements ISort {

	@Override
	public void sort(int[] array) {
		// baseInsertSort(array);
		sort3(array);
	}

	public void baseInsertSort(int[] array) {
		// ��ʼ������ֻ��a[0]��ÿ�δ��������ĵ�һ��Ԫ��a[i]������������
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			// ��[0,i-1]���ҳ�һ��λ��,j,����a[i]
			int j = 0;
			for (; j < i; j++) {
				if (array[j] > temp) {
					break;
				}
			}
			// �ƶ�[j,i-1]->[j+1,i]
			for (int k = i; k > j; k--) {
				array[k] = array[k - 1];
			}
			// ����
			array[j] = temp;
		}
	}

	// �Ѳ���λ�ú��ƶ��������
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

	// ����λ�ã��߻�
	public void sort3(int[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0 && array[j] < array[j - 1]; j--) {
				Common.swap(array, j, j - 1);
			}
		}
	}

}
