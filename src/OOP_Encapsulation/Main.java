package OOP_Encapsulation;

import OOP_Encapsulation.Buy.Person;
import OOP_Encapsulation.Buy.Product;

public class Main {
    public static void main(String[] args) {


        Person mitko = new Person("Mitko",100,3);
        Person ivan = new Person("Ivan",10,3);
        System.out.println("money : "+mitko.getMoney());

        Product milk = new Product("milk", 5.5);
        Product water = new Product("water", 1.5);
        Product burger = new Product("burger", 5);
        Product bigBurger = new Product("bigBurger", 6);
        Product smallBurger = new Product("smallBurger", 5);
        Product bread = new Product("bread", 5);



        mitko.buyProduct(milk);
        mitko.buyProduct(water);
        mitko.buyProduct(burger);

        ivan.buyProduct(milk);
        ivan.buyProduct(water);

        mitko.printAllProducts();
        ivan.printAllProducts();

        System.out.println("All product buyed: "+Product.printCount());
        System.out.println("All product created: "+Product.printCountPr());


    }
}
