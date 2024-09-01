
import java.util.Scanner;

public class amstrong {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int org = num;
        int count = 0;
        while(num > 0){
            num = num/10;
            count++;
        }
        int n = org;
        int ans = 0;
        for(int i =0; i < count ; i++){
            int rem = n % 10;
            ans = ans + (int)Math.pow(rem, count);
            n = n/10;
        }
        if(ans == org) {
            System.out.println("The number is amstrong");
        }
        else {
            System.out.println("The number is not amstrong");
        }
    }
}
