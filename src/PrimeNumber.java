import java.util.Scanner;

public class PrimeNumber {
    // check if the given number is prime or not
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = input.nextInt();
        boolean val = prime(num);
      if(val){
          System.out.println("Number is prime");
      }
      else {
          System.out.println("Number is not prime");
      }

    }

    public static boolean prime(int num){
        if(num>1){
            int i =2;
            while (i<num){
                if(num%i==0){
                    return false;
                }

                i++;
            }
        }
        else if (num==2) {
            System.out.println("Number is Prime");
        }
        else {
            System.out.println("Please enter a number greater than 1.");
        }
        return true;
    }
}
