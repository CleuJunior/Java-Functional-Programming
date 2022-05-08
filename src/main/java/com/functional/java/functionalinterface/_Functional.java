package com.functional.java.functionalinterface;

import java.util.function.Function;

public class _Functional {
    public static void main(String[] args) {
        int incrementation = incrementByOne(1);

        System.out.println(incrementation);

       int incrementation2 =  incrementByOneFunction.apply(1);

        System.out.println(incrementation2);

        int multiple = multipleBy10Function.apply(10);
        System.out.println(multiple);


        Function<Integer, Integer> addByOneAndThenMultipleBy10 = incrementByOneFunction.andThen(multipleBy10Function);

        System.out.println(addByOneAndThenMultipleBy10.apply(4));

    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number +1;

    static Function<Integer, Integer> multipleBy10Function = number -> number * 10;
    static int incrementByOne(int number) {
        return number +1;
    }
}
