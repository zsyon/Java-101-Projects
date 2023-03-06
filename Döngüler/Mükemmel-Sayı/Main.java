import java.util.Scanner;

/**
 * mukemmelSayiBulanProgram
 */
public class Main {
  public static void main(String[] args) {
    
    System.out.print("Lütfen sayı giriniz : ");
    Scanner input = new Scanner(System.in);
    int sayi = input.nextInt();
    int toplam=0;

    for(int i=1 ; i<sayi ; i++){

      if(sayi%i == 0){

        toplam += i;
        
      }
    }

    if(sayi==toplam){
      System.out.println(sayi + " Mükemmel sayıdır");
    }
    else{
      System.out.println(sayi + " Mükemmel sayı değildir");
    }
  }
}