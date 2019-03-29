package Test;

public class Search_BinarySearchIterative {

	public static void main(String[] args)
	{
		           //0,1, 2, 3, 4, 5
		int A[] = { 10,12,13,16,9,30}; 
		int k = 12;
		System.out.println(binarySearch(A,A.length, k));
	}

	@SuppressWarnings("unused")
	private static int binarySearch(int A[], int size, int k)
	{
		int low = 0; int high = size - 1; int center;
		
		while (low <= high )
		{
			center = low + (high - low) / 2;
			System.out.println("center:"+center+":low"+low+":high"+high);
			
			if (A[center] == k)
			{
				return center; 
			}
			if (A[center] < k) 
			{
			    low = center + 1;
			}
			else if (A[center] > k)
			{
				high = center - 1;
			}
		 }
		
		return -1;
				  
	}
}
