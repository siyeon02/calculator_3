package calculator_3;

import java.util.Scanner;

public class ArithmeticCalculator {
    public String operator;
    public double firstOperand;
    public double secondOperand;

    public double calculate(int firstOperand, int secondOperand, String operator){

        OperatorType[] array = OperatorType.values();

        Scanner sc = new Scanner(System.in);

        for(OperatorType o: array){
            switch (o){
                case ADD :
                    return OperatorType.ADD.calculate(firstOperand, secondOperand);
                case SUBTRACT:
                    return OperatorType.SUBTRACT.calculate(firstOperand, secondOperand);
                case MULTIPLY:
                    return OperatorType.MULTIPLY.calculate(firstOperand, secondOperand);
                case DIVIDE:
                    return OperatorType.DIVIDE.calculate(firstOperand, secondOperand);

                default:
                    throw new IllegalStateException("Unexpected value: " + o);
            }
        }

        return 0;
    }


}
