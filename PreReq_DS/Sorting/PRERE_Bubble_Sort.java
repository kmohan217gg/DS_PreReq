package sorting;

class PRERE_Bubble_Sort 
{ 
    void bubbleSort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
    } 
  
    /* Prints the array */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
    	PRERE_Bubble_Sort ob = new PRERE_Bubble_Sort(); 
       // int arr[] = {64, 34, 25, 12, 22, 11, 90};
    	int arr[] = {12, 11, 13, 5, 6};
        System.out.println("Original array is"); 
        printArray(arr);
        ob.bubbleSort(arr); 
        System.out.println("Sorted array"); 
        printArray(arr); 
    } 
} 
