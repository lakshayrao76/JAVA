import java.util.Scanner;

 class maxmin{
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

 		int max = arr[0];
 		int min = arr[0];

 		for(int i = 0 ; i < n ; i++){
 			if(arr[i]>max){
 				max = arr[i];
 			}
 			if(arr[i]<min){
 				min = arr[i];
 			}
 		}
 		System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);

       }
   }