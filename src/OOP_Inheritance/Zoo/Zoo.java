package OOP_Inheritance.Zoo;

import java.util.Arrays;

/**
 * Created by dimitarrad
 * on 1/11/2021
 */
public class Zoo {
    private Animal[] animals;

    public Zoo(int arrayLength){
        this.animals= new Animal[arrayLength];
    }

    public void addAnimal(Animal animal){
        if (animal!=null)
        {
            for (int i = 0; i <this.animals.length; i++) {
                if (animals[i]==null){
                    animals[i]= animal;
                   break;
                }
            }

        }
    }
    public void printAnimal(Animal a){
        System.out.println(a.getClass().getSimpleName());
    }

    public Animal[] getAnimals(){
        return animals;
    }

    @Override
    public String toString() {
        return "It's Zoo";
    }
}
