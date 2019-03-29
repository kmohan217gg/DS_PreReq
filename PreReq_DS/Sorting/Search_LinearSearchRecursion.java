package Test;

public class Search_LinearSearchRecursion {
	
	public static void main(String[] args)
	{
		//          0 ,1 ,2 ,3 ,4 ,5
		int A[] = { 10,12,13,16,9,30};
		int searchFor = 12;
		System.out.println(linearRecursionSearch(A,0,A.length, searchFor));
	}
	
	@SuppressWarnings("unused")
	private static int linearRecursionSearch(int A[], int index, int size, int k)
	{
		if (index == size) 
				return -1;	
		
		if (A[index] == k)
			return index;
		else
		{
		    index++;
			return linearRecursionSearch(A, index, size, k);
		}  
				  
	}

}
