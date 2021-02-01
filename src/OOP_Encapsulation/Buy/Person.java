package OOP_Encapsulation.Buy;

import OOP_Inheritance.Interfaces.Singable;

/**
 * Created by dimitarrad
 * on 1/6/2021
 */
public class Person implements Singable {
    Product[] products;
    private String name;
    private double money;

    public Person(String name, double money, int bagCapacity) {
        setName(name);
        setMoney(money);
        products = new Product[bagCapacity];
    }

    public String getName() {
        if (name == null)
        {
            System.out.println("not set variable");

        }else {
            return name;
        }
     return "";
    }

    public void setName(String name) {
        if ( name == null || name.isEmpty() ) {
            System.out.println("incorrect name");
        } else {
            this.name = name;
        }

    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        if (money>0){
            this.money = money;
        }

    }

     public void buyProduct(Product product){
        boolean added = false;
        if (product!=null && products!=null){
            if (getMoney()>product.cost){
                for (int i = 0; i < products.length; i++) {
                    if (products[i]==null){
                        products[i]=product;
                        added = true;
                        Product.increase();
                        break;
                    }

                }
                if (added){
                    System.out.println("added "+product.name);
                    setMoney(getMoney()-product.cost);
                }
                else {
                    System.out.println("basket is full");
                }
            }
            else {
                System.out.println("not enough money");
            }
        }
     }

     public  void  printAllProducts(){
         System.out.println("All product added for : "+ this.getName());
         for (int i = 0; i < products.length; i++) {
             if (products[i]!=null){
                 System.out.println(products[i].name);
             }
         }

     }

    @Override
    public void sing() {
        System.out.println("Person is singing");
    }
}
