package cpe200;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BinaryCalculator {
    private IOperand firstOperand;
    private IOperand secondOperand;
    private static final String dotREGEX = "[.]";

    public BinaryCalculator() {
    }

    public void setFirstOperand(IOperand operand) {
        this.firstOperand = operand;
    }


    public void setSecondOperand(IOperand operand) {
        this.secondOperand = operand;
    }

    public String add() {
        String St_sum;
        String first = firstOperand.getOperand();
        String second = secondOperand.getOperand();
        Pattern patternf = Pattern.compile(dotREGEX);
        Matcher mf = patternf.matcher(first);
        Pattern patterns = Pattern.compile(dotREGEX);
        Matcher ms= patterns.matcher(second);

        if(mf.find() || ms.find())
        {
            double dfirst = Double.parseDouble(first);
            double dsecond = Double.parseDouble(second);
            if(dfirst<0 || dsecond<0) {
                throw new RuntimeException();
            }
            double sum = dfirst + dsecond;
            sum = sum*100000;
            if((sum*10)%10 >= 5 || (sum*10)%10 <= -5) {
                if(sum>0){sum++; }
                else {sum--; }
            }
            int dec_sum = (int)sum;
            sum = (double)dec_sum/100000;
            if((sum*10)%10 == 0) {
                int hold_sum = (int) sum;
                St_sum = Integer.toString(hold_sum);
            }
            else {
                St_sum = Double.toString(sum);
            }
        }
        else {
            int dfirst = Integer.parseInt(first);
            int dsecond = Integer.parseInt(second);
            if(dfirst<0 || dsecond<0) {
                throw new RuntimeException();
            }
            int sum = dfirst + dsecond;
            St_sum = Integer.toString(sum);
        }


        return St_sum;
    }

    public String subtract() {
        String St_sum;
        String first = firstOperand.getOperand();
        String second = secondOperand.getOperand();
        Pattern patternf = Pattern.compile(dotREGEX);
        Matcher mf = patternf.matcher(first);
        Pattern patterns = Pattern.compile(dotREGEX);
        Matcher ms= patterns.matcher(second);
        if(mf.find() || ms.find())
        {
            double dfirst = Double.parseDouble(first);
            double dsecond = Double.parseDouble(second);
            if(dfirst<0 || dsecond<0) {
                throw new RuntimeException();
            }
            double sum = dfirst - dsecond;
            sum = sum*100000;
            if((sum*10)%10 >= 5 || (sum*10)%10 <= -5 && sum!=0) {
                if(sum>0){sum++; }
                else {sum--; }
            }
            int dec_sum = (int)sum;
            sum = (double)dec_sum/100000;
            if((sum*10)%10 == 0) {
                int hold_sum = (int) sum;
                St_sum = Integer.toString(hold_sum);
            }
            else {
                St_sum = Double.toString(sum);
            };
        }
        else {
            int dfirst = Integer.parseInt(first);
            int dsecond = Integer.parseInt(second);
            if(dfirst<0 || dsecond<0) {
                throw new RuntimeException();
            }
            int sum = dfirst - dsecond;
            St_sum = Integer.toString(sum);
        }


        return St_sum;
    }

    public String multiply() {
        String St_sum;
        String first = firstOperand.getOperand();
        String second = secondOperand.getOperand();
        Pattern patternf = Pattern.compile(dotREGEX);
        Matcher mf = patternf.matcher(first);
        Pattern patterns = Pattern.compile(dotREGEX);
        Matcher ms= patterns.matcher(second);
        if(mf.find() || ms.find())
        {
            double dfirst = Double.parseDouble(first);
            double dsecond = Double.parseDouble(second);
            if(dfirst<0 || dsecond<0) {
                throw new RuntimeException();
            }
            double sum = dfirst * dsecond;
            sum = sum*100000;
            if((sum*10)%10 >= 5 || (sum*10)%10 <= -5 && sum!=0) {
                if(sum>0){sum++; }
                else {sum--; }
            }
            int dec_sum = (int)sum;
            sum = (double)dec_sum/100000;
            if((sum*10)%10 == 0) {
                int hold_sum = (int) sum;
                St_sum = Integer.toString(hold_sum);
            }
            else {
                St_sum = Double.toString(sum);
            }
        }
        else {
            int dfirst = Integer.parseInt(first);
            int dsecond = Integer.parseInt(second);
            if(dfirst<0 || dsecond<0) {
                throw new RuntimeException();
            }
            int sum = dfirst * dsecond;
            St_sum = Integer.toString(sum);
        }


        return St_sum;
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {
        String St_sum;
        String first = firstOperand.getOperand();
        String second = secondOperand.getOperand();
        if(second.equals("0.0")) {
            int nfirst = Integer.parseInt(first);
            int nsecond = Integer.parseInt(second);
            first = Integer.toString(nfirst);
            second = Integer.toString(nsecond);
        }
        Pattern patternf = Pattern.compile(dotREGEX);
        Matcher mf = patternf.matcher(first);
        Pattern patterns = Pattern.compile(dotREGEX);
        Matcher ms= patterns.matcher(second);
        if(mf.find() || ms.find())
        {
            double dfirst = Double.parseDouble(first);
            double dsecond = Double.parseDouble(second);
            if(dfirst<0 || dsecond<=0) {
                throw new RuntimeException();
            }
            double sum = dfirst / dsecond;
            sum = sum*100000;
            if((sum*10)%10 >= 5 || (sum*10)%10 <= -5 && sum!=0) {
                if(sum>0){sum++; }
                else {sum--; }
            }
            int dec_sum = (int)sum;
            sum = (double)dec_sum/100000;
            if((sum*10)%10 == 0) {
                int hold_sum = (int) sum;
                St_sum = Integer.toString(hold_sum);
            }
            else {
                St_sum = Double.toString(sum);
            }
        }
        else {
            int dfirst = Integer.parseInt(first);
            int dsecond = Integer.parseInt(second);
            if(dfirst<0 || dsecond<0) {
                throw new RuntimeException();
            }
            int sum = dfirst / dsecond;
            St_sum = Integer.toString(sum);
        }


        return St_sum;
    }

    public String power() {
        String St_sum;
        String first = firstOperand.getOperand();
        String second = secondOperand.getOperand();

        Pattern patternf = Pattern.compile(dotREGEX);
        Matcher mf = patternf.matcher(first);
        Pattern patterns = Pattern.compile(dotREGEX);
        Matcher ms= patterns.matcher(second);
        if(mf.find() || ms.find())
        {
            double dfirst = Double.parseDouble(first);
            double dsecond = Double.parseDouble(second);
            if(dfirst<0 || dsecond<0) {
                throw new RuntimeException();
            }
            double sum = Math.pow(dfirst,dsecond);
            sum = sum*100000;
            if((sum*10)%10 >= 5 || (sum*10)%10 <= -5 && sum!=0) {
                if(sum>0){sum++; }
                else {sum--; }
            }
            int dec_sum = (int)sum;
            sum = (double)dec_sum/100000;
            if((sum*10)%10 == 0) {
                int hold_sum = (int) sum;
                St_sum = Integer.toString(hold_sum);
            }
            else {
                St_sum = Double.toString(sum);
            }
        }
        else {
            int dfirst = Integer.parseInt(first);
            int dsecond = Integer.parseInt(second);
            if(dfirst<0 || dsecond<0) {
                throw new RuntimeException();
            }
            double sum = Math.pow(dfirst,dsecond);
            int hold_sum = (int) sum;
            St_sum = Integer.toString(hold_sum);
        }


        return St_sum;
    }

}
