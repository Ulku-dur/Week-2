
import java.util.Scanner;
public class Main {
    static String isPalindrome (String word) {
        String reverse = "";  int j = word.length()-1;
        for (int i = word.length()-1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        if (word.equals(reverse)) {
            return "it's a palindromic word";
        }
        else
            return "it's not a palindromic word";
    }
    public static void main(String[] args) {
        String str;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter word: ");
       str= scan.nextLine();
        System.out.println(isPalindrome(str));
    }
}