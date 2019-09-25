import java.util.Scanner;

/**
 * Created by ${Kaushik} on 23/09/2019.
 * Addition of two Array Matrices
 */
public class AddMatric {
    public static void main(String[] args) {
        int[] list1 = new int[5];
        int[] list2 = new int[5];
        int[] list3 = new int[5];
        Scanner sc = new Scanner(System.in);
        //iteratining and entering array value
        System.out.println("Enter list1's 5 number :");
        for(int i = 0 ; i < 5 ; i++){
            list1[i] = sc.nextInt();
        }
        //iteratining and entering array value
        System.out.println("Enter list2's 5 number :");
        for(int j = 0 ; j < 5 ; j++){
            list2[j] = sc.nextInt();
        }
        // Iteration of arraya, summing it up index by index and printing at same time
        for(int k = 0 ; k < 5 ; k++){
            list3[k] = list1[k] + list2[k];
            System.out.println("Addition of " + " List1[" + k + "]" + " And " + " List2[" + k + "] = " + list3[k]);
        }
    }
}
