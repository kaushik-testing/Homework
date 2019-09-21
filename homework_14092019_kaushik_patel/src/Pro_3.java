/**
 * Created by USER on 18/09/2019.
 */

import java.util.*;

public class Pro_3 {
    public static void main(String[] args) {
        char input;
        String st;
        Scanner sc = new Scanner(System.in);
        st = sc.next();
        input = st.charAt(0);
        validity(st, input);
    }

    public static void validity(String st, char input) {
        if (st.length() > 1 || ((input < 'a' || input > 'z') && (input < 'A' || input > 'Z')))
            System.out.println("Invalid Input");
        else if (input == 'a' || input == 'A' || input == 'e' || input == 'E' || input == 'o' || input == 'O'
                || input == 'u' || input == 'U' || input == 'i' || input == 'I')
            System.out.println("It is Volwel");
        else System.out.println("It is Consonant");

    }
}
