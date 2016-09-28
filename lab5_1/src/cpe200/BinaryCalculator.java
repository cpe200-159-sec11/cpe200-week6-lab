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
        String s1 = firstOperand.getOperand();
        String s2 = secondOperand.getOperand();
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        if(d1<0 || d2<0)
        {
            throw new RuntimeException();
        }
        return Integer.toString((int)(d1+d2));

    }

    public String subtract() throws RuntimeException {
        String s1 = firstOperand.getOperand();
        String s2 = secondOperand.getOperand();
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        if(d1<0 || d2<0)
        {
            throw new RuntimeException();
        }
        return Integer.toString((int)(d1-d2));
    }

    public String multiply() throws RuntimeException {
        String s1 = firstOperand.getOperand();
        String s2 = secondOperand.getOperand();
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        if(d1<0 || d2<0)
        {
            throw new RuntimeException();
        }
        return Integer.toString((int)(d1*d2));
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        String s1 = firstOperand.getOperand();
        String s2 = secondOperand.getOperand();
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        if(d1 <= 0 || d2 <= 0)
        {
            throw new ArithmeticException();
        }
        if(d2 == 0)
        {
            int x=(int)(d1)/0;
            //  System.out.print("The operation must raise an exception");
            return Integer.toString(x);
        }else if(d1%d2 == 0){
            return Integer.toString((int)(d1/d2));
        }else{
            double x;
            x = (d1/d2)*100000;
            x = Math.round(x);
            x /=100000;
            return Double.toString(x);
        }
    }

    public String power() throws RuntimeException {
        double a,b;
        int x=1;
        a = Double.parseDouble(firstOperand.getOperand());
        b = Double.parseDouble(secondOperand.getOperand());
        if(a <0 ||b<0)
        {
            throw new RuntimeException();
        }
        for(int i=0;i<(int)(b);i++)
        {
            x *= a ;
        }
        return Integer.toString(x);
    }

}
