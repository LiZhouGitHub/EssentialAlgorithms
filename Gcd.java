public class Gcd{
  public static void main(String[] args) {
    int a = 1234;
    int b = 5678;
    
    int r = gcd(a, b);
    
    System.out.println(r);
  }
  
  public static int gcd(int a, int b) {
    int c = a % b;
    if (c == 0) {
      return b;
    }
    
    return gcd(b, c);
  }
}
