import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    int yas, yolculukTipi;
    double mesafe;

    Scanner input = new Scanner(System.in);

    System.out.print("Mesafeyi km türünden giriniz : ");
    mesafe = input.nextDouble();

    System.out.print("Yaşınızı giriniz : ");
    yas = input.nextInt();

    System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
    yolculukTipi = input.nextInt();

    double tutar, indirimliTutar =0, yasİndirimi ;
    tutar = mesafe * 0.10;

    if(mesafe>0 && yas>0 && yolculukTipi==1 ){

      if(yas<12){
        yasİndirimi = tutar * 0.5;
        indirimliTutar = tutar - yasİndirimi;

      }
      else if(yas>12 && yas<24){

      }
      else if(yas>65){

      }
      
    }
    else if(yolculukTipi==2){
      
    }
    else{
      System.out.println("Hatalı Giriş Yaptınız !");
    }

    System.out.println(indirimliTutar);
    
  }
  
}