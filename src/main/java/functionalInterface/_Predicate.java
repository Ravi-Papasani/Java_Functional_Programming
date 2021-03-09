package functionalInterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println("Without Predicate");
        System.out.println(isValidPhoneNumber("919848022338"));
        System.out.println(isValidPhoneNumber("91900000038"));
        System.out.println(isValidPhoneNumber("019848022338"));


        System.out.println("With Predicate");
        System.out.println(isValidPhoneNumberPredicate.test("919848022338"));
        System.out.println(isValidPhoneNumberPredicate.test("91900000038"));
        System.out.println(isValidPhoneNumberPredicate.test("019848022338"));

        System.out.println(
                "Is phone number valid and contains number 3 = " +
                        isValidPhoneNumberPredicate.and(phoneNumberContains3).test("919848022338")
        );

        System.out.println(
                "Is phone number valid or contains number 3 = " +
                        isValidPhoneNumberPredicate.or(phoneNumberContains3).test("91900000038")
        );
    }

    static boolean isValidPhoneNumber(String phoneNumber){
        return phoneNumber.startsWith("91") && phoneNumber.length() == 12;
    }

    static Predicate<String> isValidPhoneNumberPredicate = phoneNumber -> phoneNumber.startsWith("91") && phoneNumber.length() == 12;

    static Predicate<String> phoneNumberContains3 = phoneNumber ->
            phoneNumber.contains("3");
}
