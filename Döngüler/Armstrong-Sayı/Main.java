import java.util.Scanner;
/**
 * Main
 */
public class Main {

  public static void main(String[] args) {

    int sayi;

    Scanner input = new Scanner(System.in);

    System.out.print("Lütfen sayı giriniz : ");
    sayi = input.nextInt();

    int birler_basamagi = sayi%10 ;

    System.out.println(birler_basamagi);
    
  }
}