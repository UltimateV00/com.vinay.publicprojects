package com.vinay.calculator.service;

import com.vinay.calculator.util.MathematicalOperation;

public class FormulaBuilder {

    private static Double operand1 = null;
    private static Double operand2 = null;
    private static MathematicalOperation operator = null;

    public static void resetFormula() {

        operand1 = null;
        operand2 = null;
        operator = null;

    }

    public static void setOperand(Double number) {

        if (operand1 == null) {
            operand1 = number;
        } else {
            operand2 = number;
        }

    }

    public static void setOperator(MathematicalOperation mathematicalOperation) {

        operator = mathematicalOperation;

    }

    public static String getFormula() {

        String formula = "";

        formula += (operand1 != null) ? operand1 : "?";
        formula += " ";
        formula += (operator != null) ? operator.getSymbol() : "?";
        formula += " ";
        formula += (operand2 != null) ? operand2 : "?";

        return formula;

    }

}
