import java.util.Scanner;

/**
 * Created by USER on 21/09/2019.
 */
public class Pro_18 {
    public static void main(String[] args) {
        System.out.println("Please Enter 10 numbers;");
        Scanner sc = new Scanner(System.in);
        int []num = new int[10];
        for(int i = 0; i < 10 ; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("Enter a number to see if is in the array or not : ");
        int temp = sc.nextInt();
        for(int i = 0; i < 10 ; i++) {
            if (temp == num[i])
                System.out.println("The number" + temp + "is in array at num[" + i + "] position" );
        }
    }
}
