import java.util.Scanner;

public class Main {

  static void f(int n){

    for (int i=n ; i<=0 ; i--){
      System.out.println(n);
    }

  }

  public static void main(String[] args) {

    int sayi;
    Scanner input = new Scanner(System.in);

    System.out.print("Sayı giriniz : ");
    sayi = input.nextInt();

    f(sayi);

  }
}