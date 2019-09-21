import java.util.*;

/**
 * Created by USER on 20/09/2019.
 */
public class Pro_11 {
    public static int num;
    public static void main(String[] args) {
        System.out.println("Enter an integer number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("getEvenDigitSum(num) returns : " + getEvenDigitSum(num)) ;
    }
    public static int getEvenDigitSum(int temp){
        int repete = 0;
        if(temp < 0) return -1;
        else{
            while(temp>=1){
                if(temp%2 == 0)
                    repete = repete + (temp%10);
                temp = temp/10;
            }
            return repete;

        }
    }
}
