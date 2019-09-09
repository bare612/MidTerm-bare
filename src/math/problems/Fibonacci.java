package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
         int prev = 1;
         int next = 13;
         for(int i=1;i<13;i++){
             System.out.println(prev);
             prev = prev + next;
             next = prev - next;
         }

    }
}
