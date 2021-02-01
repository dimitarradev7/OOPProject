package OOP_Inheritance.Zoo;

/**
 * Created by dimitarrad
 * on 1/4/2021
 */
public class Lion extends Cat{
   public String color;
    private double maxSpeed;
    public int[] names ;
    public static String pride = "African";


    public Lion(){
        this("red",6,12);

    }

    public Lion(String cl, int age, int weight){
        super(true);

        this.color = cl;
        this.age = age;
        this.weight = weight;
        this.setMaxSpeed(age);
    }

    public double getMaxSpeed(){
        return maxSpeed;
    }

    public void printNames(int index){
        if (this.names ==null)
        {
            System.out.println("array is null");
        }else if(this.names.length<index) {
            System.out.println("array length wrong");
        }
        else{
            System.out.println( this.names[index]);
        }


    }

    public void setMaxSpeed(double maxSpeed){
        if (maxSpeed>0&&maxSpeed<100){
            this.maxSpeed= maxSpeed;
        }else {
            System.out.println("Invalid max Speed");
        }
    }

    private void movePaw(String s)
    {
        System.out.println("Moving "+s);
    }

    public void move(){
        movePaw(" front left");
        movePaw(" front right");
        movePaw(" back left");
        movePaw(" back right");

    }


    public void getPride(){
        System.out.println(pride);
    }

    public void changePride(String s){
        pride= s;
    }
}
