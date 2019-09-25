import java.util.Scanner;

/**
 * Created by ${Kaushik} on 22/09/2019.
 * This is Programme to compare two strings and finding matching character
 */
public class CompareString {
    public static void main(String[] args) {
        String name1;
        String name2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name 1 :");
        name1 = sc.next();
        System.out.println("Enter Name 2 :");
        name2 = sc.next();
    //  finding length od names to iterate loop
        int len1 = name1.length();
        int len2 = name2.length();
     // loop iteration and printing matching letters
        System.out.println("Matching letters from lists are : ");
        for(int i = 0;i<len1;i++){
            for(int j = 0;j<len2;j++){
                if(name1.charAt(i) == name2.charAt(j) ){
                    System.out.println(name1.charAt(i));
                }
            }
        }
    }
}
