package com.functional.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.functional.java.Main.Gender.FEMALE;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("John", Gender.MALE),
            new Person("Elsa", FEMALE),
            new Person("Lara", FEMALE),
            new Person("Carlos", Gender.MALE)

        );

        // Imperative approach
        List<Person> females = new ArrayList<>();

        for(Person person: people) {
            if (FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        System.out.println("Imperative");

        for(Person female: females) {
            System.out.println(female);
        }

        // Declarative approach


        System.out.println("Declarative");
        List<Person> femaleDeclarative = people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList());

        femaleDeclarative.forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;


        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
