import java.util.Scanner;

public class Main {

  static void f(int n){

    int a = 1;

    if(n%5 == 0){

      for (int i=n ; i>=0 ; i-=5){
        System.out.print(i + " ");
        a = i;
      }
  
      for (int i=a+5 ; i<=n ; i+=5){
        System.out.print(i + " ");
      }

    }
    else{

      for (int i=n ; i>=0 ; i-=5){
        System.out.print(i + " ");
        a = i;
      }
      System.out.print(a-5 + " ");
  
      for (int i=a ; i<=n ; i+=5){
        System.out.print(i + " ");
      }
  
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