/**
 * Created by USER on 16/09/2019.
 */

import java.util.*;

public class Pro_1 {
    public static int sum = 0;
    public static int[] num = new int[10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ten numbers between value 0 to 100 : ");
        for(int counter = 1; counter <= 10; counter++) {
            System.out.println("Enter Number " + counter + " : ");
            num[counter-1] = sc.nextInt() ;
            while(hasNextInt(num[counter-1]) == false) {
                System.out.println("Invalid Number, Enter number "+counter +" again : ");
                num[counter-1] = sc.nextInt() ;
            }
            sum = sum + num[counter-1];
        }
        System.out.println("Sum = " + sum);
        sc.close();
    }
    public static boolean hasNextInt(int a){
        if (a >= 0 && a <= 100)
            return true;
        else return false;
    }

}

/*
1. Read 10 numbers from the console entered by the user and print the sum of those numbers.
        -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
        -If hasNextInt() returns false, print the message Invalid Number•. Continue reading until you have read 10 numbers.
        -Use the nextInt() method to get the number and add it to the sum.
        -Before the user enters each number, print the message •Enter number #x:• where x represents the count, i.e. 1, 2, 3, 4, etc.
        -For example, the first message printed to the user would be •Enter number #1:•, the next •Enter number #2:, and so on.
        Hint:
        -Use a while loop.
        -Use a counter variable for counting valid numbers.
        -Close the scanner after you don't need it anymore.
        -Create a class with the name ReadingUserInputChallenge.
*/