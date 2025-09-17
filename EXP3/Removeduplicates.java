import java.util.Scanner ;
import java.util.Arrays;

class Removeduplicates{

	public static void main(String args[]){
		System.out.println("LAKSHAY YADAV , 24csu112");
		Scanner scan = new Scanner(System.in);

		System.out.println("enter the no of elements in the array");
	    int n = scan.nextInt();



	    System.out.println("enter the elements of the array");

	    int arr[] = new int[n];

	    for(int i = 0 ; i < n ; i++){
	    	arr[i] = scan.nextInt();
	    }


	    System.out.println("The array without any duplicates is :");

	    int temp[] = new int[n];
	    int length = 0;


	    for(int i = 0 ; i < n ; i++){

	    	boolean isduplicate = false;


	    	for(int j = 0 ; j < n ; j++){
	    		if(arr[i] == temp[j]){
	    			isduplicate = true;
	    			break;
	    		}
	    	}


	    	if(!isduplicate){
	    		temp[length] = arr[i];
	    		length ++;
	    	}
	    }

	    int temp1 [] = Arrays.copyOf(temp, length);

	    for(int i = 0 ; i < length ; i++){
	    	System.out.print(temp1[i] + "  " );
	    }

	    scan.close();

	}
}