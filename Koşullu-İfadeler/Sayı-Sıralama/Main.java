public class Main {
  public static void main(String[] args) {

    int sayi1 = 10, sayi2 = 5, sayi3 = 3;

    if(sayi1<sayi2 && sayi1<sayi3){
      System.out.println("En kücük sayi " + sayi1);
    }
    else if(sayi2<sayi1 && sayi2<sayi3){
      System.out.println("En küçük sayi " + sayi2);
    }
    else{
      System.out.println("En küçük sayi " + sayi3);
    }
  } 
}