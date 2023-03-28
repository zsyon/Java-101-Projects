
public class Main {

  static int f(int n){
    if(n == 2 || n == 1){
      return 1;
    }
    return f(n-2) + f(n-1);
  }

  public static void main(String[] args) {
    
    System.out.println("8.eleman : " + f(8));
  }
}