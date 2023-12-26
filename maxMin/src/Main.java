import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static int enYakinKucukSayi(int[] dizi, int sayi) {
        Arrays.sort(dizi); // Diziyi küçükten büyüğe sırala

        for (int i = dizi.length - 1; i >= 0; i--) {
            if (dizi[i] < sayi) {
                return dizi[i];
            }
        }
        return -1; // bulunmazsa -1 döndür
    }
    public static int enYakinBuyukSayi(int[] dizi, int sayi) { //parametresi dizi ve kullanıcıdan alınan değer olan metot tanımlandı
        Arrays.sort(dizi); // Diziyi küçükten büyüğe sırala
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] > sayi) {
                return dizi[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // Dizi değeri
        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};
        // Kullanıcıdan sayı al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int girilenSayi = scanner.nextInt();

        // En yakın küçük ve büyük sayıları bul
        int enYakinKucuk = enYakinKucukSayi(dizi, girilenSayi);
        int enYakinBuyuk = enYakinBuyukSayi(dizi, girilenSayi);

        // Sonuçları ekrana yazdır
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + enYakinKucuk);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + enYakinBuyuk);
    }
}
