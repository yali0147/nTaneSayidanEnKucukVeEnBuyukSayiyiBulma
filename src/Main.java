import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz? ");
        int n = scan.nextInt();
        int[] dizi = new int[n];
        int enKucuk = Integer.MAX_VALUE;
        int enBuyuk = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz: ");
            dizi[i] = scan.nextInt();
            if (dizi[i] < enKucuk) {
                enKucuk = dizi[i];
            }
            if (dizi[i] > enBuyuk) {
                enBuyuk = dizi[i];
            }
        }
        System.out.println("Girdiğiniz sayılardan en küçüğü: " + enKucuk);
        System.out.println("Girdiğiniz sayılardan en büyüğü: " + enBuyuk);
        scan.close();
    }
}


