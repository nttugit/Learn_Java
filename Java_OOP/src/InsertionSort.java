
public class InsertionSort implements SortInterface{

	@Override
	public void sortIncreasely(double[] arr) {
		int i, j, length = arr.length;
		double key;
	    for (i = 1; i < length; i++)
	    {
	        key = arr[i];
	        j = i - 1;
	 
	        // Move elements of arr[0..i-1], 
	        // that are greater than key, to one
	        // position ahead of their
	        // current position
	        while (j >= 0 && arr[j] > key)
	        {
	            arr[j + 1] = arr[j];
	            j = j - 1;
	        }
	        arr[j + 1] = key;
	    }
		
	}

	@Override
	public void sortDecreasely(double[] arr) {
		int i, j, length = arr.length;
		double key;
	    for (i = 1; i < length; i++)
	    {
	        key = arr[i];
	        j = i - 1;
	 
	        // Move elements of arr[0..i-1], 
	        // that are greater than key, to one
	        // position ahead of their
	        // current position
	        while (j >= 0 && arr[j] < key)
	        {
	            arr[j + 1] = arr[j];
	            j = j - 1;
	        }
	        arr[j + 1] = key;
	    }
		
	}

}
