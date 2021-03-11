package combinatordesignpattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+0898787879878",
                LocalDate.of(2015, 1,1)
        );
        Customer customer1 = new Customer(
                "Alice",
                "alicegmail.com",
                "+0898787879878",
                LocalDate.of(2000, 1,1)
        );

        //CustomerValidatorService validatorService = new CustomerValidatorService();
        //validatorService.isValid(customer);
        System.out.println(new CustomerValidatorService().isValid(customer));

        // if customer data is valid, then we can store customer in db

        // Combination Pattern
        CustomerRegistrationValidator.ValidationResult result = CustomerRegistrationValidator
                .isEmailValid()
                .and(CustomerRegistrationValidator.isPhoneNumberValid())
                .and(CustomerRegistrationValidator.isAnAdult())
                .apply(customer); //invoke the method {result.}

        System.out.println(result);


        // Using combinator pattern
//        ValidationResult result = isEmailValid()
//                .and(isPhoneNumberValid())
//                .and(isAnAdult())
//                .apply(customer);
//
//        System.out.println(result);

        if (result != CustomerRegistrationValidator.ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }
    }
}
