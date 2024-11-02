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
       System.out.println("Your register contains:");
        for(Map.Entry<String, Integer> str: this.register.entrySet()){
            System.out.printf("\nName: %s Mark: %d", str.getKey(), str.getValue());
        }
    }


    public Map<Integer, ArrayList<String>> reverseMap(){
       Map<Integer, ArrayList<String>> reversedRegister = new HashMap<>();

       for(Map.Entry<String, Integer> str: this.register.entrySet()){

           Integer key = str.getValue();
           ArrayList<String> names;

           if(reversedRegister.containsKey(key)){
               names = new ArrayList<>(reversedRegister.get(key));
           } else {
               names = new ArrayList<>();
           }

           names.add(str.getKey());
           reversedRegister.put(key, names);
       }
       return  reversedRegister;
    }

    public void printReversedMap(){
        Map<Integer, ArrayList<String>> reversedRegister = new HashMap<>(this.reverseMap());
        for(Map.Entry<Integer, ArrayList<String>> str: reversedRegister.entrySet()){
            System.out.printf("\n\nMark: %d Names: %s", str.getKey(), StringsArray.arrayToString(str.getValue()));
        }
    }



}
