package stream_api;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamHometask {
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>(5);
        phones.add(new Phone("Samsung 10", 55.4, new Date(12, 12,2024)));
        phones.add(new Phone("Pixel 10", 55.4, new Date(12, 12,2023)));
        phones.add(new Phone("Xiaomi 10", 20.4, new Date(12, 10,2023)));
        phones.add(new Phone("iPhone 16", 145.4, new Date(29, 12,2024)));
        phones.add(new Phone("Samsung 9", 45.4, new Date(31, 12,2024)));

        phones.stream()
                .filter(ph -> ph.getPrice() > 30)
                .sorted(new PhonePriceComparator().thenComparing(new PhoneDateComparator()))
                .forEach(System.out::println);
    }
}
