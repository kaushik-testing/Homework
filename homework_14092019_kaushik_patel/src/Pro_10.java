import java.util.Scanner;

/**
 * Created by USER on 19/09/2019.
 */
public class Pro_10 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
        int a = num;
        int temp = 0;
        while (a >= 1) {
            temp = temp + ((a%10)*(a%10)*(a%10));
            a = a / 10;
        }
        if(temp == num)
            System.out.println("It is an Armstrong number");
        else
            System.out.println("It is NOT an Armstrong number");
    }
}
