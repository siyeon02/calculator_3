package calculator_3;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArithmeticCalculator calc = new ArithmeticCalculator();
        Scanner sc = new Scanner(System.in);
        Generic<Integer> integerGeneric = new Generic<>();
        Generic<String> operator = new Generic<>();

        boolean flag = false;

        while(!flag){
            System.out.println("종료는 exit 입력/종료 원치 않으면 아무키나 입력: ");
            String text = sc.next();
            if (text.equals("exit")) {
                break;
            }

            System.out.println("첫번째 양수를 입력하시오 : ");
            int a = sc.nextInt();
            integerGeneric.setT(a);

            System.out.println("연산자를 입력하시오 : ");
            String o = sc.next();
            operator.setT(o);

            System.out.println("두번째 양수를 입력하시오 : ");
            int b = sc.nextInt();
            integerGeneric.setT(b);

            System.out.println("결과 : " + calc.calculate(a, b, o));

        }

    }
}
