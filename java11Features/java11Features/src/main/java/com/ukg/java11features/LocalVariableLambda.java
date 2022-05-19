package com.ukg.java11features;

@FunctionalInterface
interface Welcome {
    void sayHello(String message, String name);
}

public class LocalVariableLambda {
    public static void main(String[] args) {
        Welcome welcome = null;
        welcome = new Welcome() {
            @Override
            public void sayHello(String message, String name) {
                System.out.println(name + " " + message);
            }
        };
        welcome.sayHello("Hello","Subramanian");

        welcome = (String message, String name) -> System.out.println(name + " " + message);
        welcome.sayHello("Hello", "Subramanian");
        welcome = (message, name) -> System.out.println(name + " " + message);
        welcome.sayHello("Hello", "Subramanian");
        //Lambda
        welcome = (var message, var name) -> System.out.println(name + " " + message);
        welcome.sayHello("Hello", "Subramanian");


    }
}
