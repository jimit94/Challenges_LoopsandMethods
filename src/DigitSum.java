import java.util.Scanner;

public class DigitSum {
    // calculate the sum of the digits of a given number
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = input.nextInt();
        System.out.println("Sum of digits is " + sumOfDigits(num));
    }

    public static int sumOfDigits(int num) {

        int sum = 0;
        while (num>0){
            int remainder = num % 10;
            sum+=remainder;
            num /= 10;
        }
        return sum;
    }
}
