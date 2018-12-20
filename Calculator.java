package com.BryanRijke;

public class Calculator {

    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static int subtract(int number1, int number2) {
        return number1 + -number2;
    }

    public static int multiply(int number1, int number2) {
        int answer = 0;

        for (int i = 0; i < number2; i++) {
            answer = number1 + answer;
        }
        return answer;
    }

    public static int devide(int number1, int number2) {

        int answer = 0;

        while (number1 >= number2) {
            //number1 -= number2;
            number1 = subtract(number1, number2);
            answer++;
        }

        return answer;
    }

    public static int square(int number1) {

        return multiply(number1, number1);
    }

    public static int exponentiation(int number1, int number2) {

        int answer = 1;

        while (number2 > 0) {
            answer = multiply(answer, number1);
            number2--;
        }
        return answer;
    }

}
