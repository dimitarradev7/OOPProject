package OOP_Inheritance.Zoo;

import OOP_Inheritance.Interfaces.Introducable;
import OOP_Inheritance.Interfaces.Movable;

/**
 * Created by dimitarrad
 * on 1/4/2021
 */
public class Dog extends Animal implements Introducable {
    boolean isDangeroius;
    public final String SOUND ;

    public Dog(){
        super(0);
        SOUND = "bau bau";
        isFemale = true;

        name="";
    }

    void bringSticks()
    {
        System.out.println("Playing");
    }

    @Override
    public void move() {
        System.out.println("dog is moving");
    }

    @Override
    public void fasterMove() {

    }

    @Override
    public void introduce() {

    }

    @Override
    public void makeSomeNoise() {
        System.out.println("make noise like s dog");
    }

    @Override
    public void walk() {
        System.out.println("walk like a dog");
    }
}
