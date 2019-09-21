/**
 * Created by USER on 18/09/2019.
 */
import java.util.*;
public class Pro_6 {
    public static void main(String[] args) {
        System.out.println("please Enter Number of line for numeric triangle : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1 ; i <= num ; i++){
            for(int j = 1 ; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
