import java.util.Scanner;

public class Factorial {
    // calculate factorial of a given number
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to get its factorial : ");
        int num = input.nextInt();
        System.out.println("Factorial of the entered number is " + factorial(num));
    }

    public static int factorial(int num) {
        int fact = 1;
        int i = 1;
        while (i<=num){
            fact*=i;
            i++;
        }
        return fact;
    }
}
