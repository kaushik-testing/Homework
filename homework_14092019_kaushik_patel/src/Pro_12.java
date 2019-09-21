/**
 * Created by USER on 20/09/2019.
 */
import java.util.*;
public class Pro_12 {
    public static void main(String[] args) {
        System.out.println("Enter Number to check it is Prime or not");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num + " is prime? : " + isprime(num) );
    }
    public static boolean isprime(int temp){
        int flag = 0;
        if(temp <= 1) return false;
        else{
            int i = 1;
            for(i=2; i<=temp/2 ; i++);
            {
                if(temp % i == 0) return false;
            }
            return true;
        }
    }
}
