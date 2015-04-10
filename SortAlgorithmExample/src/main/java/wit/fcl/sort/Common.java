package wit.fcl.sort;

import java.util.Random;

public class Common {
	public static void swap(int[] array, int firstIndex, int secondIndex) {
		int t = array[firstIndex];
		array[firstIndex] = array[secondIndex];
		array[secondIndex] = t;
	}

	public static void printArray(int[] array) {
		for (int x : array) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

	static Random random = new Random(System.currentTimeMillis());

	public static int[] generateArray(int len, int range) {
		int[] array = new int[len];
		for (int i = 0; i < len; i++) {
			array[i] = (int) (random.nextDouble() * range);
		}
		return array;
	}
}
