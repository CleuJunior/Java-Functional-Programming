package com.functional.java.optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Object value = Optional.ofNullable("Hello World")
                .orElseGet(() -> "default value");


        Object value2 = Optional.ofNullable("Hello World")
                .orElseThrow(() -> new IllegalArgumentException("Something went Wrong"));


        Optional.ofNullable(null)
                .ifPresent(email -> System.out.println("Email send to " + email));


        Optional.ofNullable(null)
                .ifPresentOrElse(email -> System.out.println("Email send to " + email),
                        () -> System.out.println("Can't send email"));



        System.out.println(value);
        System.out.println(value2);

    }
}
