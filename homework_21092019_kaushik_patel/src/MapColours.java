import java.util.Map;
import java.util.HashMap;
import java.util.*;

/**
 * Created by ${Kaushik} on 25/09/2019.
 * Write a Java program to create a new array list, add some colours (string) and printout the collection.
 */

public class MapColours {
    public static void main(String[] args) {
        Map<Integer,String> colourmap = new HashMap<>();
        //assigning mapping using put
        colourmap.put(1,"Red");
        colourmap.put(2,"Blue");
        colourmap.put(3,"Green");
        colourmap.put(4,"Purple");
        colourmap.put(5,"White");
        // Printing mapping value using get
        for(int j = 1 ;j <= 5; j++){
            System.out.println(colourmap.get(j));
        }
    }
}
