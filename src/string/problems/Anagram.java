package string.problems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter you first single anagram  word");
        String firstWord = sc.nextLine();

        System.out.println("please enter your second single anagram  word");
        String secondWord = sc.nextLine();

        checkAnagram(firstWord, secondWord);
    }
    // implement to check two strings anagram status
    public static void checkAnagram(String st1,String sr2 ) {
        if (st1.length()==sr2.length()){
            char[] x = st1.toCharArray();
            Arrays.sort(x);
            System.out.println(Arrays.toString(x));
            char [] a =sr2.toCharArray();
            Arrays.sort(a);
            System.out.println(Arrays.equals(x,a));
            System.out.println(Arrays.equals(x,a ));
            if(x.equals(a)){
                System.out.println("the two strings are anagrams");


            }else {
                System.out.println("The two Strings are not anagrams");
            }
        }
    }

}
