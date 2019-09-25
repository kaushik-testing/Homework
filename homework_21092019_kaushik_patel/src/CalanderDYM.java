/**
 * Created by ${Kaushik} on 26/09/2019.
 * changing date formate and printing current date
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class CalanderDYM {
    public static void main(String[] args) {
        //inbuild date class object
        Date dt = new Date();
        System.out.println(dt);
        // date formate
        DateFormat dtf = new SimpleDateFormat("dd/mm/yyyy");
        System.out.println(dtf.format(dt));
    }
}
