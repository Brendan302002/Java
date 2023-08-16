package Project2.Project;

//Authors: Jaden Bigos, Brendan Goddard
//Date: 8/8/2023

public class Calculator {
    private double register;
    private int accumulator;
    private String currentOP;
    private boolean isNeg;
    private double result;

    public Calculator () {
        register = 0;
        accumulator = 0;
        currentOP = null;
        isNeg = false;
    }

    public void toggleNeg() {
        isNeg = !isNeg;
    }

    public void clearReg() {
        register = 0;
    }

    public void cleanACC() {
        accumulator = 0;
    }

    public void clearAll() {
        register = 0;
        accumulator = 0;
        currentOP = null;
    }

    public double performOperation(double firstOp, double secondOp, String currentOp) {
        
        if (currentOp.equals("+")) {
            result = firstOp + secondOp;
        } else if (currentOp.equals("-")) {
            result = firstOp - secondOp;
        } else if (currentOp.equals("*")) {
            result = firstOp * secondOp;
        } else if (currentOp.equals("/")) {
            if (secondOp != 0) {
                result = firstOp / secondOp;
            } else {
                throw new IllegalOperationException("Division by zero");
            }
        }
        
        return result;
    }

    public String convertToHex(int value) {
        return Integer.toHexString(value);
    }

    public String convertToDex(int value) {
        return Integer.toString(value);
    }

    public String convertToBin(int value) {
        return Integer.toBinaryString(value);
    }

    public String convertToOct(int value) {
        return Integer.toOctalString(value);
    }
}
