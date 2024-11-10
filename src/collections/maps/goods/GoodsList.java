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

    public GoodsList(){
        goods = new HashMap<>();
    }

    public Map<String, GoodsFeatures> getGoods() {
        return goods;
    }

    public void fulfillGoodsInfo(String name, String category, double price){
        this.goods.put(name, new GoodsFeatures(category, price));
    }

    public static String findCheapest(Map<String, GoodsFeatures> goodsList, String category){
        Double minimalPrice = null;
        String minimalName = null;


        if(goodsList.containsValue(new GoodsFeatures(category)) == false){
            return minimalName;
        }

        for(Map.Entry<String, GoodsFeatures> goods: goodsList.entrySet()){
            if(goods.getValue().getCategory().equals(category)){
                if(minimalPrice == null || minimalPrice > goods.getValue().getPrice()){
                    minimalPrice = goods.getValue().getPrice();
                    minimalName = goods.getKey();
                }
            }
        }
        return  minimalName;
    }
}

