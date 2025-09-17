import java.util.Scanner;

 class sumalt{
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

 		int allsum = 0;
 		int altsum = 0;

 		for(int i = 0 ; i < n ; i++){
 			allsum += arr[i];
 			if(i % 2 == 0){
 				altsum += arr[i];
 			}
 		}

 		System.out.println("sum of all the elements are : "+allsum);
 		System.out.println("sum of alt elements are :"+altsum);
 	}
 }

