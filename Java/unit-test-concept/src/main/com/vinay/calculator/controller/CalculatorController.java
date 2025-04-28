package com.vinay.calculator.controller;

import com.vinay.calculator.service.CalculatorService;
import com.vinay.calculator.util.MathematicalOperation;

import java.util.Scanner;

public class CalculatorController {

    public static void run() {

        CalculatorUserInterface.printStartMessage();
        Scanner scanner = new Scanner(System.in);
        Double num1;
        Double num2;
        MathematicalOperation mathematicalOperation;
        String formula;
        boolean shouldContinue = true;

        while (shouldContinue) {

            CalculatorService.resetFormula();

            num1 = CalculatorUserInterface.inputNumber(scanner);
            if (num1 == null) {
                CalculatorUserInterface.printExitMessage();
                return;
            }
            formula = CalculatorService.returnFormula(num1);
            CalculatorUserInterface.printFormula(formula);

            mathematicalOperation = CalculatorUserInterface.inputChoiceOfOperation(scanner);
            if (mathematicalOperation == null) {
                CalculatorUserInterface.printExitMessage();
                return;
            }
            formula = CalculatorService.returnFormula(mathematicalOperation);
            CalculatorUserInterface.printFormula(formula);

            num2 = CalculatorUserInterface.inputNumber(scanner);
            if (num2 == null) {
                CalculatorUserInterface.printExitMessage();
                return;
            }
            formula = CalculatorService.returnFormula(num2);
            CalculatorUserInterface.printFormula(formula);

            shouldContinue = CalculatorUserInterface.inputChoiceToContinue(scanner);

        }

        scanner.close();
        CalculatorUserInterface.printExitMessage();

    }

}
