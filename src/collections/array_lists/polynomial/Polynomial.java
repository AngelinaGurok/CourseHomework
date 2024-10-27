package collections.array_lists.polynomial;

import collections.array_lists.NumbersList;

/**
 *
 * Рассчитать значение многочлена при заданном x:
 * p(x) = p0 + p1*x + p2*x^2 + p3*x^3 + ... + pN*x^N.
 * Коэффициенты многочлена заданы списком p: (p0, p1, p2, p3, ..., pN).
 * Значение пустого многочлена равно 0 при любом x.
 */


public class Polynomial extends NumbersList<Double> implements Printable, Accumulatable{
    double x;
    public Polynomial(Double[] polynom, double x){
        super(polynom);
        this.x = x;
    }
    private double countResult(){
        if(numbersList.isEmpty()){
            return 0;
        }
        double result = 0;
        for(int i = 0; i < this.numbersList.size(); i++){
            result += this.numbersList.get(i) * Math.pow(this.x, i);
        }
        return result;
    }

    public void showResult(){
        System.out.printf("p(x) = p0 + p1*x + p2*x^2 + p3*x^3 + ... + pN*x^N = %.2f\n", this.countResult());
    }
    /**
     * Средняя (3 балла)
     *
     * В заданном списке list каждый элемент, кроме первого, заменить
     * суммой данного элемента и всех предыдущих.
     * Например: 1, 2, 3, 4 -> 1, 3, 6, 10.
     * Пустой список не следует изменять. Вернуть изменённый список.
     *
     * Обратите внимание, что данная функция должна изменять содержание списка list, а не его копии.
     */
    @Override
    public void accumulate() {
        if(this.numbersList.isEmpty()){
            return;
        }
        else for(int i = 1; i < this.numbersList.size(); i++){
            double result = this.numbersList.get(i -1) + this.numbersList.get(i);
            this.numbersList.set(i, result);
        }
    }

    @Override
    public void print() {
        for(int i = 0; i < this.numbersList.size(); i++){
            System.out.println(this.numbersList.get(i));
        }

    }
}
