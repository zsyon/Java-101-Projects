import java.util.Scanner;
/**
 * Main
 */
public class Main {

  public static void main(String[] args) {

    int n, r, n_faktoriyel=1, r_faktoriyel=1, faktoriyel=1;

    Scanner input = new Scanner(System.in);

    System.out.print("Lütfen n sayı giriniz : ");
    n = input.nextInt();

    System.out.print("Lütfen r sayı giriniz : ");
    r = input.nextInt();

    for(int i=1 ; i<=n ; i++){
      n_faktoriyel *= i;
    }

    for(int i=1 ; i<=r ; i++){
      r_faktoriyel *= i;
    }

    for(int i=1 ; i<=(n-r) ; i++){
      faktoriyel *= i;
    }

    double sonuc;
    sonuc = n_faktoriyel / (r_faktoriyel * faktoriyel);

    System.out.println("Kombinasyon Sonucu = " + sonuc);

  }
}