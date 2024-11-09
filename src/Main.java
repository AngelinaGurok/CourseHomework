import collections.array_lists.polynomial.Polynomial;
import collections.array_lists.center.Center;
import collections.maps.ClassRegister;
import collections.maps.goods.GoodsFeatures;
import collections.maps.goods.GoodsList;
import leetcode_35.Solution;

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

        GoodsList goods = new GoodsList();
        goods.fulfillGoodsInfo("Oreo", "cookies", 20.00);
        goods.fulfillGoodsInfo("Maria", "cookies", 20.00);
        goods.fulfillGoodsInfo("Milk", "milk", 10.00);
        goods.fulfillGoodsInfo("Kefir", "milk", 15.00);
        goods.fulfillGoodsInfo("Tuk", "cookies", 20.50);
        String cheapestInCategory = GoodsList.findCheapest(goods.getGoods(), "meat");
        if(cheapestInCategory != null){
            System.out.printf("\nThe cheapest good in category is: %s\n", cheapestInCategory);
        } else System.out.println("There is no goods in such category");
    }
}