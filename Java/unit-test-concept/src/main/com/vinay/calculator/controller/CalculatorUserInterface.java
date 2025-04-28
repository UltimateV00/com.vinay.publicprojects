package com.vinay.calculator.controller;

import com.vinay.calculator.util.MathematicalOperation;

import java.util.Scanner;

public class CalculatorUserInterface {

    public static void printStartMessage() {

        System.out.println();
        System.out.println("Starting Calculator!");
        System.out.println("---------------------");
        System.out.println("Enter numbers to perform calculations, or type 'exit' to quit.");

    }

    public static void printExitMessage() {

        System.out.println();
        System.out.println("---------------------");
        System.out.println("Exiting Calculator!");

    }

    public static Double inputNumber(Scanner scanner) {

        Double num = null;
        String inputLine;

        while (num == null) {

            System.out.println();
            System.out.println("Enter a number:");
            inputLine = scanner.nextLine().trim().toLowerCase();

            if (inputLine.equals("exit")) {
                return null;
            }

            try {
                num = Double.parseDouble(inputLine);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please try again.");
            }

        }

        return num;

    }

    public static MathematicalOperation inputChoiceOfOperation(Scanner scanner) {

        MathematicalOperation mathematicalOperation = null;
        String inputLine;

        while (mathematicalOperation == null) {

            System.out.println();
            System.out.println(MathematicalOperation.getListOfOperations());
            System.out.println("Enter your choice (Id):");
            inputLine = scanner.nextLine().trim().toLowerCase();

            if (inputLine.equals("exit")) {
                return null;
            }

            try {
                mathematicalOperation = MathematicalOperation.getById(Integer.parseInt(inputLine));
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice. Please try again.");
            }

        }

        return mathematicalOperation;

    }

    public static void printFormula(String formula) {

        System.out.println("Formula: " + formula);

    }

    public static boolean inputChoiceToContinue(Scanner scanner) {

        String inputLine;

        System.out.println();
        System.out.println("Do you want to continue? (y or Y)");
        inputLine = scanner.nextLine().trim().toLowerCase();

        return inputLine.equalsIgnoreCase("y");

    }

}
