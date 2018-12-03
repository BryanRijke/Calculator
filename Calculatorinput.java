package com.BryanRijke;

import java.util.Scanner;

public class Calculatorinput {

    Scanner in = null;
    int first;
    int last;
    char operator;


    public Calculatorinput() {
        in = new Scanner(System.in);
        scanners();
    }

    public void scanners() {
        System.out.println("Berekeningen die je kan doen zijn: + , - , * , / , ², ^");

        System.out.print("Voer een som in: ");
        String input = in.nextLine();

        String split[] = {"E", "E", "E"};

        try {
            split = input.split(" ");
        } catch (Exception e) {
            System.out.println("Error");
        }

        try {
            first = Integer.parseInt(split[0]);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException ex) {

            first = 0;
        }


        try {
            operator = split[1].toCharArray()[0];
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Error");
        }


        try {
            last = Integer.parseInt(split[2]);
        } catch (ArrayIndexOutOfBoundsException e) {

            last = 0;
        }

        if (first == 0 && last == 0) {
            System.out.println("Je kunt geen 0 gebruiken");
        } else {
            processCalculation(operator);
            System.exit(1);
        }
    }

    public void processCalculation(char answer) {

        switch (answer) {
            case '+':
                System.out.println("Antwoord: ");
                System.out.println(com.BryanRijke.Calculator.add(first, last));
                break;
            case '-':
                System.out.println("Antwoord: ");
                System.out.println(com.BryanRijke.Calculator.subtract(first, last));
                break;
            case '*':
                System.out.println("Antwoord: ");
                System.out.println(com.BryanRijke.Calculator.multiply(first, last));
                break;
            case '/':
                System.out.println("Antwoord: ");
                System.out.println(com.BryanRijke.Calculator.devide(first, last));
                break;
            case '²':
                System.out.println("Antwoord: ");
                System.out.println(com.BryanRijke.Calculator.square(first));
                break;
            case '^':
                System.out.println("Antwoord: ");
                System.out.println(com.BryanRijke.Calculator.exponentiation(first, last));
                break;
            default:
                System.out.println("Antwoord: ");
                break;

        }

    }

}

