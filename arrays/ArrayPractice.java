package arrays;

/**
 * finding min and max in array
 * @author tinRup
 *
 */
public class ArrayPractice {

	public static void main(String[] args) {
		int arr[] = new int[10];
		
		int max,min;
		min = 0;
		max = 0;
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		
			if( i <= 0) {
				max = arr[i];
				min = arr[i];
			}
			
			if(arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		
	System.out.println("max =  " + max);
	System.out.println("min =  " + min);
		
		for (int item : arr) {
			System.out.println(item);
			
		}
		
	}
	
}
