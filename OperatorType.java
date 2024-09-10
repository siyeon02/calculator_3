package calculator_3;

import java.util.function.BiFunction;

public enum OperatorType {
    ADD("+", (num1, num2)-> (num1 + num2)),
    SUBTRACT("-", (num1, num2)-> num1 - num2),
    DIVIDE("/", (num1, num2)-> num1 / num2),
    MULTIPLY("*", (num1, num2)-> num1 * num2);

    public final String operator;
    private final BiFunction<Double, Double, Double> biFunction;

    OperatorType(String operator, BiFunction<Double, Double, Double> biFunction){
        this.operator = operator;
        this.biFunction = biFunction;
    }

    public double calculate(double a, double b){
        return this.biFunction.apply(a,b);
    }

}
