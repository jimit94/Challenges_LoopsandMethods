import java.util.Scanner;

public class ReverseDigits {
    // write a program to reverse digits of a number
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = input.nextInt();
        System.out.println("New number is " + reverse(num));
    }

    public static int reverse(int num) {
       int newNum = 0;
       while (num>0){
           int digit = num % 10;
           newNum = (newNum * 10) + digit;
           num = num / 10;
       }
       return newNum;
    }
}
