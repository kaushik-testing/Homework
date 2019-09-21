/**
 * Created by USER on 20/09/2019.
 */
import java.util.*;
public class Pro_13 {
    public static int num1,num2;
    public static void main(String[] args) {
        System.out.println("Please enter two number");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("Method hasSharedDigit(num1,num2) is returning  " + hasSharedDigit(num1,num2));
    }
    public static boolean hasSharedDigit(int temp1,int temp2){
        if(temp1 <10 || temp1 > 99 || temp2 < 10 || temp2 > 99) return false;
        else{
            while(temp1>=1){
                int c = temp1 % 10;
                while(temp2>=1){
                    int d = temp2 % 10;
                    if(d == c) return true;
                    temp2 = temp2/10;
                }
                temp2 = num2;
                temp1 = temp1 / 10;
            }
            return false;
        }
    }
}
