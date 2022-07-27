package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        //Function: takes 1 argument and produces one output
        int increment = increment(0);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multiplyByTenFunction.apply(2);
        System.out.println("Function multiply = " + multiply);

        Function<Integer, Integer> addByOneAndThenMultiplyByTen = incrementByOneFunction.andThen(multiplyByTenFunction);

        System.out.println("Function .andThen(): " + addByOneAndThenMultiplyByTen.apply(4));

        //BiFunction: takes 2 arguments and produces one output
        int bi = incrementByOneAndMultiplyBiFunction.apply(1, 10);
        System.out.println("BiFunction = " + bi);

    }

    //Declarative Function
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    //Declarative
    static Function<Integer, Integer> multiplyByTenFunction = number -> number * 10;

    //Declarative BiFunction
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction
            = (numberToIncrementByOne, numberToMultiplyBy)
            -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

    //Imperative
    static int increment(int number) {
        return number + 1;
    }

    //Imperative
    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }

}
