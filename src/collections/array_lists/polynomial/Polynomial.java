package collections.array_lists.polynomial;

import collections.array_lists.NumbersList;

/**
 *
 * Рассчитать значение многочлена при заданном x:
 * p(x) = p0 + p1*x + p2*x^2 + p3*x^3 + ... + pN*x^N.
 * Коэффициенты многочлена заданы списком p: (p0, p1, p2, p3, ..., pN).
 * Значение пустого многочлена равно 0 при любом x.
 */
public class Polynomial extends NumbersList<Double> {
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
        System.out.printf("p(x) = p0 + p1*x + p2*x^2 + p3*x^3 + ... + pN*x^N = %.2f", this.countResult());
    }

}
