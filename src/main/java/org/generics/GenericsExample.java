package org.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {

        /*
        Printer<Integer> printer = new Printer(10);
        printer.print();

        Printer<String> stringPrinter = new Printer<>("Noob");
        stringPrinter.print();

        Printer<Double> doublePrinter = new Printer<>(33.5);
        doublePrinter.print();
         */

        //----------------------------------

        shout("John", 45);
        shout(57, "John");
        shout(new Cat("Tom", 3), new Cat("Jerry", 2));

        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        printList(intList);


    }

    private static <T, V> void shout(T thingToShout, V otherThingToShout) {
        System.out.println(thingToShout + "!!!");
        System.out.println(otherThingToShout + "???");
    }

    private static void printList(List<?> myList){
        System.out.println();
    }
}
