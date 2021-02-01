package OOP_Inheritance;

import OOP_01.Person;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
   List<Integer> arraylist = new ArrayList<Integer>();


        try {
            method1();
        }catch (NullPointerException | IndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }catch (RuntimeException ex){
            System.out.println("RuntimeException "+ ex.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    static void method1() throws Exception {

      try   { method2();}
      catch (RuntimeException ex){
          System.out.println("method2() thrown exception");
          throw ex;

      }

        System.out.println("method2 is called!");
    }

    static void method2() throws Exception {
        method3();
        System.out.println("method3 is called!");
    }

    static void method3() throws Exception{
        System.out.println("method3 before");
        throw  new IllegalArgumentException (" Method3 throw exception");

    }

}
