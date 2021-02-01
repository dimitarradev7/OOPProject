package OOP_Inheritance.Zoo;

import OOP_Inheritance.Interfaces.Introducable;
import OOP_Inheritance.Interfaces.Singable;

/**
 * Created by dimitarrad
 * on 1/4/2021
 */
public class Cat extends Animal implements Introducable, Singable {

    boolean isMale;
    public static String origin = "african";

    public Cat(boolean isMale){
        super(0);
        this.isMale = isMale;
    }

    public void climb(){
        System.out.println("Climbing");
    }



    @Override
    public void introduce() {
        System.out.println("I'm cat");
    }
    @Override
    public void makeSomeNoise() {
        System.out.println("mau mau");
    }

    @Override
    public void sing() {
        System.out.println("Cat is singing");
    }

    @Override
    public void move() {

        System.out.println("cat move");
    }

    @Override
    public void fasterMove() {

    }
}
