package com.vinay.calculator.util;

public enum MathematicalOperation {

    ADD(1, "+"),
    SUBTRACT(2, "-"),
    MULTIPLY(3, "*"),
    DIVIDE(4, "/");

    private final int id;
    private final String symbol;

    MathematicalOperation(int id, String symbol) {

        this.id = id;
        this.symbol = symbol;

    }

    public static MathematicalOperation getById(int id) {

        for (MathematicalOperation value : MathematicalOperation.values()) {

            if (value.id == id) {
                return value;
            }

        }

        return null;

    }

    public static MathematicalOperation getBySymbol(String symbol) {

        for (MathematicalOperation value : MathematicalOperation.values()) {

            if (value.symbol.equals(symbol)) {
                return value;
            }

        }

        return null;

    }

    public static String getListOfOperations() {

        StringBuilder listOfOperations = new StringBuilder();
        MathematicalOperation[] operations = MathematicalOperation.values();
        int lastIndex = operations.length - 1;

        for (int i = 0; i < operations.length; i++) {
            MathematicalOperation value = operations[i];
            listOfOperations.append(value.id);
            listOfOperations.append(". ");
            listOfOperations.append(value.name());
            listOfOperations.append(" (");
            listOfOperations.append(value.symbol);
            listOfOperations.append(")");

            // Append newline character only if it's not the last item
            if (i < lastIndex) {
                listOfOperations.append("\n");
            }
        }

        return listOfOperations.toString();

    }

    public int getId() {

        return id;

    }

    public String getSymbol() {

        return symbol;

    }

}
