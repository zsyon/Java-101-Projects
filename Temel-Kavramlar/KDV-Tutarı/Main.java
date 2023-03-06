import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    double tutar, Kdv;
    Scanner input = new Scanner(System.in);

    System.out.print("Ücret Tutarını Giriniz : ");
    tutar = input.nextDouble();

    //double kdvli = (Kdv*tutar) + tutar;

    boolean sonuc = tutar > 1000;
    double kdvli = sonuc ? (0.08*tutar) + tutar : (0.18*tutar) + tutar;
    double kdvTutari = kdvli - tutar;

    System.out.println("KDV'siz Fiyat : " + tutar);
    System.out.println("KDV'li Fiyat : " + kdvli);
    System.out.println("KDV Tutarı : " + kdvTutari);
    
  }
 
}