/**
 * Created by ${Kaushik} on 23/09/2019.
 * Printing Numeric Rhombus Structure
 */
import java.util.*;
public class NumericRhombusStructure {
    public static void main(String[] args) {
        System.out.println("Enter number of max number to use for the structure");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 1; i <= num ; i++){
            for(int j = num-i ; j>=1 ; j--)
                System.out.print(" ");
            for(int k = i; k>1 ; k--)
                System.out.print(k);
            for(int l = 1; l<=i; l++)
                System.out.print(l);
            System.out.println("");
        }
        for(int i = 1; i < num ; i++){
            for(int j = 1 ; j<=i ; j++)
                System.out.print(" ");
            for(int k = num-i; k>1 ; k--)
                System.out.print(k);
            for(int l = 1; l<=num-i ; l++)
                System.out.print(l);
            System.out.println("");
        }
    }
}
