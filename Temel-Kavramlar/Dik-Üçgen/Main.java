import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    double kenar1, kenar2, kenar3;

    Scanner input = new Scanner(System.in);

    System.out.print("1.Kenarı Giriniz : ");
    kenar1 = input.nextDouble();

    System.out.print("2.Kenarı Giriniz : ");
    kenar2 = input.nextDouble();

    System.out.print("3.Kenarı Giriniz : ");
    kenar3 = input.nextDouble();

    double cevre = kenar1+kenar2+kenar3;
    System.out.println("Üçgenin Çevresi : " + cevre);

    double u = cevre / 2;
    double alan;

    alan = u*(u - kenar1)*(u - kenar2)*(u - kenar3);
    System.out.println("Üçgenin Alanı : " + alan);

  }
  
}