package com.vinay.calculator.service;

import com.vinay.calculator.util.MathematicalOperation;

public class CalculatorService {

    public static void resetFormula() {

        FormulaBuilder.resetFormula();

    }

    public static String returnFormula(Double number) {

        FormulaBuilder.setOperand(number);
        return FormulaBuilder.getFormula();

    }

    public static String returnFormula(MathematicalOperation mathematicalOperation) {

        FormulaBuilder.setOperator(mathematicalOperation);
        return FormulaBuilder.getFormula();

    }

}
