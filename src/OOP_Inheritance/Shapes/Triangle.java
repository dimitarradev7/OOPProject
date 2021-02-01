package OOP_Inheritance.Shapes;

/**
 * Created by dimitarrad
 * on 1/4/2021
 */
public class Triangle extends Shape {

    public Triangle(double height,double width){
        super(height,width);
    }
    @Override
    public void calculateSurface() {
        System.out.println("Triangle area = "+height*width/2);

    }
}
