/**
 * Created by USER on 21/09/2019.
 */
import java.util.*;
public class Pro_19 {
    public static void main(String[] args) {
        System.out.println("Enter number of line for dimond :");
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();

        for(int i = 1 ; i <= line ; i++){
            for(int j = line-i ; j>=1; j--)
                System.out.print(" ");
            for(int k = 1; k<=(i+(i-1)) ; k++)
                System.out.print("*");
            System.out.println("");
        }
        for(int i = line  ; i >=1  ; i--){
            for(int j = 1 ; j <= line-i ; j++)
                System.out.print(" ");
            for(int k =(i+(i-1)); k>=1 ; k--)
                System.out.print("*");
            System.out.println("");
        }

    }
}
