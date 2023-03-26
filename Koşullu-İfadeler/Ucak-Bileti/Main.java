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

    double tutar, indirimliTutar =0, yasİndirimi, gidisDonusIndirimi , toplam=0 ;
    tutar = mesafe * 0.10;

    if(mesafe>0 && yas>0 && yolculukTipi==1 || yolculukTipi==2 ){
      if(yas<12){
        yasİndirimi = tutar * 0.5;
        indirimliTutar = tutar - yasİndirimi;
        if(yolculukTipi==2){
          gidisDonusIndirimi = indirimliTutar * 0.2;
          toplam = (indirimliTutar - gidisDonusIndirimi) * 2;
          System.out.println(toplam);
        }
        else{
          System.out.println(indirimliTutar);
        }
      }
      else if(yas>12 && yas<24){
        yasİndirimi = tutar * 0.1;
        indirimliTutar = tutar - yasİndirimi;
        if(yolculukTipi==2){
          gidisDonusIndirimi = indirimliTutar * 0.2;
          toplam = (indirimliTutar - gidisDonusIndirimi) * 2;
          System.out.println(toplam);
        }
        else{
          System.out.println(indirimliTutar);
        }
  
      }
      else if(yas>65){
        yasİndirimi = tutar * 0.3;
        indirimliTutar = tutar - yasİndirimi;
        if(yolculukTipi==2){
          gidisDonusIndirimi = indirimliTutar * 0.2;
          toplam = (indirimliTutar - gidisDonusIndirimi) * 2;
          System.out.println(toplam);
        }
        else{
          System.out.println(indirimliTutar);
        }
      }
      else{
        System.out.println(tutar);
      }
    }
    else{
      System.out.println("Hatalı Giriş Yaptınız !");
    }
  }
}