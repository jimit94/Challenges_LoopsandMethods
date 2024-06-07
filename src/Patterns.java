import java.util.Scanner;

public class Patterns {
    // print patterns
    public static void main(String[] args) {
        System.out.println("Welcome to patterns");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number of rows you want to print : ");
        int rows = input.nextInt();
       // first(rows);
//second(rows);
        
    }

    public static void first(int rows) {
        int i = 0;
        while (i<rows){
            System.out.print("* ");
            int j = 0;
            while (j<i){
                System.out.print("* ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
    public static void second(int rows) {

        while (rows>0){
            System.out.print("* ");
            int j = 0;
            while (j<rows){
                System.out.print("* ");
                j++;
            }
           rows--;
            System.out.println();
        }
    }

}
