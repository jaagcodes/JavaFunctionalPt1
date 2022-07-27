package combinatorpattern;

import java.time.LocalDate;
import combinatorpattern.CustomerRegistrationValidator.*;
import static combinatorpattern.CustomerRegistrationValidator.isAnAdult;
import static combinatorpattern.CustomerRegistrationValidator.isEmailValid;
import static combinatorpattern.CustomerRegistrationValidator.isPhoneValid;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+08989898987",
                LocalDate.of(2000, 1, 1)
        );

//        CustomerValidatorService validatorService = new CustomerValidatorService();
//        System.out.println(validatorService.isValid(customer));
        //Using combinator pattern
        ValidationResult result = isEmailValid()
                .and(isPhoneValid())
                .and(isAnAdult())
                .apply(customer);
        System.out.println("result = " + result);

        if (result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }
    }
}
