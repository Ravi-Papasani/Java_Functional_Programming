package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<Object> empty = Optional.empty();

        // System.out.println(empty.isPresent());
        // System.out.println(empty.isEmpty());


        Optional<String> val = Optional.of("Hello");

        // System.out.println(val.isPresent());
        // System.out.println(val.isEmpty());

        //Optional<Object> nul = Optional.ofNullable(null);
        Optional<Object> nul = Optional.ofNullable("Hi");

         System.out.println(nul.isPresent());
         System.out.println(nul.isEmpty());

//         nul.ifPresentOrElse( iff -> {
//             System.out.println(iff);
//         }, () -> System.out.println("else"));


       // nul.ifPresentOrElse(System.out::println, () -> System.out.println("else"));



        Optional.ofNullable(null)
                .ifPresentOrElse(
                        email -> System.out.println("Sending email to " + email),
                        () -> System.out.println("Cannot send email"));


        Optional.ofNullable("Ravi@gmail.com")
                .ifPresentOrElse(
                        email -> System.out.println("Sending email to " + email),
                        () -> System.out.println("Cannot send email"));

    }
}
