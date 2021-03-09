package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        // Normal Java Calling Function
        Customer john = new Customer("John", "9848022338");
        greetCustomer(john);

        // Consumer Functional Interface
        greetConsumerCustomer.accept(john);

        // Normal Java Calling Function
        Customer bi_john = new Customer("John", "9848022338");
        greetBiCustomer(bi_john, false);

        // BiConsumer Functional Interface
        greetBiConsumerCustomer.accept(bi_john, false);

    }

    static class Customer {
        private String customerName;
        private String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }

    // Imperative
    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName + " Thanks for your registration " + customer.customerPhoneNumber);
    }

    // Consumer Declarative
    static Consumer<Customer> greetConsumerCustomer = customer ->
            System.out.println("Hello " + customer.customerName + " Thanks for your registration " + customer.customerPhoneNumber);

    // Imperative
    static void greetBiCustomer(Customer customer, boolean showPhoneNumber){
        System.out.println("Hello " + customer.customerName + " Thanks for your registration " + (showPhoneNumber ? customer.customerPhoneNumber : "**********"));

    }

    // BiConsumer Declarative
    static BiConsumer<Customer, Boolean> greetBiConsumerCustomer = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.customerName + " Thanks for your registration " + (showPhoneNumber ? customer.customerPhoneNumber : "**********"));

}
