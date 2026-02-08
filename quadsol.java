 import java.lang.Math;
class Main {
    public static void main(String[] args) {
        double a = 1;
        double b = 5;
        double c = 6;
        double x = Math.sqrt((b*b) - (4*a*c));
        double y = -b + x;
        double z = -b - x;
        double solone = y/(2*a);
        double soltwo = z/(2*a);
        System.out.println(solone);
        System.out.println(soltwo);
    }
}