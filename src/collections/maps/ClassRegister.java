package collections.maps;

import java.util.HashMap;
import java.util.Map;
/**

 * По заданному ассоциативному массиву "студент"-"оценка за экзамен" построить
 * обратный массив "оценка за экзамен"-"список студентов с этой оценкой".
 *
 * Например:
 *   buildGrades(mapOf("Марат" to 3, "Семён" to 5, "Михаил" to 5))
 *     -> mapOf(5 to listOf("Семён", "Михаил"), 3 to listOf("Марат"))
 */
abstract public class ClassRegister {
   String name;
   Integer mark;

   ClassRegister(){
      name = "Undefined";
      mark = 0;
   }

   ClassRegister(String name, Integer mark){
      this.name = name;
      this.mark = mark;
   }

   
}
