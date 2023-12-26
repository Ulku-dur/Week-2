import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Dizinin boyutunu kullanıcıdan al
        System.out.print("Dizinin boyutu n: ");
        int n = scanner.nextInt();
        // Diziyi oluştur
        int[] dizi = new int[n];
        // Dizinin elemanlarını kullanıcıdan al
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemanı: ");
            dizi[i] = scanner.nextInt();
        }
        // Diziyi küçükten büyüğe sırala
        Arrays.sort(dizi);
        // Sıralanmış diziyi ekrana yazdır
        System.out.print("Sıralama: ");
        for (int eleman : dizi) {
            System.out.print(eleman + " ");
        }
    }
}