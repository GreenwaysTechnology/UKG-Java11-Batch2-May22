package com.ukg.java9.safevarargsann;

import java.util.ArrayList;
import java.util.List;

public class SafeVarArgAnnotation {
    // Applying @SaveVarargs annotation
    @SafeVarargs
    private void display(List<String>... products) { // Not using @SaveVarargs
        for (List<String> product : products) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        SafeVarArgAnnotation p = new SafeVarArgAnnotation();
        List<String> list = new ArrayList<String>();
        list.add("Laptop");
        list.add("Tablet");
        p.display(list);
    }
}
