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
    char[] letters;

    Word(String word){
        this.word = word;
        int start = 0;
        int end = word.length();
        letters = new char[end - start];
        word.getChars(start, end, letters, 0);
    }

    void deleteRepeatedChars(){
        
    }

    boolean canBuildFrom()
}
