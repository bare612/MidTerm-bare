package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        int counter;
        st = st.toLowerCase();
        String word [] = st.split(" ");
        System.out.println(" The duplicate word is");
        for(int i=0; i<word.length;i++){
            counter = 1;
            for(int j=i+1;j<word.length;j++){
                if (word[i].equals(word[j])) {
                    counter++;
                    word[j] = "0";

                }
            }
            if(counter >1 && word[i]!="0")
                System.out.println(word[i]);
        }
    }

}
