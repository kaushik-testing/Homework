import java.util.ArrayList;
import java.util.*;
/**
 * Created by ${Kaushik} on 25/09/2019.
 * This is the programme to practice emptying array list
 */
public class EmptyArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();

        num.add(00);
        num.add(11);
        num.add(22);
        num.add(33);
        num.add(44);

        for(int i = 0 ; i < 5 ; i++){
            System.out.println(num.get(i));
        }
        System.out.println("After removing Array list");
        for(int i = 4 ; i >= 0 ; i--){
            num.remove(i);
        }
        //removing array list from higher index to lower using advanced for loop called for each loop
        for (Integer n : num )
            System.out.println(n);

    }
}
