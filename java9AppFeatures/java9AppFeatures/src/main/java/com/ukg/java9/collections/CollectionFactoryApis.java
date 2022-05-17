package com.ukg.java9.collections;

import java.util.List;
import java.util.Set;

public class CollectionFactoryApis {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        numbers.forEach(System.out::println);
        //It is error : un modifiable list
//         numbers.add(90);
        numbers.forEach(System.out::println);

        Set.of(2,3,4).forEach(System.out::println);
    }
}
