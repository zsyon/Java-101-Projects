import java.util.Scanner;

public class Main {

  static String f(int n){


    return "a";
  }

  public static void main(String[] args) {

    int sayi;
    Scanner input = new Scanner(System.in);

    System.out.print("Sayı giriniz : ");
    sayi = input.nextInt();

    System.out.println(f(sayi));


  }
}