package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        //Imperative
        System.out.println("Imperative:");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("09009730000"));
        System.out.println(isPhoneNumberValid("0900973000055"));
        System.out.println("");

        //Declarative
        System.out.println("Declarative:");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09009730000"));
        System.out.println(isPhoneNumberValidPredicate.test("0900973000055"));
        System.out.println("");
        
        System.out.println("Chaining Predicates:");
        System.out.println(
                "Is phone number valid and contains number 3 = "
                + isPhoneNumberValidPredicate.and(containsNumber3).test("07000000300")
        );
        
        

    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber
            -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber
            -> phoneNumber.contains("3");
}
