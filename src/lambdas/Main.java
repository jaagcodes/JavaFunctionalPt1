package lambdas;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        Function<String, String> upperCaseName = name -> {
            //logic
            if (name.isBlank()) {
                throw new IllegalArgumentException("");
            }
            return name.toUpperCase();
        };
    }
}
