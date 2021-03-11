package optionals;

import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("Ravi", "ravi@gmail.com");
        //Person p2 = new Person("Teja", "TEJU@GMAIL.COM");
        Person p2 = new Person("Teja", null);
        System.out.println(p1.email.toLowerCase());
        //System.out.println(p2.getEmail().map(email->email.toLowerCase()).orElse("email not provided"));
        String emailaddress = p2
                .getEmail()
                .map(String::toLowerCase)
                .orElse("email not provided");
        System.out.println(emailaddress);

        // Using Imperative Approach
        if(p2.getEmail().isPresent()){
            String email = p2.getEmail().get();
            System.out.println(email);
        }else {
            System.out.println("email not provided");
        }
    }

    static class Person{
        private final String name;
        private final String email;

        public Person(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public Optional<String> getEmail() {
            return Optional.ofNullable(email);
        }
    }
}
