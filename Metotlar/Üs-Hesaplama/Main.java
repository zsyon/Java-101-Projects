import java.util.Scanner;

public class Main {

  static int ustel(int a, int b){
    return a;
  }

  public static void main(String[] args) {

    int us, taban;
    Scanner input = new Scanner(System.in);

    System.out.print("Taban değeri giriniz : ");
    taban = input.nextInt();

    System.out.print("Üs değeri giriniz : ");
    us = input.nextInt();

    System.out.println(ustel(taban ,us));
    
  }
}