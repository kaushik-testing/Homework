/**
 * Created by USER on 18/09/2019.isPalindrome
 */
import java.util.*;
public class Pro_5 {
    public static int num;
    public static void main(String[] args){
        System.out.println("Please Enter a number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("isPalindrome methode has return : " + isPalindrome(num));
    }
    public static boolean isPalindrome(int a){
        int temp = 0;
        while (a >= 1) {
            temp = (temp * 10) + (a%10);
            a = a / 10;
        }
        if(temp == num)
            return true;
        else
            return false;
    }
}
