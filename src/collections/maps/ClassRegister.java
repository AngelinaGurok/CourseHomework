package collections.maps;

import java.lang.foreign.StructLayout;
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
public class ClassRegister {
   HashMap<String, Integer> register;

   ClassRegister(){
       register = new HashMap<String, Integer>();
   }

   public void fulfillRegister(){
       String inputCheck = "y";
       Scanner in = new Scanner(System.in);
       String name;
       Integer mark;
       while(inputCheck == "y" || inputCheck == "Y"){
           System.out.print("\nInput name:");
           name = in.nextLine();
           System.out.print("\nInput mark: ");
           mark = in.nextInt();
           this.register.put(name, mark);
           System.out.print("Do you want to add one more record? y/n");
           inputCheck = in.nextLine();
       }
   }

}
