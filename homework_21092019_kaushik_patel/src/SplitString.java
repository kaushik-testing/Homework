import java.util.Scanner;
/**
 * Created by ${Kaushik} on 23/09/2019.
 * Programme to splitting sentence / string and printing in revers order
 */
public class SplitString {
    public static void main(String[] args) {
        String name1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any sentence ");
        name1 = sc.nextLine();
        // splitting sentence where space appear and building string array
        String[] revers = name1.split("\\s");
        //printing string array in revers order
        for(int i = revers.length-1 ; i >=0 ; i--  ){
            System.out.print(revers[i]  + "\t");
        }
    }
}