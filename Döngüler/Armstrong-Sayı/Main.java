import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    int sayi;

    Scanner input = new Scanner(System.in);

    System.out.print("Lütfen sayı giriniz : ");
    sayi = input.nextInt();

    System.out.println(sayi);

    int birler_basamagi = sayi%10 ;

    System.out.println(birler_basamagi);
    
  }
}