package collections.array_lists;

import java.util.ArrayList;

public class StringsArray {
    static public String arrayToString(ArrayList<String> names){
        String str = "";
        for (String name : names) {
            str = String.join(";", str, name);
        }
        return str;
    }
}
