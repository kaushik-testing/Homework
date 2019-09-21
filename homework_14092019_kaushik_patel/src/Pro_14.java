/**
 * Created by USER on 20/09/2019.
 */
import java.util.*;
public class Pro_14 {
    public static void main(String[] args) {
        System.out.println("Please enter 10 numbers");
        Scanner sc = new Scanner(System.in);
        int num[] = new int[10];
        int min;
        for(int i =0 ; i< 10 ; i++){
            num[i] = sc.nextInt();

        }
        for(int i = 0; i<10 ; i++ ){
            for(int j = 0; j<=i ; j++){
                if(num[j] > num [i]) {
                    min = num[j];
                    num[j] = num[i];
                    num[i] = min;
                }
            }
        }
        for(int i = 0;i<10;i++)
            System.out.print(num[i] + " ");
    ////////////////////
    System.out.println("Please enter 10 name :");
    Scanner st = new Scanner(System.in);
    String str[] = new String[10];
    String temp;
        for(int i =0 ; i< 10 ; i++){
        str[i] = st.next();
        }
        for(int i = 0; i<10 ; i++ ){
        for(int j = 0; j<=i ; j++){
            if(str[j].compareTo(str[i]) > 0)  {
                temp = str[j];
                str[j] = str[i];
                str[i] = temp;
            }
        }
    }
        for(int i = 0;i<10;i++)
            System.out.print(str[i] + " ");
}
}



