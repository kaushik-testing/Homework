import java.util.Scanner;

/**
 * Created by USER on 21/09/2019.
 */
public class Pro_17 {
    public static void main(String[] args) {
        System.out.println("Please Enter 10 numbers;");
        Scanner sc = new Scanner(System.in);
        int []num = new int[10];
        int  sum = 0;
        float avg = 0.0f;
        for(int i = 0; i < 10 ; i++) {
            num[i] = sc.nextInt();
            sum = sum + num[i];
        }
        avg = (float)sum / 10f;
        System.out.println("sum of the 10 numbers = " + sum);
        System.out.println("Average ot the 10 numbers = " + avg);
    }
}
