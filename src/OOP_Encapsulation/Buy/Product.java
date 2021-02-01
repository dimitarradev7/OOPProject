package OOP_Encapsulation.Buy;

/**
 * Created by dimitarrad
 * on 1/6/2021
 */
public class Product {
    private static int counter =0;
    private static int counterCrated =0;
    public String name;
    public double  cost;

    public Product(String name, double cost){
        this.cost = cost;
        this.name = name;
        counterCrated++;
    }

    public static void increase(){
        counter++;
    }

    public static int printCount(){
        return  counter;
    }

    public static int printCountPr(){
        return  counterCrated;
    }
}
