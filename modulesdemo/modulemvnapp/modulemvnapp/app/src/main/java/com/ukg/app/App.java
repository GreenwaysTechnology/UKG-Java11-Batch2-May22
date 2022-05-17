package com.ukg.app;

import com.ukg.greeter.HelloWorld;

public class App {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        System.out.printf(helloWorld.sayHello());
    }
}
