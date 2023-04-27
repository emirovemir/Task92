package T72new;


import java.text.ParseException;
import java.util.Date;


public class Main {
    public static void main(String[] args) throws ParseException {
        Shop shop = new Shop();
        shop.addProduct(new Phone("Samsung"));
        shop.addProduct(new Phone("Sony"));
        shop.addProduct(new Food("Milk", new Date(98, 1,11)));
        shop.addProduct(new Toy("Lego",12));
        shop.addProduct(new Phone("Apple"));
        shop.addProduct(new Toy("Plush Frog",13));
        shop.addProduct(new Food("Bread", new Date(99, 1,13)));

        System.out.println("\n");
        shop.findToys("12");

        System.out.println("\n");

        shop.findFood(new Date(99, 1,12));
        

        System.out.println("\n");

        shop.deleteProduct("Lego");

        System.out.println("\n");

        shop.size();
        for (int i = 0; i < shop.listPro.size();i++){
            System.out.println( i +" "+shop.listPro.get(i));
        }

    }

}
