
public class Merge {
	
	
	static void merge(int arr[], int l, int m, int r) 
	{ 
	    int i, j, k; 
	    int n1 = m - l + 1; 
	    int n2 =  r - m; 
	  
	   
	    int L[]=new int[n1];
	    int R[]=new int[n2]; 
	  
	    
	    for (i = 0; i < n1; i++) 
	        L[i] = arr[l + i]; 
	    for (j = 0; j < n2; j++) 
	        R[j] = arr[m + 1+ j]; 
	  
	   
	    i = 0; 
	    j = 0; 
	    k = l; 
	    while (i < n1 && j < n2) 
	    { 
	        if (L[i] <= R[j]) 
	        { 
	            arr[k] = L[i]; 
	            i++; 
	        } 
	        else
	        { 
	            arr[k] = R[j]; 
	            j++; 
	        } 
	        k++; 
	    } 
	  
	   
	    while (i < n1) 
	    { 
	        arr[k] = L[i]; 
	        i++; 
	        k++; 
	    } 
	  
	    
	    while (j < n2) 
	    { 
	        arr[k] = R[j]; 
	        j++; 
	        k++; 
	    } 
	} 
	  
	 static void mergeSort(int arr[], int l, int r) 
	{ 
	    if (l < r) 
	    {
	        int m = l+(r-l)/2; 
	  
	        
	        mergeSort(arr, l, m); 
	        mergeSort(arr, m+1, r); 
	  
	        merge(arr, l, m, r); 
	    } 
	}
	public static void main(String[] args){
	int a[]={10,20,90,40,50,60};
	mergeSort(a,0,5);
	for(int i=0; i<6;i++)
	{
		System.out.println(a[i]);
		
	}
	}
	
}