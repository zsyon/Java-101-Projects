import java.util.Scanner;
/**
 * Main
 */
public class Main {

  public static void main(String[] args) {

    int us, taban, sayi;

    Scanner input = new Scanner(System.in);

    System.out.print("Lütfen taban sayı giriniz : ");
    taban = input.nextInt();

    System.out.print("Lütfen üs sayı giriniz : ");
    us = input.nextInt();

    sayi = taban;

    for(int i=1 ; i<us ; i++){
      taban = taban * sayi ;
    }
    System.out.println("Sonuç : " + taban);
  }
}