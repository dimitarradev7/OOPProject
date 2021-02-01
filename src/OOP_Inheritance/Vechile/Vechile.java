package OOP_Inheritance.Vechile;

import OOP_01.Person;

/**
 * Created by dimitarrad
 * on 1/4/2021
 */
public class Vechile {
   public String model;
   public double maxSpeed;
   public double currentSpeed;
   public int idNumber;
   public boolean isSportCar;
   public Person owner;

    void changeOwener(Person owner) {
        this.owner = owner;
    }

   public void startEngine(){
        System.out.println("starting...");
    }

    void accelerate (double speed){

        if ( this.currentSpeed+speed<=maxSpeed) {
            this.currentSpeed += speed;
        }
        else{
            System.out.println("reached max speed");
        }
    }

}
