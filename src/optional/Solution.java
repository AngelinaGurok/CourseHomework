package optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        USB usb1 = new USB();
        USB usb2 = new USB();
        Scanner in = new Scanner(System.in);
        usb2.setVersion(in.nextLine());
        USB usb3 = new USB("Version 3.2");
        Soundcard sdc1 = new Soundcard();
        Soundcard sdc2 = new Soundcard(usb2);
        Soundcard sdc3 = new Soundcard(usb3);
        Optional<Computer> computer = Optional.of(new Computer(sdc1));

        String name = computer.flatMap(Computer::getSoundcard)
                .flatMap(Soundcard::getUSB)
                .map(USB::getVersion)
                .orElse("UNKNOWN");
        Optional<Soundcard> osdc2 = Optional.empty();
        osdc2.ifPresent(System.out::println);
        computer.flatMap(Computer::getSoundcard)
                .flatMap(Soundcard::getUSB)
                .map(USB::getVersion).ifPresent(System.out::println);
        //System.out.println(name);
    }
}
