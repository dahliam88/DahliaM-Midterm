package math;

public class Fibonacci {
    public static void main(String[] args) {
        /*
          Write 40 Fibonacci numbers with java.
         */
        int prev = 1;
        int next = 2;

        for (int i=1; i<41; i++){
            System.out.println(prev);
            prev = prev + next;
            next = prev - next;
            }
        }
    }