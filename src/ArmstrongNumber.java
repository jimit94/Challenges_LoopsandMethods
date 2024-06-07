import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = input.nextInt();
        if(isArmstrong(num)){
            System.out.println("Your number is armstrong");
        }else{
            System.out.println("Your number is not armstrong");
        }
    }

    public static boolean isArmstrong(int num) {
        int numCopy = num;
        int digits = noOfDigits(num);
        int finalNumber = 0;
        while(num>0){
            int lastDigit = num % 10;
            num/=10;
            finalNumber += pow(lastDigit,digits);
        }
        return finalNumber == numCopy;
    }

    public static int pow(int num1,int num2) {
        int result = 1;
        int i = 0;
        while (i<num2){
            result*=num1;
            i++;
        }
        return result;
    }
    public static int noOfDigits(int num) {
        int digits = 0;
        while(num>0){
            digits++;
           num =  num/10;

        }
        return digits;
    }
}
