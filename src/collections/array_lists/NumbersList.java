package collections.array_lists;

import java.util.ArrayList;

public abstract class NumbersList<T extends  Number> {
    protected ArrayList<T> numbersList;
    public NumbersList(T[] numbers){
        this.numbersList = new ArrayList<T>();
        for(int i = 0; i < numbers.length; i++){
            this.numbersList.add(numbers[i]);
        }
    }
    public abstract void showResult();
}
