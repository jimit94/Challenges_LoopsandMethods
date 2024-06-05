import java.util.Scanner;

public class LCM {
    // Find the LCM of given numbers
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter first number : ");
        int a = input.nextInt();
        System.out.print("Please enter second number : ");
        int b = input.nextInt();
        System.out.println("LCM is " + lcm(a,b));
    }

    public static int lcm(int a,int b) {
        int i = 1;
        while (i<b){
            if((a*i) % b == 0){
                return a*i;
            }
            i++;
        }
        return 0; 
    }
}
