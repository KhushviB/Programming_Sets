import java.util.*;
// ci = amount - p;
// amount = p(1-r/100)^t;
public class compound_interest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();
        double amount = p * Math.pow((1+r/100), t);
        double ci = amount - p;
        System.out.println(ci + " " + amount);
    }
}
