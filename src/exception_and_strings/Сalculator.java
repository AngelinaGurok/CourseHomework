package exception_and_strings;

//ДЗ:
//        /
//        * Сложная (6 баллов)
//        *
//        * Строка содержит названия товаров и цены на них в формате вида
//        * "Хлеб 39.9; Молоко 62; Курица 184.0; Конфеты 89.9".
//        * То есть, название товара отделено от цены пробелом,
//        * а цена отделена от названия следующего товара точкой с запятой и пробелом.
//        * Вернуть название самого дорогого товара в списке (в примере это Курица),
//        * или пустую строку при нарушении формата строки.
//        * Все цены должны быть больше нуля либо равны нулю.
//        * В случае неверной строки выкинуть свое исключение.
//        */
//
//        +
//
//        (Во второй задаче рекомендую попробовать написать регулярку)
//        /
//        * Сложная (6 баллов)
//        *
//        * В строке представлено выражение вида "2 + 31 - 40 + 13",
//        * использующее целые положительные числа, плюсы и минусы, разделённые пробелами.
//        * Наличие двух знаков подряд "13 + + 10" или двух чисел подряд "1 2" не допускается.
//        * Вернуть значение выражения (6 для примера).
//        * Про нарушении формата входной строки бросить исключение IllegalArgumentException
//        */

import java.util.Calendar;
import java.util.Scanner;

public class Сalculator {
    private String expression;
    private String regex;
    private int result;
    public Сalculator(){
        expression = "";
        result = 0;
        regex = "^(\\d+\\s{1}[+-]\\s{1})+\\d+$";
    }

    public void setExpression() {
        Scanner in = new Scanner(System.in);
        String temp = in.nextLine();
        do {
            try {
                boolean check = temp.matches(regex);
                if (check) {
                    this.expression = temp;
                    System.out.printf("Your expression is: %s", expression);
                    break;
                } else throw new WrongFormat("Wrong format of expression. Please, input new one.");
            } catch (WrongFormat ex) {
                ex.getMessage();
                temp = in.nextLine();
            }
        } while (true);
    }

    private String[] parser(){
        String[] buffer;
        buffer = expression.split(" ");
        return buffer;
    }

    public int getResult(){
        String[] exp = this.parser();
        Integer temp = Integer.parseInt(exp[0]);
        int i = 1;

        while(i < exp.length){
            switch(exp[i]){
                case "+":
                    temp += Integer.parseInt(exp[i + 1]);
                    break;
                case "-":
                    temp -= Integer.parseInt(exp[i + 1]);
                    break;
            }
            i += 2;
        }

        this.result = temp;
        System.out.printf("The result of the expression (%s) is %s", this.expression, this.result);
        return result;
    }
}
