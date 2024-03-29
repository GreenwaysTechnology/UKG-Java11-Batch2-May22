package com.ukg.java9.trywithres;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class BeforeJava9TryWithResource {
    public static void main(String[] args) throws IOException {
        System.out.println(readData("test"));
    }

    static String readData(String message) throws IOException {
        Reader inputString = new StringReader(message);
        BufferedReader br = new BufferedReader(inputString);
        try (BufferedReader br1 = br) {
            return br1.readLine();
        }
    }
}
