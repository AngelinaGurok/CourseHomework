package exception_and_strings;

public class WrongFormat extends Exception{

    String message;
    WrongFormat (String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        System.out.println(message);
        return message;
    }
}
