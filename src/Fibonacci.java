import java.util.Scanner;

public class Fibonacci {
    // print fibonacci series till a given number
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = input.nextInt();
        fib(num);
    }

    public static void fib(int num) {
int a = 0;
int b = 1;
int c = a + b;

        System.out.print(a);
        System.out.print(b);
while (c<=num) {

    System.out.print(c);
    a = b;
    b = c;
    c = a + b;

}
    }
}
