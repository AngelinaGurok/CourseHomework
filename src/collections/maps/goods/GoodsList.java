package collections.maps.goods;
import java.util.HashMap;
import java.util.Map;
/**
 * Средняя (4 балла)
 *
 * Входными данными является ассоциативный массив
 * "название товара"-"пара (тип товара, цена товара)"
 * и тип интересующего нас товара.
 * Необходимо вернуть название товара заданного типа с минимальной стоимостью
 * или null в случае, если товаров такого типа нет.
 *
 * Например:
 *   findCheapestStuff(
 *     mapOf("Мария" to ("печенье" to 20.0), "Орео" to ("печенье" to 100.0)),
 *     "печенье"
 *   ) -> "Мария"
 */

public class GoodsList {
    Map<String, GoodsFeatures> goods;

    void fulfillGoodsInfo(String name, String category, double price){
        this.goods.put(name, new GoodsFeatures(category, price));
    }

    static String findCheapest(Map<String, GoodsFeatures> goodsList, String category){
        double minimalPrice;
        String name = null;
        //boolean containsValue(Object v)

        if(goodsList.containsValue())
        for(Map.Entry<String, GoodsFeatures> goods: goodsList.entrySet()){

        }
    }
}
