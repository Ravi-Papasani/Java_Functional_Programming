package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int inc = incrementOne(2);
        System.out.println(inc);

        // Function takes 1 argument and produces 1 result
        int inc1 = incrementByOne.apply(1);
        System.out.println(inc1);

        //Integer mulBy2 = multiplyBy2.apply(3);
        Integer mulBy2 = multiplyBy2.apply(inc1);
        System.out.println(mulBy2);

        //andThen function
        Function<Integer, Integer> incByOneAndMulByTwo = incrementByOne.andThen(multiplyBy2);
        System.out.println(incByOneAndMulByTwo.apply(3));

        // BiFunction takes 2 argument and produces 1 result
        System.out.println(incrementByOneAndMultiply(4, 100));
        // BiFunction takes 2 argument and produces 1 result
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 100)
        );
    }

    //Imperative
    static int incrementOne(int number){
        return number + 1;
    }

    //Declarative
    //https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/package-summary.html
    static Function<Integer, Integer> incrementByOne = number -> number + 1;


    static Function<Integer, Integer> multiplyBy2 = number -> number * 2;


    //Declarative
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

    //Imperative
    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }
}
