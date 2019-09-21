import java.util.Scanner;

/**
 * Created by USER on 18/09/2019.
 */
public class Pro_7 {
    public static int num;
    public static void main(String[] args) {
        System.out.println("Please Enter a number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("sumFirstAndLastDigit methode has return : " + sumFirstAndLastDigit(num));
    }
    public static int sumFirstAndLastDigit(int a) {
        if (a < 0)
            return -1;
        else {
            int lastd =0 , firstd = 0;
            lastd = a % 10;
            while (a >= 10) {
                a = a / 10;
            }
            firstd = a;
            return(firstd+lastd);
        }
    }
}