/**
 * Created by ${Kaushik} on 22/09/2019.
 * Programme for sorting list of numbers in Ascending
 */
import java.util.*;
public class AscendingSorting {
    public static void main(String[] args) {
        System.out.println("Please enter 10 numbers");
        Scanner sc = new Scanner(System.in);
        int num[] = new int[10];
        int min;
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
        }
        // comparing list of number by keeping outer i position with iterating inner loop position j value
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                if (num[j] > num[i]) {
                    min = num[j];
                    num[j] = num[i];
                    num[i] = min;
                }
            }
        }
        for (int i = 0; i < 10; i++)
            System.out.print(num[i] + " ");
    }
}
