import java.util.Scanner;

/**
 * Created by ${Kaushik} on 24/09/2019.
 * Revers Array of integer
 */
public class ReversArrayOfInteger {
    public static void main(String[] args) {
        int[] list1 = new int[5];
        int[] list2 = new int[5];
        Scanner sc = new Scanner(System.in);
        //iteratining and entering array value
        System.out.println("Enter list1's 5 number :");
        int j = 4;
        for(int i = 0;i< 5;i++){
            list1[i] = sc.nextInt();
            list2[j] = list1[i];
            j--;
        }
        System.out.println("Revers of the list looks as below");
        for (int i = 0; i < 5; i++)
            System.out.println(list2[i]);
    }
}