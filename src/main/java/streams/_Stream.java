package streams;

import java.util.List;

import static streams._Stream.Gender.*;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Ann", FEMALE),
                new Person("Cris", MALE),
                new Person("Alex", MALE),
                new Person("Cathy", FEMALE),
                new Person("Daren", PREFER_NOT_TO_SAY)
        );

        System.out.println("//Declarative Approach");
        //Declarative Approach
        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
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
        MALE, FEMALE, PREFER_NOT_TO_SAY;
    }
}
