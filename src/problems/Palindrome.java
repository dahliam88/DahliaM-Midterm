package problems;
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        Palindrome st = new Palindrome();

        if(st.isPalindrome("MADAM")){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public boolean isPalindrome(String original){
        int i = original.length()-1;
        int j=0;
        while(i > j) {
            if(original.charAt(i) != original.charAt(j)) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
}
