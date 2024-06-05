import java.util.Scanner;

public class SumOddNum {
    // create a program to sum all the odd numbers till number specified by the user
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print ("Please enter a number till which you want to get the sum of odd numbers : ");
        int num = input.nextInt();

        System.out.println("Sum of the odd numbers is : " + oddSum(num));

    }

    public static int oddSum(int num) {
        int sum = 0;
        int i = 1;
        while (i<=num){
            if(i % 2 != 0){
                sum+=i;
            }
            i++;
        }
        return sum;
    }
}
