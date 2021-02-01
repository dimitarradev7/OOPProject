package OOP_01;

public class GSM {
    String model;
    double price;
    int totalCallNumber;
    Battery battery;
    Display display;

    void call(int time){
        if (time>0) {
            totalCallNumber++;
            battery.phoneUsageTime+=time;
        }else
        {
            System.out.println("invalid input");
        }
    }
    void printPhoneDetailInformation(){

        System.out.println("Model: "+model);
        System.out.println("price: "+price);
        System.out.println("totalCallNumber: "+totalCallNumber);
        System.out.println("Battery: ");
        System.out.println("- model: "+battery.model);
        System.out.println("- phoneUsageTime: "+battery.phoneUsageTime);
        System.out.println("- idleTime: "+battery.idleTime);
        System.out.println("Display: ");
        System.out.println("-color : "+display.colors);
        System.out.println("- size: "+display.size);
    }

}

