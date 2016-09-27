package cpe200;


public class BinaryCalculator {
    private IOperand firstOperand;
    private IOperand secondOperand;

    public BinaryCalculator() {
    }

    public void setFirstOperand(IOperand operand) {
        this.firstOperand = operand;
    }

    public void setSecondOperand(IOperand operand) {
        this.secondOperand = operand;
    }

    public String add() throws RuntimeException {
        double num1,num2,hold;
        String ans;
        num1 = Double.parseDouble(firstOperand.getOperand());
        num2 = Double.parseDouble(secondOperand.getOperand());
        if(num1 < 0 || num2 < 0)
        {
            throw new RuntimeException();
        }
        hold = num1 + num2;
        hold = (double)Math.round(hold * 100000d) / 100000d;
        if(hold*10%10 == 0)
        {
            int hold2 = ((int) hold);
            ans = Integer.toString(hold2);
        }
        else ans = Double.toString(hold);
        return ans;
    }

    public String subtract() throws RuntimeException {
        double num1,num2,hold;
        String ans;
        num1 = Double.parseDouble(firstOperand.getOperand());
        num2 = Double.parseDouble(secondOperand.getOperand());
        if(num1 < 0 || num2 < 0)
        {
            throw new RuntimeException();
        }
        hold = num1 - num2;
        hold = (double)Math.round(hold * 100000d) / 100000d;
        if(hold*10%10 == 0)
        {
            int hold2 = ((int) hold);
            ans = Integer.toString(hold2);
        }
        else ans = Double.toString(hold);
        return ans;
    }

    public String multiply() throws RuntimeException {
        double num1,num2,hold;
        String ans;
        num1 = Double.parseDouble(firstOperand.getOperand());
        num2 = Double.parseDouble(secondOperand.getOperand());
        if(num1 < 0 || num2 < 0)
        {
            throw new RuntimeException();
        }
        hold = num1 * num2;
        hold = (double)Math.round(hold * 100000d) / 100000d;
        if(hold*10%10 == 0)
        {
            int hold2 = ((int) hold);
            ans = Integer.toString(hold2);
        }
        else ans = Double.toString(hold);
        return ans;
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        double num1,num2,hold;
        String ans;
        num1 = Double.parseDouble(firstOperand.getOperand());
        num2 = Double.parseDouble(secondOperand.getOperand());
        if(num1 < 0 || num2 < 0)
        {
            throw new RuntimeException();
        }

        if(num2 == 0)
        {
            throw new ArithmeticException();
        }
        hold = num1/num2;
        hold = (double)Math.round(hold * 100000d) / 100000d;
        if(hold*10%10 == 0)
        {
            int hold2 = ((int) hold);
            ans = Integer.toString(hold2);
        }
        else ans = Double.toString(hold);
        return ans;
    }

    public String power() throws RuntimeException {
        double num1,num2,hold;
        String ans;
        num1 = Double.parseDouble(firstOperand.getOperand());
        num2 = Double.parseDouble(secondOperand.getOperand());
        if(num1 < 0 || num2 < 0)
        {
            throw new RuntimeException();
        }
        hold = Math.pow(num1,num2);
        hold = (double)Math.round(hold * 100000d) / 100000d;
        if(hold*10%10 == 0)
        {
            int hold2 = ((int) hold);
            ans = Integer.toString(hold2);
        }
        else ans = Double.toString(hold);
        return ans;
    }

}
