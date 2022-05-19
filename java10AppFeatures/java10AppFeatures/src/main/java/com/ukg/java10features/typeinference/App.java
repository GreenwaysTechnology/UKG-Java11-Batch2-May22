package com.ukg.java10features.typeinference;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class FlightService {

    //instance variables cant be declared with var
    //var flight = 11;

    public String getInfo() {
        var info = "Info";
        return info;
    }

    //get Flight information
    public void getFlightInfo() {
        //old java
        //Integer flightNo = 1000;
        var flightNo = 1000;
        var flightName = "Indigo A1";
        var isAvailable = true;
//        List<String> airlines = List.of("Indio", "AirIndia", "British Airlines");
        var airlines = List.of("Indio", "AirIndia", "British Airlines");
        //streams
        var stream = airlines.stream();
        var airline = stream.filter(items -> items.contains("Indio")).collect(Collectors.toList());
        System.out.println(airline);

        System.out.println("Flight No " + flightNo);
        System.out.println("Flight FlightName " + flightName);

        var list = new ArrayList<>();
        list.add("Ticket 1");
        list.add(12);
        list.add(45);
        System.out.println(list);
    }
}

@FunctionalInterface
interface Greeter {
    String greet();
}

interface Flyable {
    void fly();
}

class Flight implements Flyable {
    @Override
    public void fly() {
        System.out.println("Flight is flying");
    }
}

class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}

public class App {
    public static void main(String[] args) {
        //FlightService flightService = new FlightService();
        var flightService = new FlightService();
        flightService.getFlightInfo();

        //var and lambda expression
        Greeter greeter = new Greeter() {
            @Override
            public String greet() {
                return "Hello";
            }
        };
        System.out.println(greeter.greet());

        var greeter1 = new Greeter() {
            @Override
            public String greet() {
                return "Hello";
            }
        };
        System.out.println(greeter1.greet());

        //lambda
        Greeter greeter2 = () -> "Hello";
        System.out.println(greeter2.greet());

        //var will not work with lambda type
//        var greeter3 = () -> "Hello";
//        System.out.println(greeter2.greet());

        //var cant hold null
//        var newFlightService = null;
//        newFlightService = new FlightService();

        //var must be initialized
        // var newFlightService;

        //var cant be used with super Type; runtime polymorphism
//        Flyable flyable = new Flight();
//        var flyable = new Flight();
//
//        flyable.fly();
//
//        flyable = new Bird();
//        flyable.fly();

        //loops and var
        //var i = 10;
        //inside loop
        for (var i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
