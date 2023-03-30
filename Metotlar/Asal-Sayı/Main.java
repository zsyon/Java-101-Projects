import java.util.Scanner;

public class Main {

  static String f(int n){

    for(int i=2 ; i<10 ; i++){
      if(n%i == 0){
        return n + "sayısı ASALDIR !";
      }
      else {
        return n + "sayısı ASAL DEĞİLDİR !";
      }
    }

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