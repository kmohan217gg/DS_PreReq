package sorting;

import java.util.Arrays;

public class MergeSort_Algorithm_merge_dynamic_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 51, 3, 87, 64, 23, 19, 85, 72};
		
	    System.out.println(Arrays.toString(arr));
		
		merge_sort(arr, 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));

	}

	private static void merge_sort(int[] arr, int p, int r) 
	{
		if (p < r)
		{
			int q = p + (r - p)/2;
			
			merge_sort(arr, p, q);
			merge_sort(arr, q+1, r);
			merge(arr, p, q, r);
		}
	}

	// Merging using Dynamic Array
	
	private static void merge(int[] arr, int p, int q, int r) 
	{
		int n1=q-p+1;
		int n2=r-q;
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		
		int ALen=0;
		int BLen =0;
		for (int i=p; i <=q; i++)
		{
			L[ALen] = arr[i]; 
			ALen++;
		}
		
	    for (int j=q+1; j <= r; j++)
	    {
			R[BLen] = arr[j];
			BLen++;
        }
		
		
		int i=0, j=0, k=p;
		
		while (i < n1 && j < n2)
		{
			if (L[i] <= R[j])
			{
				arr[k]=L[i];
				i++;
			}
			else
			{
				arr[k]=R[j];
				j++;
			}
			k++;
		}
		
		while (i < n1)
		{
			arr[k]=L[i];
			k++;i++;
		}
		while (j < n2)
		{
			arr[k]=R[j];
			k++;j++;
		}
		
	}
	
	
	
	
	

}
