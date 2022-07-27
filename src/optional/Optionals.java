package optional;

import java.util.Optional;

public class Optionals {

    public static void main(String[] args) {
        Optional<String> hello = Optional.ofNullable(null);
        //Tells us if there is a value inside the Optional
        System.out.println(hello.isPresent());
        //Tells if is empty
        System.out.println(hello.isEmpty());

        //Get the param as a value if its empty
        String orElse = hello
                .map(String -> String.toUpperCase())
                .orElseGet(() -> {
                    // ... extra computation to retrieve the value
                    return "world";
                });
        System.out.println(orElse);

        hello.ifPresent(word -> {
            System.out.println(word);
        });

        hello.ifPresentOrElse(System.out::println, () -> System.out.println("world"));
    }

}
