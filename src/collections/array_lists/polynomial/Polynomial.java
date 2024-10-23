package collections.array_lists.polynomial;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * Рассчитать значение многочлена при заданном x:
 * p(x) = p0 + p1*x + p2*x^2 + p3*x^3 + ... + pN*x^N.
 * Коэффициенты многочлена заданы списком p: (p0, p1, p2, p3, ..., pN).
 * Значение пустого многочлена равно 0 при любом x.
 */
public class Polynomial {
    double x;
    ArrayList<Double> polynom;
    public Polynomial(double x, double[] polynom){
        this.x = x;
        this.polynom = new ArrayList<Double>();
        for(int i = 0; i < polynom.length; i++){
            this.polynom.add(polynom[i]);
        }
    }
    private double countResult(){
        if(this.polynom.isEmpty()){
            return 0;
        }
        double result = 0;
        for(int i = 0; i < this.polynom.size(); i++){
            result += this.polynom.get(i) * Math.pow(this.x, i);
        }
        return result;
    }

    public void showResult(){
        System.out.printf("p(x) = p0 + p1*x + p2*x^2 + p3*x^3 + ... + pN*x^N = %.2f", this.countResult());
    }

}
