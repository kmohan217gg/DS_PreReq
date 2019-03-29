package Test;

public class LinearSearchIterative {
	
	public static void main(String[] args)
	{
		int A[] = { 10,12,13,16,9,30}; 
		int search = 13;
		System.out.println(linearSearch(A,A.length, search));
	}

	
	@SuppressWarnings("unused")
	private static int linearSearch(int A[], int size, int k)
	{
		
		for (int i =0; i < size; i++)
		{
			if (A[i] == k)
				return i;
		}
		return -1;
	}

}
