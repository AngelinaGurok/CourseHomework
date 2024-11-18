import collections.array_lists.polynomial.Polynomial;
import collections.array_lists.center.Center;
import collections.maps.ClassRegister;
import collections.maps.goods.GoodsFeatures;
import collections.maps.goods.GoodsList;
import collections.maps.phone_book.PhoneBook;
import collections.maps.repeats.Elements;
import collections.maps.word.Word;
import leetcode_35.Solution;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*ClassRegister register = new ClassRegister();
        ClassRegister otherRegister = new ClassRegister();
        register.fulfillRegister(4);
        otherRegister.fulfillRegister(2);
        register.print();
        otherRegister.print();
        *//*
        if(register.containsMap(otherRegister)){
            System.out.println("\nContains");
        } else System.out.println("\nDoesn't contain");*//*

        register.removeRecords(otherRegister);
        register.print();*/

        /*GoodsList goods = new GoodsList();
        goods.fulfillGoodsInfo("Oreo", "cookies", 20.00);
        goods.fulfillGoodsInfo("Maria", "cookies", 20.00);
        goods.fulfillGoodsInfo("Milk", "milk", 10.00);
        goods.fulfillGoodsInfo("Kefir", "milk", 15.00);
        goods.fulfillGoodsInfo("Tuk", "cookies", 20.50);
        String cheapestInCategory = GoodsList.findCheapest(goods.getGoods(), "meat");
        if(cheapestInCategory != null){
            System.out.printf("\nThe cheapest good in category is: %s\n", cheapestInCategory);
        } else System.out.println("There is no goods in such category");*/

        /*PhoneBook phoneBook = new PhoneBook();
        PhoneBook otherPhBook = new PhoneBook();
        phoneBook.addRecord("Ann", "1234");
        phoneBook.addRecord("Dick", "3421");
        phoneBook.addRecord("Nick", "1111");
        phoneBook.addRecord("Emergency", "911");
        System.out.println("\nThe first phone book");
        phoneBook.print();

        otherPhBook.addRecord("Ann", "1234");
        otherPhBook.addRecord("Dick", "5555");
        otherPhBook.addRecord("Emergency", "112");
        otherPhBook.addRecord("Mike", "4343");
        System.out.println("\n\nThe second phone book");
        otherPhBook.print();

        phoneBook.mergePhoneBooks(otherPhBook);
        System.out.println("\n\nMerged phone book");
        phoneBook.print();*/

        /*Word word = new Word("baobab");
        char[] letters = new char[] {'b', 'a', 'o', 't'};
        if(word.canBuildFrom(letters)){
            System.out.println("Can be build from those letters");
        } else System.out.println("Can't be build");*/

        Elements<Character> elements = new Elements<>();
        elements.addElement('a');
        elements.addElement('b');
        elements.addElement('a');
        elements.addElement('o');
        elements.addElement('t');
        elements.addElement('t');
        elements.addElement('a');
        elements.extractRepeats();

    }


}