package lessons.lesson10;

import java.util.Collection;
import java.util.HashSet;


import static lesson7.StringUtils.*;

public class Collections {


    HashSet getPalindroms(Collection<String> words) {
        HashSet<String> hashSetGetPalindroms = new HashSet<>();
        for (String s : words) {
            if (isPalindrome(s)) {
                hashSetGetPalindroms.add(s);
            }
        }
        return  hashSetGetPalindroms;
    }
}
