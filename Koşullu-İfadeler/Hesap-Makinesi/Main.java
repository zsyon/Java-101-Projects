import java.util.Scanner;
/**
 * hesapMakinesi
 */
public class Main {
  public static void main(String[] args) {
    int sayi1, sayi2, secim;

    Scanner input = new Scanner(System.in);

    System.out.print("İlk Sayıyı Giriniz : ");
    sayi1 = input.nextInt();

    System.out.print("İkinci Sayıyı Giriniz : ");
    sayi2 = input.nextInt();

    System.out.println("Yapmak İstediğiniz İşlemi Seçin : ");
    System.out.println("1-Toplama  2-Çıkarma  3-Çarpma  4-Bölme");

    int toplama = sayi1+sayi2;
    int cikarma = sayi1-sayi2;
    int carpma = sayi1*sayi2;
    int bolme = sayi1/sayi2;

    secim = input.nextInt();

    switch (secim) {
      case 1:
        System.out.println(toplama);
        break;
      case 2:
        System.out.println(cikarma);
        break;
      case 3:
        System.out.println(carpma);
        break;
      case 4:
        System.out.println(bolme);
        break;
      default:
        System.out.println("Hatalı giriş yaptınız !!");
        break;
    }
  }
}