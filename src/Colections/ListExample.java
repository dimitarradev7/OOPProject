package Colections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by dimitarrad
 * on 1/18/2021
 */
public class ListExample {
    public static final double  STOP_NUMBER = -1;

    /*Създайте програма, която взема от потребителя неопределен брой числа, докато не бъде въведено -1.
    При въвеждане на -1 от потребителя, числата, които той е въвел да бъдат изписани в обратен ред,
    както и да се намери най-малкото въведено число и да се принтира.*/
    public static void main(String[] args) {

        Scanner  scanner  = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();

        while (true)
        {
            System.out.println("Insert number: ");
            double inputNum = scanner.nextDouble();

                if (inputNum == STOP_NUMBER){
                    break;
                }
            numbers.add(inputNum);

        }

        System.out.println("The result is:");

        for (int i = numbers.size()-1; i>=0 ; i--) {

            System.out.println(numbers.get(i));

        }

        Collections.sort(numbers);
        if (numbers.size()>0) {

            System.out.println("Min number ="+numbers.get(0));
        }else {
            System.out.println("list is null");
        }

    }
}
