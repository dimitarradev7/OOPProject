package OOP_Inheritance.Shapes;

/**
 * Created by dimitarrad
 * on 1/4/2021
 */
public class Circle extends Shape {

    public  Circle(double radius){
        super(radius,radius);
    }

    @Override
    public void calculateSurface() {
        System.out.println("Circle area = "+Math.PI*Math.pow(height,2));
    }
}
