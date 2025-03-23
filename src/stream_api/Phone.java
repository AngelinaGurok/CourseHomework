package stream_api;

import java.util.Comparator;

public class Phone {
    String name;
    double price;

    Date date;


    public Phone(String name, double price, Date date){
        this.name = name;
        this.price = price;
        this.date = new Date(date.day, date.month, date.year);
    }

    public Double getPrice() {
        return price;
    }

    public String getDate() {
        return date.toString();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Phone:" +
                " " + name +
                " price: " + price +
                " " + date.toString();
    }
}

class PhonePriceComparator implements Comparator<Phone>{
    public int compare(Phone phone, Phone otherPhone){
        return phone.getPrice().compareTo(otherPhone.getPrice());
    }
}

class PhoneDateComparator implements Comparator<Phone>{
    @Override
    public int compare(Phone phone, Phone otherPhone) {
        return otherPhone.getDate().compareTo(phone.getDate());
    }
}