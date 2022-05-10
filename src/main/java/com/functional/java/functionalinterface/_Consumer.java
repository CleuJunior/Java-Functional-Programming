package com.functional.java.functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        // Normal java
        greetCostumer(new Costumer("Julia", "8888888888"));

        Costumer fernanda = new Costumer("Fernanda", "9999999");
        Costumer alex = new Costumer("Alex", "0000000000");
        Costumer junior = new Costumer("Junior", "0000000000");

        // Consumer Function Interface
        greetCostumerConsumer.accept(fernanda);
        greetCostumerConsumerV2.accept(alex, true);
        greetCostumerConsumerV2.accept(junior, false);


    }

    static Consumer<Costumer> greetCostumerConsumer = custumer ->
            System.out.println("Hello " + custumer.costumerName + ", thanks for registering phone number: "
                    + custumer.costumerPhoneNumber);


    static BiConsumer<Costumer, Boolean> greetCostumerConsumerV2 = (custumer, showPhoneNumber) ->
            System.out.println("Hello " + custumer.costumerName + ", thanks for registering phone number: "
                    + (showPhoneNumber ? custumer.costumerPhoneNumber : "***************"));

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
