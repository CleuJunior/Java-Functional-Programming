package com.functional.java.functionalinterface;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        // Normal java
        greetCostumer(new Costumer("Julia", "8888888888"));

        Costumer julia = new Costumer("Julia", "8888888888");

        // Consumer Function Interface
        greetCostumerConsumer.accept(julia);


    }

    static Consumer<Costumer> greetCostumerConsumer = costumer ->
            System.out.println("Hello " + costumer.costumerName + ", thanks for registering phone number: "
                    + costumer.costumerPhoneNumber);

    static void greetCostumer(Costumer costumer) {
        System.out.println("Hello " + costumer.costumerName + ", thanks for registering phone number: "
                + costumer.costumerPhoneNumber);
    }

    static class Costumer {
        private final String costumerName;
        private final String costumerPhoneNumber;

        public Costumer(String costumerName, String costumerPhoneNumber) {
            this.costumerName = costumerName;
            this.costumerPhoneNumber = costumerPhoneNumber;
        }


    }
}
