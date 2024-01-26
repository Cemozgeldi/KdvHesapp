package KdvApp;

import java.util.Scanner;

public class kdvApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ürün fiyatını giriniz: ");
        double urunFiyat = input.nextDouble();

        double kdvOrani = (urunFiyat > 0 && urunFiyat <= 1000) ? 0.18 : 0.08;

        double kdvliTutar = (urunFiyat*kdvOrani)+urunFiyat;
        System.out.println("Kdv'siz fiyat: " + urunFiyat);
        System.out.println("Kdv'li fiyat : " + kdvliTutar);
        System.out.println("Kdv orani: " + kdvOrani);
    }
}

