import java.util.Scanner;

public class MultiplicationTable {
    // print multiplication table for given number
    public static void main(String[] args) {
        System.out.println("Welcome to multiplication table");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = input.nextInt();
        multiplicationTable(num);

    }

    public static void multiplicationTable(int num) {

        int i = 1;
        while(i<=10){
            System.out.println(num + " x " +  i + " = " + (num * i) );
            i++;
        }
    }

}
