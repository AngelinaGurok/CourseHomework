package collections.maps.repeats;

import collections.maps.Printable;

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
public class Elements<T> {
    ArrayList<T> elements;

    public Elements(){
        elements = new ArrayList<>();
    }

    public void addElement(T element){
        elements.add(element);
    }

    public Map<T, Integer> extractRepeats(){
        Map<T, Integer> repeats = new HashMap<>();
        for(int i = 0; i < elements.size(); i++){
            T key = elements.get(i);
            int value = 1;
            if(repeats.containsKey(key)){
                value += repeats.get(key);
            }
            repeats.put(key, value);
        }

        // Пройдясь по "площади" HashMap, не забывайте о корректном удалении элементов!
        Iterator<Map.Entry<T, Integer>> it = repeats.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<T, Integer> entry = it.next();
            // Внимательность при удалении избавит вас от головной боли в процессе отладки!
            if (entry.getValue() == 1) it.remove();
        }
        

        for(Map.Entry<T, Integer> rep: repeats.entrySet()){
            System.out.printf("\nElement %s repeats %d times", rep.getKey().toString(), rep.getValue());
        }
        return repeats;
    }
}
