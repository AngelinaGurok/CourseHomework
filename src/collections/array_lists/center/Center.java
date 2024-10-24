package collections.array_lists.center;

import collections.array_lists.NumbersList;

import java.util.ArrayList;

/**
  * Центрировать заданный список list, уменьшив каждый элемент на среднее арифметическое всех элементов.
 * Если список пуст, не делать ничего. Вернуть изменённый список.
 *
 * Обратите внимание, что данная функция должна изменять содержание списка list, а не его копии.
 */
public class Center extends NumbersList<Integer> {

    public Center(Integer[] nums){
        super(nums);
    }

    private int calculateMean(){
        int sum = 0;
        for(int i = 0; i < numbersList.size(); i++){
            sum += numbersList.get(i);
        }
        return sum/numbersList.size();
    }

    private void centerList(){
        int mean = this.calculateMean();
        for(int i = 0; i < this.numbersList.size(); i++){
            this.numbersList.set(i, this.numbersList.get(i) - mean);
        }
    }

    public void showResult(){
        centerList();
        for(int i = 0; i < this.numbersList.size(); i++){
            System.out.println(this.numbersList.get(i));
        }
    }
}
