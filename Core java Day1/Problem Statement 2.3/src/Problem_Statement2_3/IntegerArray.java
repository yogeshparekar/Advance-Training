package Problem_Statement2_3;

public class IntegerArray {  
    static int getMin(int arr[], int n)
    {
        int res = arr[0];
         
        for (int i = 1; i < n; i++)
            res = Math.min(res, arr[i]);
        return res;
    }
	public static void main(String[] args) {  
        //Initialize array  
		int sum = 0;  
		
		
        int [] arr = new int [] {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0,};  
        
        //Loop through the array to calculate sum of elements  
        for (int i = 0; i < arr.length; i++) {  
           sum = sum + arr[i];  
        }  
        
        System.out.println("Sum of all the elements of an array: " + sum);  
        double average = sum / arr.length;
        System.out.println("Average value of the array elements is : " + average); 
        int n = arr.length;
        System.out.println( "Minimum element"
                + " of array: " + getMin(arr, n));
      
        
} 
}