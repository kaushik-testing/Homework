/**
 * Created by ${Kaushik} on 24/09/2019.
 * 14. Write a Java method to check whether a string is a valid password Password rules:
 * A password must have at least ten characters. A password consists of only letters and digits.
 * A password must contain at least two digits.
* Expected Output:
 *1. A password must have at least eight characters. 2. A password consists of only letters and digits.
 * 3. A password must contain at least two digits Input a password
 * (You are agreeing to the above Terms and Conditions.): abcd1234 Password is valid: abcd1234
 */
import java.util.*;
public class PasswordValidityCheck {
    public static void main(String[] args) {
        String password;
        System.out.println("Enter your Password : ");
        Scanner sc = new Scanner(System.in);
        password = sc.next();
        boolean b = isvalispassword(password);
        if(b == true)
            System.out.println("Its valid password");
        else {
            System.out.println("Invalid Password : It must meed below guide line");
            System.out.println("1. A password must have at least eight characters."+"\n" +
                    "2. A password consists of only letters and digits."+ "\n" +  "3. A password must contain at least two digits Input a password ");
        }
    }
    public static boolean isvalispassword( String password){
        if(password.length()>=8){
            int counter = 0;
            //checking for two digits
            for(int i=0;i<password.length();i++){
                if(Character.isDigit(password.charAt(i)) == true)    //inbuild Character and isDigit usage
                    counter++;
            }
            if(counter >=2){
                //checking for alpha numeric and not special character
                for(int j = 0 ; j > password.length() ; j++){
                    if((password.charAt(j) >= 'A' && password.charAt(j) <='Z') || (password.charAt(j) >= 'a' && password.charAt(j) <='z')
                            || (password.charAt(j) >= 0 && password.charAt(j) <= 9)){
                        return true;
                    }
                    else return false;
                }
            }
            else return false;
            return true;
        }
        else return false;
    }
}
