import java.util.Random;

/**
 * Created by ${Kaushik} on 26/09/2019.
 * generate Random Number
 */
public class RandomNumber {
    public static void main(String[] args) {

        //using Math class double type random number
        System.out.println("double random number : " + Math.random());

        // using Random and object
        Random r = new Random();
        System.out.println("Any random number : ");
        System.out.println(r.nextInt());
        System.out.println("Random number in range 0 to 1000");
        System.out.println(r.nextInt(1000));
    }
}
