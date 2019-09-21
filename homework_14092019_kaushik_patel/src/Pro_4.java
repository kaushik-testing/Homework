/**
 * Created by USER on 18/09/2019.
 */
import java.util.*;
public class Pro_4 {
    public static int num;
    public static void main(String[] args){
        System.out.println("Please Enter a number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("sumDigit methode has return : " + sumDigit(num));
    }
    public static int sumDigit(int a){
        if(a < 10 )
            return -1;
        else {
            int temp = 0;
            while (a >= 1) {
                temp = temp + (a%10);
                a = a / 10;
            }
            return temp;
        }
    }
}
