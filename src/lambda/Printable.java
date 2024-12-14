package lambda;

interface Printtable{
    void print(String s);
}
public class Printable {
    public static void main(String[] args) {

        Printtable printer = s->System.out.println(s);
        printer.print("Hello Java!");
    }
}
