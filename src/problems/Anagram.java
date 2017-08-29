package problems;
import java.util.*;
/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";

        int sizeS1[] = new int[Character.MAX_VALUE];
        int sizeS2[] = new int[Character.MAX_VALUE];
        if (s1.length() != s2.length())
            System.out.print("No");
        else {

            for (int i = 0; i < s1.length(); ++i) {
                sizeS1[s1.toLowerCase().charAt(i)]++;
                sizeS2[s2.toLowerCase().charAt(i)]++;
            }

            boolean anag = true;

            for (int i = 0; i < sizeS1.length && anag; ++i) {
                if (sizeS1[i] != sizeS2[i]) {
                    anag = false;
                }
            }
            if (anag) {
                System.out.print("Anagram");
            } else {
                System.out.print("No anagram");
            }
        }
    }
}
