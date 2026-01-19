package desafios;

import java.util.HashSet;
import java.util.Set;

//COMMIT 17/01
public class KataPangramChecker {
    public static boolean check(String sentence){
        Set<Integer> alphabet = new HashSet<>();

        for(int i = 0; i < sentence.length(); i++){
            int chAscii = (int) Character.toLowerCase(sentence.charAt(i)) - 96;

            if(chAscii < 1 || chAscii > 26) continue;

            alphabet.add(chAscii);
        }

        return alphabet.size() == 26;
    }
}
