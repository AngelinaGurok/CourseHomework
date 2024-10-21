package collections.center;

import java.util.ArrayList;

/**
  * Центрировать заданный список list, уменьшив каждый элемент на среднее арифметическое всех элементов.
 * Если список пуст, не делать ничего. Вернуть изменённый список.
 *
 * Обратите внимание, что данная функция должна изменять содержание списка list, а не его копии.
 */
public class Center {
    ArrayList<Integer> list;

    public Center(){
        list = new ArrayList<Integer>();
    }
    public Center(int[] nums){
        list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            list.add(nums[i]);
        }
    }

    private int calculateMean(){
        int sum = 0;
        for(int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        return sum/list.size();
    }

    private void centerList(){
        int mean = this.calculateMean();
        for(int i = 0; i < this.list.size(); i++){
            this.list.set(i, this.list.get(i) - mean);
        }
    }

    public void outputCenterList(){
        centerList();
        for(int i = 0; i < this.list.size(); i++){
            System.out.println(this.list.get(i));
        }
    }
}
