import java.util.Scanner;
public class Reversed{
    public static void main(String[] args) {
    System.out.println("lakshaya yadav , 24csu112 ");
     Scanner sc = new Scanner(System.in);

System.out.println("eneter a number : ");
int number = sc.nextInt();

int reversed = 0 ;
int sum=0;
int lastdigit = 0 ;

while(number != 0){
lastdigit = number % 10 ;
sum += lastdigit;
reversed = reversed * 10 + lastdigit;
number = number/10;
}

System.out.println("Reversed number : " +reversed);
System.out.println("Sum : " +sum);

}
}


