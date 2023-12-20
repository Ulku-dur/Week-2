import java.util.Scanner;

public class Main {
    // Recursive metot
    public static int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        } else {
            // In this way, the us value is decreased by one at each step 
           // and the method is called again. Recursion continues until exp. becomes 0, in which case 1 is returned and recursion ends. *
            return base * power(base, exp-1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base num: ");
        int base = scanner.nextInt();
        System.out.print("Enter exp. num: ");
        int exp = scanner.nextInt();
        if (exp < 0) {
            System.out.println("Please enter positive number.");
        } else {
            int result = power(base,exp);
            System.out.println(base + "^" + exp + " = " + result);
        }
    }
}
