package collections.maps.goods;


import java.util.Objects;

public class GoodsFeatures {
    String category;
    double price;

    GoodsFeatures(String category, double price){
        this.category = category;
        this.price = price;
    }

    double getPrice(){
        return price;
    }

    String getCategory(){
        return category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GoodsFeatures that = (GoodsFeatures) o;
        return Double.compare(that.price, price) == 0 && Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, price);
    }
}
