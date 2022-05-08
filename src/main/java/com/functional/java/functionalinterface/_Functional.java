package com.functional.java.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Functional {
    public static void main(String[] args) {
        // Function takes 1 argument and produces 1 result
        int incrementation = incrementByOne(1);

        System.out.println(incrementation);

       int incrementation2 =  incrementByOneFunction.apply(1);

        System.out.println(incrementation2);

        int multiple = multipleBy10Function.apply(10);
        System.out.println(multiple);


        Function<Integer, Integer> addByOneAndThenMultipleBy10 = incrementByOneFunction.andThen(multipleBy10Function);

        System.out.println(addByOneAndThenMultipleBy10.apply(4));

        // BiFunction
        // Function takes 2 argument and produces 1 result

        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 100));
        System.out.println(incrementByOneAndMultiply(4, 100));


    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number +1;

    static Function<Integer, Integer> multipleBy10Function = number -> number * 10;
    static int incrementByOne(int number) {
        return number +1;
    }

    static int incrementByOneAndMultiply(int number, int numberToMultiply) {
        return (number +1) * numberToMultiply;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiply) -> (numberToIncrementByOne + 1) * numberToMultiply;
}
