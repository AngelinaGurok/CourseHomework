package collections.maps.word;

import java.util.ArrayList;
import java.util.Map;

/**
 * Средняя (3 балла)
 *
 * Для заданного набора символов определить, можно ли составить из него
 * указанное слово (регистр символов игнорируется)
 *
 * Например:
 *   canBuildFrom(listOf('a', 'b', 'o'), "baobab") -> true
 */
public class Word {
    String word;

    public Word(String word) {
        this.word = word;
    }

    public boolean canBuildFrom(char [] letters){
        char[] wordChars = word.toCharArray();
        String strFromLetters = new String(letters);
        for(int i = 0; i < wordChars.length; i++){
            if(strFromLetters.indexOf(wordChars[i]) == -1){
                return false;
            }
        }
        return true;
    }
}
