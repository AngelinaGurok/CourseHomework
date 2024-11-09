package collections.maps;

import collections.array_lists.StringsArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**

 * По заданному ассоциативному массиву "студент"-"оценка за экзамен" построить
 * обратный массив "оценка за экзамен"-"список студентов с этой оценкой".
 *
 * Например:
 *   buildGrades(mapOf("Марат" to 3, "Семён" to 5, "Михаил" to 5))
 *     -> mapOf(5 to listOf("Семён", "Михаил"), 3 to listOf("Марат"))
 */

/**
 *
 * Определить, входит ли ассоциативный массив a в ассоциативный массив b;
 * это выполняется, если все ключи из a содержатся в b с такими же значениями.
 *
 * Например:
 *   containsIn(mapOf("a" to "z"), mapOf("a" to "z", "b" to "sweet")) -> true
 *   containsIn(mapOf("a" to "z"), mapOf("a" to "zee", "b" to "sweet")) -> false
 */

/**
 * Простая (2 балла)
 *
 * Удалить из изменяемого ассоциативного массива все записи,
 * которые встречаются в заданном ассоциативном массиве.
 * Записи считать одинаковыми, если и ключи, и значения совпадают.
 *
 * ВАЖНО: необходимо изменить переданный в качестве аргумента
 *        изменяемый ассоциативный массив
 *
 * Например:
 *   subtractOf(a = mutableMapOf("a" to "z"), mapOf("a" to "z"))
 *     -> a changes to mutableMapOf() aka becomes empty
 */
public class ClassRegister implements Printable {
   Map<String, Integer> register;

   public ClassRegister(){
       register = new HashMap<>();
   }

   public void fulfillRegister(int amount){
       for(int i = 0; i < amount; i++){
           this.register.put(inputName(), inputMark());
       }
   }

   String inputName(){
       System.out.println("Input name: ");
       Scanner in = new Scanner(System.in);
       return in.nextLine();
   }

   Integer inputMark(){
       System.out.println("Input mark: ");
       Scanner in = new Scanner(System.in);
       return in.nextInt();
   }

    @Override
    public void print() {
       System.out.println("\nYour register contains:");
        for(Map.Entry<String, Integer> str: this.register.entrySet()){
            System.out.printf("\nName: %s Mark: %d", str.getKey(), str.getValue());
        }
    }

    public void removeRecords(ClassRegister otherMap){
        for(Map.Entry<String, Integer> str: otherMap.register.entrySet()){
            //V remove(Object k): удаляет объект с ключом k
            if(this.register.containsKey(str.getKey()) && this.register.get(str.getKey()) == str.getValue()){
                  this.register.remove(str.getKey());
            }
        }
    }

    public boolean containsMap(ClassRegister otherMap){
        return this.register.equals(otherMap.register);
    }


    public Map<Integer, String> reverseMap(){
       Map<Integer, String> reversedRegister = new HashMap<>();

       for(Map.Entry<String, Integer> str: this.register.entrySet()){

           Integer key = str.getValue();
           String names = "";
           names = names.concat(str.getKey());
           if(reversedRegister.containsKey(key)){
               names = String.join(";", names, reversedRegister.get(key));
           }
           reversedRegister.put(key, names);
       }
       return  reversedRegister;
    }

    public void printReversedMap(){
        Map<Integer, String> reversedRegister = new HashMap<>(this.reverseMap());
        for(Map.Entry<Integer, String> str: reversedRegister.entrySet()){
            System.out.printf("\n\nMark: %d Names: %s", str.getKey(), str.getValue());
        }
    }
}
