package OOP_Inheritance.Zoo;


import OOP_Inheritance.Interfaces.Singable;

import javax.sound.midi.Soundbank;

/**
 * Created by dimitarrad
 * on 1/4/2021
 */
 public class Bird extends Animal {

    public double flyingSpeed;
    public String name;
    protected  String color;

      public Bird(double flyingSpeed){
        super(1);
        this.flyingSpeed = flyingSpeed;
        this.speed =3;
        this.isFemale = false;
    }

    public void getGeder(){
        System.out.println(this.isFemale);
    }


    @Override
    public void walk() {
          super.walk();
        System.out.println("walking like a bird");
    }

    public void sing() {
        System.out.println("Bird is Singing");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("make noise like a bird");
    }

    @Override
    public void move() {
        System.out.println(" bird move");

    }

    @Override
    public void fasterMove() {

    }


}
