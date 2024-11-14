package collections.maps.repeats;

import java.util.*;

import static java.util.Collections.sort;

/**
 * Средняя (4 балла)
 *
 * Найти в заданном списке повторяющиеся элементы и вернуть
 * ассоциативный массив с информацией о числе повторений
 * для каждого повторяющегося элемента.
 * Если элемент встречается только один раз, включать его в результат
 * не следует.
 *
 * Например:
 *   extractRepeats(listOf("a", "b", "a")) -> mapOf("a" to 2)
 */
public class Elements <T>  {
    List<T> list;

    Elements(){
        list = new ArrayList<>();
    }

    void fulfillList(T element){
        this.list.add(element);
    }

    
}
