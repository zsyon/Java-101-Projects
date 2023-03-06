import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    int sayi;
    int cift=0;
    Scanner input = new Scanner(System.in);

    do {
      System.out.print("Lütfen bir sayı giriniz : ");
      sayi = input.nextInt();

      if(sayi % 2 == 0 || sayi % 4 == 0){
        cift += sayi;
      }
        
    } while (sayi % 2 == 0);

    System.out.println("Toplam "+ cift);
    
  }
  
}
