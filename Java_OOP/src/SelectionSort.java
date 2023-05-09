
public class SelectionSort implements SortInterface {

	@Override
	public void sortIncreasely(double[] arr) {
		int length = arr.length;
		for(int i = 0; i < length - 1;i++) {
			int minIndex = i;
			for(int j = i + 1; j < length;j++) {
				if(arr[j] < arr[minIndex])
					minIndex = j;
			}	
			// swap min and current item (arr[i])
			if(minIndex != i) {
				double temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] =  temp;
			}
		}

	}

	@Override
	public void sortDecreasely(double[] arr) {
		int length = arr.length;
		for(int i = 0; i < arr.length - 1;i++) {
			int maxIndex = i;
			for(int j = i + 1; j < length;j++) {
				if(arr[j] > arr[maxIndex])
					maxIndex = j;
			}	
			if(maxIndex != i) {
				double temp = arr[i];
				arr[i] = arr[maxIndex];
				arr[maxIndex] =  temp;
			}
		}
	}
}
