import java.util.Scanner;

public class GCD {
    // find gcd of given numbers
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter first number : ");
        int a = input.nextInt();
        System.out.print("Please enter second number : ");
        int b = input.nextInt();
        System.out.println("GCD is " + gcd(a,b));

    }

    public static int gcd(int a,int b) {
int min = min(a,b);
int i = 1;
int gcd = 1;
while (i<=min){
    if(a%i==0 && b%i==0){
        gcd = i;
    }
    i++;
}return gcd;

    }

    public static int min(int a,int b) {
        if(a<b){
            return a;
        }
        else {
            return b;
     }
    }
}
