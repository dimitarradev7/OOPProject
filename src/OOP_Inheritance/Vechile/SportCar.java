package OOP_Inheritance.Vechile;

import java.util.Objects;

/**
 * Created by dimitarrad
 * on 1/4/2021
 */
public class SportCar extends Vechile {
   public boolean isCabriolet;
   public double price;
   public String model;

   public SportCar(){
       super();
   }

    void switchTurbo()
    {
        System.out.println("switchTurbo0000000000");
    }

    @Override
    public  void startEngine() {
        switchTurbo();
        super.startEngine();
    }

    @Override
    public String toString() {
        return "SportCar " + "model : "+ model+
                "  isCabriolet= " + isCabriolet +" Price="+price + "id NUM: = " + idNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null){
            return false;
        }
        SportCar sp = (SportCar) o;
        if (this.model.equals(sp.model) && this.idNumber == sp.idNumber && sp.price==this.price){
            return true;
        }
        else {
            return false;
        }


    }

}
