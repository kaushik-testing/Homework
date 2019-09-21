/**
 * Created by USER on 21/09/2019.
 */
import java.util.*;
public class Pro_15 {
    public static void main(String[] args) {
        System.out.println("Please Enter 10 numbers;");
        Scanner sc = new Scanner(System.in);
        int []num = new int[10];
        int sum = 0;
        for(int i = 0; i < 10 ; i++) {
            num[i] = sc.nextInt();
            sum = sum + num[i];
        }
        System.out.println("sum of the 10 numbers = " + sum);
    }
}
