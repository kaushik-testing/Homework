/**
 * Created by ${Kaushik} on 22/09/2019.
 * Programme to revers the given number
 */
import java.util.*;
public class ReversNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number to find Revers of it : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int revers = 0;
        //iterating and removing last digit for rversing
        while(num>=1){
            revers = (revers * 10) + (num % 10 ); //last digit removing and multiplying to rebuild revers number
            num = num / 10;  // removing last digit
        }
        System.out.println("Revers number is : " + revers) ;
    }
}

