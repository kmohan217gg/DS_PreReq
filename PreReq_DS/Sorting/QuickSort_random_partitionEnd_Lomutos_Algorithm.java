package sorting;
import java.util.Arrays;
import java.util.Random;

public class QuickSort_random_partitionEnd_Lomutos_Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] Arr = { 80, 40, 9, 90, 70, 81 };
		int[] Arr = { 51, 3, 87, 64, 23, 19, 85, 72};
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
			quickSort(Arr, p, q-1);
			quickSort(Arr, q+1, r);
		}
	}

	
	private static int choosePivot(int[] Arr, int p, int r)
	{
		//return r;
		
		/*Random random = new Random();  
		int rnd = random.nextInt((r-p)+1)+p;
		System.out.println(rnd);
		// swap random and high element like r
		swap(Arr, rnd, r); */
		return r;
		
		
	}
	
	private static int partition(int[] Arr, int p, int r, int pi)
	{
		int i=p-1; 
		int x= Arr[pi];
		
		for (int j=p; j < r; j++)
		{
			if (Arr[j] <= x)
			{
				i=i+1;
				swap(Arr,i,j);
			}
		}
		swap(Arr, i+1, r);
        return i+1;		
	}
	
	
	private static void swap(int[] Arr, int i, int j)
	{
		int temp=Arr[i];
		Arr[i]=Arr[j];
		Arr[j]=temp;
	}

}
