package sorting;
import java.util.Arrays;
import java.util.Random;

public class QuickSort_random_partitionFirst_Hoares_Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] Arr = { 80, 40, 9, 90, 70, 81 };
		//int[] Arr = { 51, 3, 87, 64, 23, 19, 85, 72};
		//int[] Arr = { 80, 70, 60, 50, 40, 30 };
		//int[] Arr = { 30, 40, 50, 60, 70, 80 };
		int[] Arr = { 12, 11, 13, 5, 6, 10 };
		System.out.println("Original :"+Arrays.toString(Arr));
		
		int p = 0;
		int r = Arr.length - 1;
		
		long src_time = System.currentTimeMillis();
		quickSort(Arr, p, r);
		long dest_time = System.currentTimeMillis();
		System.out.println("time:"+(dest_time-src_time)+" milli sec");
		System.out.println("Sorted   :"+Arrays.toString(Arr));
		
	}
	
	
	private static void quickSort(int[] Arr, int p, int r) {
		// TODO Auto-generated method stub
		if (p < r)
		{
			int pi = choosePivot(Arr,p,r);
			int q = partition(Arr,p, r, pi);
			quickSort(Arr, p, q);
			quickSort(Arr, q+1, r);
		}
	}

	
	private static int choosePivot(int[] Arr, int p, int r)
	{
		//return p;
		
		/*Random random = new Random();  
		int rnd = random.nextInt((r-p)+1)+p;
		System.out.println(rnd);
		// swap random and low element like r
		swap(Arr, rnd, p); */
		return p;
		
	}
	
	private static int partition(int[] Arr, int p, int r, int pi)
	{
		int i=p-1;
		int j=r+1;
		int x=Arr[pi];
		//System.out.println("*i:"+i+":j"+j);
		
		while (true)
		{	
			  do { i++; } while(Arr[i] < x);
		      do { j--; } while(Arr[j] > x);
		      if (i < j) swap(Arr, i, j);
		      else return j;
			
		}		
	}
	
		
	
	private static void swap(int[] Arr, int i, int j)
	{
		int temp=Arr[i];
		Arr[i]=Arr[j];
		Arr[j]=temp;
	}

}
