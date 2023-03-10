import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    int mesafe, yas, yolculukTipi;

    Scanner input = new Scanner(System.in);

    System.out.print("Mesafeyi km türünden giriniz : ");
    mesafe = input.nextInt();

    System.out.print("Yaşınızı giriniz : ");
    yas = input.nextInt();

    System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
    yolculukTipi = input.nextInt();

    if(mesafe>0 && yas>0 && yolculukTipi==2 ){
      
    }
    else if(yolculukTipi==1){
      
    }
    else{
      System.out.println("Hatalı Giriş Yaptınız !");
    }
    
  }
  
}