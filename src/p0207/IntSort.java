package p0207;

public class IntSort {
	
	static void printArray(int[] x) {
		for(int k = 0; k < x.length; k++) {
			if(k == 0) {
				System.out.print("[ ");
			}
			System.out.print(x[k]);
			if(k != x.length - 1) {
				System.out.print(", ");
			}else {
				System.out.println(" ]");
			}
		}
	}
	
	static void printBubbleSort(int[] x) {
		IntSort.printArray(x);
		System.out.println("Buble sort is started!");
		System.out.println();
		//정렬시작
		for(int i = x.length - 1; i >= 0; i--) {
			for(int j = 0; j < i; j++) {
				//스왑
				if(x[j] > x[j+1]) {
					int tmp = x[j];
					x[j] = x[j+1];
					x[j+1] = tmp;
				}
				IntSort.printArray(x);
			}
			System.out.println();
		}
	}
	
	static void printSelectionSort(int[] x) {
		IntSort.printArray(x);
		System.out.println("Selection sort is started!");
		System.out.println();
		//정렬시작
		for(int i = 0; i < x.length; i++) {
			int min = 0;
			int minIndex = 0;
			for(int j = i; j < x.length; j++) {
				if(min == 0) {
					min = x[j];
					minIndex = 0;
				}else if(min > x[j]) {
					min = x[j];
					minIndex = j;
				}
			}
			int tmp = x[i];
			x[i] = min;
			x[minIndex] = tmp;
			IntSort.printArray(x);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[] nums = new int[] {6,3,88,99,5,10,1,2};
		//printBubbleSort(nums);
		printSelectionSort(nums);
	}
}
