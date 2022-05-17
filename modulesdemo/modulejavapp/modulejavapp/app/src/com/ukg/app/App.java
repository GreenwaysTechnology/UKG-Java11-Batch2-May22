package com.ukg.app;

import com.ukg.greeter.Greeter;
//import com.ukg.hello.Hello;

public class App {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayGreet());
//        Hello hello = new Hello();
    }
}
