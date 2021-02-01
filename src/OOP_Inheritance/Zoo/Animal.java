package OOP_Inheritance.Zoo;

import OOP_Inheritance.Interfaces.Movable;

/**
 * Created by dimitarrad
 * on 1/4/2021
 */
public abstract class Animal implements Movable {
    public int age;
    public int weight;
    public double speed;
    public String name;
    protected boolean isFemale;

    public Animal(int age) {
        this.age = age;
        speed = 1.0;
        isFemale=true;
    }

   public void walk() {
        System.out.println("Walking");
    }

    void breathe() {
        System.out.println("Breathing");
    }
    public void growUp(double avrSpeed) {

        System.out.println(avrSpeed*speed);

    }

    public abstract void makeSomeNoise();


    


}
