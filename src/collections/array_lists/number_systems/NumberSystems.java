package collections.array_lists.number_systems;

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
    HashMap<Character, Integer> systemDigits;

    public NumberSystems(String number, int base){
        this.number = new String(number);
        this.base = base;
        systemDigits = new HashMap<>();
        for(int i = 0; i < 10; i++){
            char key = (char) ('0'+ i);
            systemDigits.put(key, i);
        }
        if(base > 10){
            char key = 'a';
            for(int i = 10; i < base; i++){
                systemDigits.put(key, i);
                key++;
            }
        }
    }

    public int getBase() {
        return base;
    }

    public String getNumber() {
        return number;
    }

    ArrayList<Character> splitNumberToDigits(){
        ArrayList<Character> digits = new ArrayList<>();
        for(int i = this.number.length() - 1; i >= 0; i--){
            digits.add(this.number.charAt(i));
        }
        return digits;
    }

    public int toDecimal(){
        int result = 0;
        ArrayList<Character> numberDigits = splitNumberToDigits();
        for(int i = 0; i < numberDigits.size(); i++){
            char key = numberDigits.get(i);
            int value = this.systemDigits.get(key);
            result = (int) (result + value * Math.pow(this.base, i));
        }
        return result;
    }
}
