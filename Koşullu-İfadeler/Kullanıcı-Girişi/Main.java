import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    String kullaniciAdi, sifreSifirlama;
    int sifre; 

    Scanner input = new Scanner(System.in);

    System.out.print("Kullanıcı Adını Giriniz : ");
    kullaniciAdi = input.nextLine();

    System.out.print("Şifreyi Giriniz : ");
    sifre = input.nextInt();

    if(kullaniciAdi.equals("sude")){
      System.out.println("Kullanıcı Adı Doğru");
    }
    else{
      System.out.println("Hatalı Giriş Yaptınız !!");
    }

    if(sifre == 123){
      System.out.println("Şifre Doğru");
    }
    else{
      System.out.println("Hatalı Giriş Yaptınız !!");
      System.out.print("Şifrenizi sıfırlamak ister misiniz ?");

      Scanner inp = new Scanner(System.in);
      sifreSifirlama = inp.nextLine();

      if(sifreSifirlama.equals("evet")){
        System.out.print("Lütfen yeni şifreyi giriniz : ");
        int yeniSifre = inp.nextInt();

        if( yeniSifre==sifre || yeniSifre==123 ){
          System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
        }
        else{
          System.out.println("Şifre oluşturuldu");
        }

      }
    }
  }
}
