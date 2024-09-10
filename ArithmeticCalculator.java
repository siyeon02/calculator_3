package calculator_3;


public class ArithmeticCalculator {
    public String operator;
    public double firstOperand;
    public double secondOperand;

    public double calculate(double firstOperand, double secondOperand, String operator){

        OperatorType operatorType = OperatorType.valueOf(operator);


            switch (operatorType){
                case ADD :
                    return OperatorType.ADD.calculate(firstOperand, secondOperand);
                case SUBTRACT:
                    return OperatorType.SUBTRACT.calculate(firstOperand, secondOperand);
                case MULTIPLY:
                    return OperatorType.MULTIPLY.calculate(firstOperand, secondOperand);
                case DIVIDE:
                    return OperatorType.DIVIDE.calculate(firstOperand, secondOperand);

                default:
                    throw new IllegalStateException("Unexpected value: " + operatorType);
            }
        }

}
