import java.util.Scanner;

/**
 * Created by ${Kaushik} on 23/09/2019.
 * This is the programme to revers string
 */
public class ReversString {
    public static void main(String[] args) {
        String name1 , name2 = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name 1 to reverse it:");
        name1 = sc.next();
        //iteration and concating in revers order
        for(int i = 0 ; i < name1.length() ; i++)
           name2 = name1.charAt(i) + name2;
        System.out.println("Reverse of the string is : ");
        System.out.println(name2);
    }
}
