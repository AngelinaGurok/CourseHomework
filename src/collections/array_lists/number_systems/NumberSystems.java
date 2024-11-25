package collections.array_lists.number_systems;
/**
 * Средняя (3 балла)
 *
 * Перевести число, представленное списком цифр digits от старшей к младшей,
 * из системы счисления с основанием base в десятичную.
 * Например: digits = (1, 3, 12), base = 14 -> 250
 */

import java.util.ArrayList;

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

    public NumberSystems(String number, int base){
        this.number = new String(number);
        this.base = base;
    }

    ArrayList<Character> splitNumberToDigits(){
        ArrayList<Character> digits = new ArrayList<>();
        for(int i = this.number.length() - 1; i >= 0; i--){
            digits.add(this.number.charAt(i));
        }
        return digits;
    }

}
