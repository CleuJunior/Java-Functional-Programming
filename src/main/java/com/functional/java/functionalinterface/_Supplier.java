package com.functional.java.functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());

        System.out.println(getDBConnectionUrlSupplier.get());

        System.out.println();
        System.out.println("Return a List");
        System.out.println(listOfEmails.get());
    }

    static String getDBConnectionUrl() {
        return "jbc://localhost:5432/user";
    }

    static Supplier<String> getDBConnectionUrlSupplier = () -> "jbc://localhost:5432/user";

    static Supplier<List<String>> listOfEmails = () -> List.of(
            "nelson.raimundo.ramos@homtail.com",
            "otavio.marcelo.assuncao@naressi.com.br",
            "danielasophiabaptista@gerdau.com.br"
    );
}
