import java.util.Scanner;

/**
 * Created by USER on 18/09/2019. Fibonacci
 */
public class Pro_9 {
    public static void main(String[] args) {
        System.out.println("please Enter how many number do you want from Fibonacci series : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pre2 = 0;
        int pre1 = 1;
        int ser = 0;
        for(int i = 1 ; i<=num ; i++){
            if(i == 1)
                System.out.print( " " + pre2 + " ");
            else if(i == 2)
                System.out.print( " " + pre1 + " ");
            else{
                ser = pre2 + pre1;
                System.out.print( " " + ser + " " );
                pre2 = pre1;
                pre1 = ser;
            }
        }
    }
}
