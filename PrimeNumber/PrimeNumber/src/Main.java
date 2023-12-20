
 import java.util.Scanner;
public class Main {
    public static void primeNum (int n) { // method is defined with a parameter
        boolean flag = false;
        for (int i = 2; i >= n-1;  i++) {
            if (n % i == 0) { // is not prime
                flag = true;
            }
        }
        if (!flag) {
            System.out.println(n + " is a prime number");
        }
        else {
            System.out.println(n + " is not a prime number");
        }
    }
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scan.nextInt();
        primeNum(n); // method is called
    }
}