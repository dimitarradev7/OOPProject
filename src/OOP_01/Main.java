package OOP_01;

public class Main {
    public static void main(String[] args) {



        Person p = new Person("Gosho");


        //System.out.println(Person.canBreathe);
       Car car = new Car("BMW",true,"Red",5000, 300);
        Car car2 = new Car("BMW",true,"Red",5000, 300);
        Car car1 = new Car("Audi",true,"black",10000,240);
        car1.owner= p;

        Person mother  = new Person("Maria");
        mother.money= 20000;
        System.out.println("Initial money: " +mother.money);
        mother.buyCar(car1);

        System.out.println("Money buy: "+mother.money);
        mother.sellCarForScrap();
        System.out.println("Money after sale: "+mother.money);

        if (mother.car==null){
            System.out.println("no car");
        }else   {
            System.out.println("has car");
        }




        /*Person baby = new Person("Misho",43434,true);
        System.out.println( baby.name);
        System.out.println( baby.weight);
        System.out.println( baby.isMale);
        System.out.println( baby.personalNumber);
        System.out.println( baby.age);
        baby.friends[0]=mother;

        System.out.println( baby.friends[0].name);

        mother.friends[0]=baby;

        System.out.println( mother.friends[0].name);
        int num = baby.getFriendsNum();
        System.out.println(num);*/


    }

    public static class Car {

        String model;
        int maxSpeed;
        int currentSpeed;
        String color;
        int currentGear;
        Person owner;
        double price;
        boolean isSportsCar;

        public Car(){

        }
        public Car(String model, boolean isSportsCar,
            String color){
            this.model = model;
            this.isSportsCar =  isSportsCar;
            this.color = color;
        }

        public Car(String model, boolean isSportCar, String
                color, double price, int maxSpeed){
            this(model,isSportCar,color);
            this.price = price;
            if (!this.isSportsCar && maxSpeed>200) {
                this.maxSpeed = 200;
            }else {
                this.maxSpeed = maxSpeed;
            }

        }


        int accelerate() {
            currentSpeed += 10;
            System.out.println("new speed is:" + currentSpeed);
            return currentSpeed;
        }

        void changeGearUp() {

            if (currentGear < 5 && currentGear >= 0) {
                currentGear++;

                System.out.println("gear up :" + currentGear);

            } else {
                System.out.println("do nothing");
            }
        }

        void changeGearDown() {
            if (currentGear > 1) {
                System.out.printf("gear down");
                currentGear--;
            }

        }

        void changeGear(int nextGear) {
            if (nextGear > 1 && nextGear <= 5) {
                currentGear = nextGear;
            } else {
                System.out.printf("Invalid gear");
            }
        }

        void changeColor(String newColor) {
            //validation
            System.out.printf("model %s is with OLD color %s%n", model, color);
            color = newColor;
            System.out.printf("model %s is with color %s%n", model, color);
        }
        boolean isMoreExpensive(Car car){
            if (this.price>car.price){
                System.out.println("yes");
                return true;
            }else {
                System.out.println("no");
                return false;
            }
        }

        double calculateCarPriceForScrap(double metalPrice){
            double coef = 0.2;
            double result= 0;
            if (this.color.equalsIgnoreCase("black")){
                coef+=0.5;
            }
            if (this.isSportsCar==true){
                coef+=0.5;
            }

            result = metalPrice*coef;
            return result;
        }

         void changeOwner(Person newOwner){
            this.owner =newOwner;
         }





    }
}
