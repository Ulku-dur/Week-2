import java.util.Scanner;
public class Main {
    static void recursiveMet(int n) { // We defined the method as void type because it will print the obtained values to the screen.
        // // Base case: If n is 0 or negative then end
        if (n <= 0) {
            System.out.print(n+ " ");
            return; // terminated
        }
        else {
            System.out.print(n+ " ");
            recursiveMet(n-5);
        }
        // added +5 to n-5
        System.out.print(n+ " ");
    }
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = input.nextInt();
        recursiveMet(num);
    }
}