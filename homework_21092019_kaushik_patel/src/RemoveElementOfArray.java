import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by ${Kaushik} on 23/09/2019.
 * This is programme to remove array value at specific place using Arraylist
 */
public class RemoveElementOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Arraylist declaration
        ArrayList<Integer> num = new ArrayList<>();

        //Inserting value in array list
        System.out.println("Enter 10 numbers");
        for(int i = 0 ; i < 10 ; i++){
            num.add(i,sc.nextInt());
        }
        System.out.println("Enter index number to remove value at that place : (0 - 9)");
        int ind = sc.nextInt();
        // removing values at that index from array
        num.remove(ind);
        System.out.println("Its look as below once it get remobed : ");
        // Printing arraya using ADVANCED FOR LOOP CALLED FOR EACH LOOP
        for(Integer temp : num){
            System.out.println(temp);
        }
    }
}
