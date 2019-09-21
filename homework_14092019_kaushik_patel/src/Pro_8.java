import java.util.Scanner;

/**
 * Created by USER on 18/09/2019.
 */
public class Pro_8 {
    public static void main(String[] args) {
        System.out.println("please Enter Number of line for @ triangle : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1 ; i <= num ; i++){
            for(int j = 1 ; j <= i; j++){
                System.out.print("@");
            }
            System.out.println("");
        }
    }
}
