import java.util.Scanner;

public class Palindrome {
    // check if a number is palindrome or not
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = input.nextInt();
        if(isPalindrome(num)){
            System.out.println(" Your number is palindrome");
        }else {
            System.out.println(" Your number is not palindrome");
        }

    }

    public static boolean isPalindrome(int num) {
        int numCopy = num;
        int newNum = 0;
        int lastDigit;
        while (num>0){
            lastDigit = num % 10;
            newNum = (newNum * 10) + lastDigit;
            num=num/10;
        }
        return newNum == numCopy;
    }
}
