package stream_api;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamHometask {
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>(5);
        phones.add(new Phone("Samsung 10", 55.4));
        phones.add(new Phone("Pixel 10", 155.4));
        phones.add(new Phone("Xiaomi 10", 20.4));
        phones.add(new Phone("iPhone 16", 145.4));
        phones.add(new Phone("Samsung 9", 45.4));
        phones.stream()
                .filter(ph -> ph.getPrice() > 30)
                .sorted((o1, o2) -> o1.getPrice().compareTo(o2.getPrice()))
                .forEach(System.out::println);
    }
}
