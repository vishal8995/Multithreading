package interviewQuestions;

public class ReverseIntegerArray {
	
	public static void reverseIntArray(int arr[], int n) {
		
		int x;
		for (int i=0; i < n/2; i++) {
			x = arr[i];
			arr[i] = arr[n-i-1];
			arr[n-i-1] = x;
		}
		
		for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
	}

}