package Test;

public class Search_BinarySearchRecursion {

	public static void main(String[] args)
	{
		           //0,1, 2, 3, 4, 5
		int A[] = { 10,12,13,16,19,30}; 
		int searchFor = 30;
		// int A[] = { 10,12,13,16,19,30}; 
		// int searchFor = 12;
		// REC::center:2:start0:end5
		// REC::center:0:start0:end1
		// REC::center:1:start1:end1
		// 1
		System.out.println(binaryRecursionSearch(A,A.length, searchFor, 0, A.length-1));
	}

	@SuppressWarnings("unused")
	private static int binaryRecursionSearch(int A[], int size, int k, int start, int end)
	{
		if (end >= start) 
        { 
			System.out.println(":start"+start+":end"+end+"x="+(end - start)/2);
            int center = start + (end - start)/2; 
            System.out.println("REC::center:"+center+":start"+start+":end"+end);
             
            if (A[center] == k) 
               return center; 
            
            if (A[center] > k) 
	             return binaryRecursionSearch(A, size, k, start, center - 1); 
            else  
	             return binaryRecursionSearch(A, size, k, center + 1, end); 
	    }
         
        return -1; 
	}
	
}
