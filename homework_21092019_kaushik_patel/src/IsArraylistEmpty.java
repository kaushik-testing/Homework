import java.util.ArrayList;

/**
 * Created by ${Kaushik} on 26/09/2019.
 */
public class IsArraylistEmpty {
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
        System.out.println("size of the array list before removing : " + num.size());
        System.out.println("\n" + "Removing the array listemoving Array list");
        for(int i = 4 ; i >= 0 ; i--){
            num.remove(i);
        }
        //removing array list from higher index to lower using advanced for loop called for each loop
        for (Integer n : num )
            System.out.println(n);
        System.out.println("\n"+"size of the array list after removing : " + num.size());

    }
}
