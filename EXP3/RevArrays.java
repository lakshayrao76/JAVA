import java.util.Scanner;
import java.util.Arrays;

class RevArray{
	public static void main(String args[]){
		System.out.println("NISHTHA BHATT 24CSU352");
		Scanner scan = new Scanner(System.in);

		System.out.println("enter the no of elements in the array");
	    int n = scan.nextInt();



	    System.out.println("enter the elements of the array");

	    int arr[] = new int[n];

	    for(int i = 0 ; i < n ; i++){
	    	arr[i] = scan.nextInt();
	    }

	    System.out.println("the reverse of the array is");


	    for(int i = 0 ; i < n / 2 ; i++){
	    	int first = arr[i];
	    	arr[i] = arr[n - i - 1];

	    	arr[n - i - 1] = first;

	    }


	    for(int i = 0 ; i < n ; i++){
	    	System.out.print(arr[i] + "  ");
	    }

	    scan.close();

	}
}