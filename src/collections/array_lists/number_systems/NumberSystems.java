package collections.array_lists.number_systems;
/**
 * Средняя (3 балла)
 *
 * Перевести число, представленное списком цифр digits от старшей к младшей,
 * из системы счисления с основанием base в десятичную.
 * Например: digits = (1, 3, 12), base = 14 -> 250
 */

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Сложная (4 балла)
 *
 * Перевести число, представленное цифровой строкой str,
 * из системы счисления с основанием base в десятичную.
 * Цифры более 9 представляются латинскими строчными буквами:
 * 10 -> a, 11 -> b, 12 -> c и так далее.
 * Например: str = "13c", base = 14 -> 250
 *
 * Использовать функции стандартной библиотеки, напрямую и полностью решающие данную задачу
 * (например, str.toInt(base)), запрещается.
 */
public class NumberSystems {
    String number;
    int base;
    HashMap<Character, Integer> digits;

    public NumberSystems(String number, int base){
        this.number = new String(number);
        this.base = base;
        digits = new HashMap<>();
        for(int i = 0; i < 10; i++){
            char key = (char) ('0'+ i);
            digits.put(key, i);
        }
        if(base > 10){
            char key = 'a';
            for(int i = base - 10; i < base; i++){
                digits.put(key, i);
                key++;
            }
        }
    }

    ArrayList<Character> splitNumberToDigits(){
        ArrayList<Character> digits = new ArrayList<>();
        for(int i = this.number.length() - 1; i >= 0; i--){
            digits.add(this.number.charAt(i));
        }
        return digits;
    }


}
