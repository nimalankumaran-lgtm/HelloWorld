// Online Java Compiler
// Use this editor to write, compile and run your Java code online
 import java.lang.Math;
class Main {
    static String mysqrt(double x) {
      if(x >= 0){
    String y = String.valueOf(Math.sqrt(x));
    return y;
      }
      else{
         String y = String.valueOf(Math.sqrt(-x)) + "i"; 
         return y;
      }
      
  }
    static String mydiv(String x, double y){
        int len = x.length();
        char lastChar = x.charAt(len - 1);
        if (lastChar == 'i'){
            String a=x.substring(0, x.length() - 1);
            double b = Double.parseDouble(a)/y;
            return String.valueOf(b)+"i";
        }
        else{
            double b = Double.parseDouble(x)/y;
            return String.valueOf(b);
        }
        
        
    }
    public static void main(String[] args) {
        double a = 1;
        double b = 5;
        double c = 6;
        String x = mysqrt((b*b) - (4*a*c));
        double y = -b/2*a ;
        double z = -b/2*a ;
        String solone = y + "+" + mydiv(x, 2*a);
        String soltwo = z + "-" + mydiv(x, 2*a);
        double d = -b/a;
        double e = c/a;
        System.out.println("First solution is " + solone);
        System.out.println("Second solution is " + soltwo);
        System.out.println("Sum of roots is " + d);
        System.out.println("Product of roots is " + e);
    }
}