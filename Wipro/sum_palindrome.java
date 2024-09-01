import java.util.*;
public class sum_palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int org = num;
        int rev = 0;
        int sum =0;
        while(num > 0){
            int rem = num % 10;
            sum = sum + rem;
            num/=10;
        }
        
        int ans = sum;
        while(sum > 0){
            int rem = sum%10;
            rev = rev * 10 + rem;
            sum/=10;
        }
        if(rev == ans){
            System.out.println("The sum of number is palindrome");
        }else {
            System.out.println("The sum of number is not palindrome");
        }
    }
}
