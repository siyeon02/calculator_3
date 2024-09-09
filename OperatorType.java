package calculator_3;

public enum OperatorType {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/");
    final private String operator;

    OperatorType(String operator){
        this.operator = operator;
    }

    String getOperator(){
        return operator;
    }
}
