/**
 * Created by ${Kaushik} on 23/09/2019.
 * Rhombus structure programme
 */
import java.util.*;
public class RhombusStructure {
    public static void main(String[] args) {
        System.out.println("Enter any letter up to you want to use in Rhombus Structure");
        Scanner sc = new Scanner(System.in);
        char line = sc.next().toUpperCase().charAt(0);
        for(int i = 'A'; i <= line; i++ ){
            for(int sp = 1 ; sp <= line-i ; sp++)
                System.out.print(" ");
            for(int j = 'A'; j < i ; j++)
                System.out.print((char)j);
            for(int k = i ; k >= 'A' ; k--)
                System.out.print((char)k);
               System.out.println(" ");
        }
        for(int i = line-1; i >= 'A'; i-- ){
            for(int sp = line-i ; sp >= 1 ; sp--)
                System.out.print(" ");
            for(int j = 'A'; j < i ; j++)
                System.out.print((char)j);
            for(int k = i  ; k >=  'A' ; k--)
                System.out.print((char)k);
            System.out.println(" ");
        }
    }
}
