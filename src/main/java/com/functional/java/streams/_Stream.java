package com.functional.java.streams;

import java.util.List;

public class _Stream {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Elsa", Gender.FEMALE),
                new Person("Lara", Gender.FEMALE),
                new Person("Carlos", Gender.MALE),
                new Person("Vitor", Gender.MALE),
                new Person("Clara", Gender.NOT_INFORMED)

        );

        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);

        System.out.println();


        boolean containsOnlyFemales = people.stream()
                .allMatch(person -> Gender.FEMALE.equals(person.gender));

        System.out.println(containsOnlyFemales);

        boolean containsFemales = people.stream()
                .anyMatch(person -> Gender.FEMALE.equals(person.gender));

        System.out.println(containsFemales);

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
        MALE, FEMALE, NOT_INFORMED
    }
}
