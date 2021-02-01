package OOP_Inheritance.Shapes;

/**
 * Created by dimitarrad
 * on 1/4/2021
 */
public class Rectangle extends Shape {

    public Rectangle(double height,double width){
        super(height,width);
    }

    @Override
    public void calculateSurface() {
        System.out.println("Rectangle area = "+height*width);
    }
}
