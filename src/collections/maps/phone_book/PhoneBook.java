package collections.maps.phone_book;

import collections.maps.Printable;

import java.util.HashMap;
import java.util.Map;
/**
 * Средняя (3 балла)
 *
 * Объединить два ассоциативных массива `mapA` и `mapB` с парами
 * "имя"-"номер телефона" в итоговый ассоциативный массив, склеивая
 * значения для повторяющихся ключей через запятую.
 * В случае повторяющихся *ключей* значение из mapA должно быть
 * перед значением из mapB.
 *
 * Повторяющиеся *значения* следует добавлять только один раз.
 *
 * Например:
 *   mergePhoneBooks(
 *     mapOf("Emergency" to "112", "Police" to "02"),
 *     mapOf("Emergency" to "911", "Police" to "02")
 *   ) -> mapOf("Emergency" to "112, 911", "Police" to "02")
 */

public class PhoneBook implements Printable {
    private Map<String, String> phoneBook;
    public PhoneBook(){
        phoneBook = new HashMap<>();
    }

    public void addRecord(String name, String number){
        this.phoneBook.put(name, number);
    }

    public Map<String, String> getPhoneBook(){
        return this.phoneBook;
    }
    public void mergePhoneBooks(PhoneBook otherPhoneBook){
        String key = null;
        String value = null;
        String newValue = null;
        for(Map.Entry<String, String> other: otherPhoneBook.getPhoneBook().entrySet()){
            key = other.getKey();
            value = other.getValue();
            if(this.phoneBook.containsKey(key) && !this.phoneBook.get(key).equals(value)){
                //newValue = this.phoneBook.get(key);

                this.phoneBook.put(key, String.join(", ", this.phoneBook.get(key), value));
            }
            else this.phoneBook.put(key, value);
        }
    }

    @Override
    public void print() {
       for(Map.Entry<String, String> phoneBook: this.phoneBook.entrySet()){
           System.out.printf("\nName: %s || Numbers: %s", phoneBook.getKey(), phoneBook.getValue());
       }
    }
}
