package OOP_01;

import OOP_Inheritance.Interfaces.Singable;

/**
 * Created by dimitarrad
 * on 1/13/2021
 */
public class Radio implements Singable {
    @Override
    public void sing() {
        System.out.println("radio is singing");
    }
}
