package string.problems;

import java.util.Scanner;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word permutation");
        String word1 = sc.nextLine();
        int x = word1.length();
        Permutation per = new Permutation();
        per.calculatePermutation(word1, 0, x - 1);

    }

    public static void calculatePermutation(String word, int firstIndex, int lastIndex) {
        if (firstIndex == lastIndex)
            System.out.println(word);

        else {
            for (int i = firstIndex; i <= lastIndex; i++) {
            word = swapWord(word, firstIndex, i);
            calculatePermutation(word, firstIndex + 1, lastIndex);
        }

    }

}
  public static String swapWord( String str,int a, int b){
    char temp;
    char[] arr = str.toCharArray();
    temp =arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
    return String.valueOf(arr);
    }
}