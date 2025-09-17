import java.util.Scanner;

 class search{
 	public static void main(String [] args){
 		System.out.println("Lakshay yadav 24csu112");

 		Scanner scan = new Scanner(System.in);

 		System.out.println("enter the number of elements in the array :");
 		int n = scan.nextInt();

 		int[] arr = new int[n];
 		System.out.println("enter the elements of the array");
 		for(int i = 0 ;i < n ; i++){
 			arr[i] = scan.nextInt();
 		}

 		System.out.println("enter the element you want to search :");
 		int target = scan.nextInt();

 		boolean found = false ;
 		for(int i = 0 ; i < n ; i++){
 		if (arr[i] == target ){
 			System.out.println("element found at position :"+ (i + 1));
 			found = true ;
 			break ;
 		}
 	}
 	if (!found ){
 		System.out.println("Element does not exist buddy :(");
 	}



 	}
 }