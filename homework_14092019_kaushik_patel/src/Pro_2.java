/**
 * Created by USER on 17/09/2019.
 */
import java.util.*;
public class Pro_2 {
    public static int min;
    public static int max;
    public static int temp;
    public static int i = 1;
    public static void main(String[] args){
        while(true){
            System.out.println("Enter a valid integer number");
            Scanner sc = new Scanner(System.in);
            temp = sc.nextInt();
            if(hasNextInt(temp) == true && i <= 10){
                if (i ==1 ) {
                    min = temp;
                    max = temp;
                }
                else if (temp > max) max = temp;
                else if (temp < min)  min = temp;
                i++;
                continue;}
            else
                break;
        }
        System.out.println("Minimum Number : " + min);
        System.out.println("Maximum Number : " + max);
       }
    public static boolean hasNextInt(int a){
        if (a >= 0 && a <= 100)
            return true;
        else {
            System.out.println("Invalid Input");
            return false;}
    }
}
