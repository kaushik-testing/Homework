import java.util.Scanner;

/**
 * Created by USER on 21/09/2019.
 */
public class Pro_20 {
    public static void main(String[] args) {
        System.out.println("Enter number of line for dimond :");
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();

        for (int i = 1; i <= line; i++) {
            for (int j = line - i; j >= 1; j--)
                System.out.print(" ");
            for(int k = 1; k<=i ; k++)
                System.out.print("* ");
            System.out.println("");
        }

    }
}