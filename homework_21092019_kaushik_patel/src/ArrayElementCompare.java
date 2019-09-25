/**
 * Created by ${Kaushik} on 22/09/2019.
 * Find Two Array matching elements
 */
import java.util.*;
public class ArrayElementCompare {
    public static void main(String[] args) {
        int[] list1 = new int[5];
        int[] list2 = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter list1's 5 number :");
        for(int i = 0 ; i < 5 ; i++){
            list1[i] = sc.nextInt();
        }
        System.out.println("Enter list2's 5 number :");
        for(int j = 0 ; j < 5 ; j++){
            list2[j] = sc.nextInt();
        }

        //comparing list1's each value with list2's each value using iteration
        System.out.println("Matching Values in list1 are : ");
        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0; j < 5 ; j++){
                if(list1[i] == list2[j])
                    System.out.println(list1[i]);
            }
        }



    }
}
