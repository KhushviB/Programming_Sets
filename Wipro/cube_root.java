import java.util.*;
public class cube_root {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        double cuberoot = Math.cbrt(num);
        System.out.println("The cube root of " + num + " is " + cuberoot);

    }
}
